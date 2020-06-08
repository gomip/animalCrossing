package org.androidtown.animalcrossing

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // toolbar 제목 지정
        val toolbar : AppBarLayout = findViewById(R.id.toolbar)
        val title : TextView = findViewById(R.id.toolbar_title)
        title.setText("도감")
    }
}
