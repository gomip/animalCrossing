package org.androidtown.animalcrossing

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.MaterialToolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var models : CardModel

    var sliderDotspanel : LinearLayout?=null
    private var dotscount = 0

    // 이름 저장 -> db로 변경

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = CardAdapter(supportFragmentManager)
        viewPager.adapter = adapter

        // toolbar 제목 지정
        val toolbar : AppBarLayout = findViewById(R.id.toolbar)
        val title : TextView = findViewById(R.id.toolbar_title)
        title.setText("도감")
    }


}
