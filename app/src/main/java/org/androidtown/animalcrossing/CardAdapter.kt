package org.androidtown.animalcrossing

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.viewpager.widget.PagerAdapter

class CardAdapter : PagerAdapter() {

    private lateinit var models : List<String>
    private lateinit var layoutInflater : LayoutInflater
    private lateinit var context : Context

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view.equals(obj)
    }

    override fun getCount(): Int {
        return models.size
    }

}