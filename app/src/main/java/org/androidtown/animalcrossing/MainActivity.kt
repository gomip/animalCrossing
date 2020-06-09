package org.androidtown.animalcrossing

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    private lateinit var adapter : CardAdapter
    private lateinit var models : ArrayList<CardModel>
    private lateinit var viewPager : ViewPager2

    var sliderDotspanel : LinearLayout?=null
    private var dotscount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        viewPager = findViewById(R.id.viewPager)
        // sliderDotspanel = findViewById(R.id.slider_dots) 하지만 난 필요가 없다.

        models = ArrayList()
        models.add(CardModel())


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // toolbar 제목 지정
        val toolbar : AppBarLayout = findViewById(R.id.toolbar)
        val title : TextView = findViewById(R.id.toolbar_title)
        title.setText("도감")
    }
}
