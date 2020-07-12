package org.androidtown.animalcrossing

import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.DimenRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.kotlin.createObject
import kotlinx.android.synthetic.main.activity_main.*
import org.androidtown.animalcrossing.DictionaryMenu.DictMenuList
import org.androidtown.animalcrossing.MainFragment.fragmentIsland
import org.androidtown.animalcrossing.MainFragment.fragmentSlave
import org.androidtown.animalcrossing.Realm.UserAccount
import java.lang.Math.abs
import java.sql.Timestamp
/**
 * 20200610 | 김정훈 | 기본 틀 생성
 * 20200614 | gomip | 하단 메뉴 연결 생성
 * 20200712 | gomip | Realm 초기화
 */
class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* ===========================================================================================================================================
                                                                        Realm 초기화

                                                1.realm의 위치를 알고 싶으면 realm.path를 로그 찍으면 된다.
        =========================================================================================================================================== */
        Realm.init(this)
        // Realm 제어를 위한 객체
        val config : RealmConfiguration = RealmConfiguration.Builder().name("animalCrossing.realm").build()
        Realm.setDefaultConfiguration(config)

        // Realm 인스턴스 얻기
        var realm = Realm.getDefaultInstance()

        // Realm 시작
        realm.beginTransaction()
        // 새로운 객체 생성
        var newAccount = realm.createObject(UserAccount::class.java)

        newAccount.slave_id = "SLV0001"
        newAccount.slave_name = "고밉"
        newAccount.island_name = "인센티브제도"
        newAccount.create_dt = Timestamp(System.currentTimeMillis())

        realm.commitTransaction()

        /* ===========================================================================================================================================
                                                                   메인 정보 스크롤 뷰
        =========================================================================================================================================== */
        val pageList = mutableListOf<Fragment>(fragmentIsland(), fragmentSlave())
        viewPager.adapter = CardAdapter(pageList, this)

        // 하나의 view (섬정보 , 주민 정보)가 메인으로 되있으면 다른 하나가 옆에 보이도록 설정
        viewPager.offscreenPageLimit = 1

        val nextItemVisiblePx = resources.getDimension(R.dimen.viewpager_next_item_visible)
        val currentItemHorizontalMarginPx = resources.getDimension(R.dimen.viewpager_current_item_horizontal_margin)
        val pageTranslationX = nextItemVisiblePx + currentItemHorizontalMarginPx
        val pageTransformer = ViewPager2.PageTransformer { page: View, position: Float ->
            page.translationX = -pageTranslationX * position
            // Next line scales the item's height. You can remove it if you don't want this effect
            page.scaleY = 1 - (0.25f * abs(position))
        }
        viewPager.setPageTransformer(pageTransformer)

        // The ItemDecoration gives the current (centered) item horizontal margin so that
        // it doesn't occupy the whole screen width. Without it the items overlap
        val itemDecoration = HorizontalMarginItemDecoration(this, R.dimen.viewpager_current_item_horizontal_margin)
        viewPager.addItemDecoration(itemDecoration)

        // toolbar 제목 지정
        val title : TextView = findViewById(R.id.toolbar_title)
        title.setText("동물의 숲")

        /* ===========================================================================================================================================
                                                                        하단 버튼 리스트
        =========================================================================================================================================== */
        // 하단 이미지 버튼 정의
        val imgDict     : ImageView = findViewById(R.id.img_dictionary)
        val imgVillager : ImageView = findViewById(R.id.img_villager)
        val imgDiy      : ImageView = findViewById(R.id.img_diy)
        val imgCalendar : ImageView = findViewById(R.id.img_calendar)
        val imgRaddish  : ImageView = findViewById(R.id.img_raddish)
        val imgSetting  : ImageView = findViewById(R.id.img_setting)

        // 버튼 화면 전환
        imgDict.setOnClickListener {
            val intent = Intent(applicationContext, DictMenuList::class.java)
            startActivity(intent)
        }
        imgVillager.setOnClickListener {
            Toast.makeText(this@MainActivity, "주민",Toast.LENGTH_SHORT).show()
        }
        imgDiy.setOnClickListener {
            Toast.makeText(this@MainActivity, "DIY",Toast.LENGTH_SHORT).show()
        }
        imgCalendar.setOnClickListener {
            Toast.makeText(this@MainActivity, "달력",Toast.LENGTH_SHORT).show()
        }
        imgRaddish.setOnClickListener {
            Toast.makeText(this@MainActivity, "무값",Toast.LENGTH_SHORT).show()
        }
        imgSetting.setOnClickListener {
            Toast.makeText(this@MainActivity, "설정",Toast.LENGTH_SHORT).show()
        }
    }

    // swipe 하는 view들의 모양
    private class HorizontalMarginItemDecoration(context: Context, @DimenRes horizontalMarginInDp: Int) :
        RecyclerView.ItemDecoration() {

        private val horizontalMarginInPx: Int =
            context.resources.getDimension(horizontalMarginInDp).toInt()

        override fun getItemOffsets(
            outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State
        ) {
            outRect.right = horizontalMarginInPx
            outRect.left = horizontalMarginInPx
        }
    }
}
