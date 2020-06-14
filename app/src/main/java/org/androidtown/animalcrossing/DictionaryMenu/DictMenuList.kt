package org.androidtown.animalcrossing.DictionaryMenu

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import org.androidtown.animalcrossing.R

class DictMenuList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dictionary_menu)

        // toolbar 제목 지정
        val title: TextView = findViewById(R.id.toolbar_title)
        title.setText("도감")

        // toolbar backbutton
        val toolbar : MaterialToolbar = findViewById(R.id.material_toolbar)
        toolbar.setNavigationIcon(R.drawable.back_button)
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }
}