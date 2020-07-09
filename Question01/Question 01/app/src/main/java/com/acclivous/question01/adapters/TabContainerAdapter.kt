package com.acclivous.question01.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabContainerAdapter(private val mContext: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    var allFragmentList:ArrayList<Fragment> ?= ArrayList()
    var titleList: ArrayList<String> = ArrayList()
    override fun getItem(position: Int): Fragment {
        val frag = allFragmentList!!.get(position)
        return frag
    }

    // This determines the number of tabs
    override fun getCount(): Int {
        return allFragmentList!!.size
    }


    fun addFragment(fragment: Fragment, title: String)
    {
        allFragmentList!!.add(fragment)
        titleList.add(title)
        notifyDataSetChanged()

    }

    // This determines the title for each tab
    override fun getPageTitle(position: Int): CharSequence? {
        // Generate title based on item position

        return titleList.get(position)

    }

}