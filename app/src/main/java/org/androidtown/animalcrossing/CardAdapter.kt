package org.androidtown.animalcrossing

import android.R
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import org.androidtown.animalcrossing.MainFragment.fragmentIsland
import org.androidtown.animalcrossing.MainFragment.fragmentSlave


class CardAdapter : FragmentPagerAdapter {

    private val list : ArrayList<Fragment> = ArrayList()
    constructor(fragmentManager: FragmentManager) : super(fragmentManager) {
        list.add(fragmentIsland())
        list.add(fragmentSlave())
    }

    override fun getItem(position: Int): Fragment {
        return list.get(position)
    }

    override fun getCount() : Int {
        return list.size
    }
}