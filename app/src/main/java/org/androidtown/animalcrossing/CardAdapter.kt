package org.androidtown.animalcrossing

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.viewpager.widget.PagerAdapter


class CardAdapter : PagerAdapter() {

    private lateinit var models : List<CardModel>
    private lateinit var layoutInflater : LayoutInflater
    private lateinit var context : Context

    fun CardAdapter(model: List<CardModel>, ctx : Context) {
        this.models  = model
        this.context = ctx
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view.equals(obj)
    }

    override fun getCount(): Int {
        return models.size
    }

//    @NonNull
//    @Override
//    fun instantiateItem(@NonNull contiainer : ViewGroup, pos : Int) : Object {
//        val cardview = LayoutInflater.from(context).inflate(org.androidtown.animalcrossing.R.layout.card_view, null)
//    }
}