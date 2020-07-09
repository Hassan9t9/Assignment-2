package com.acclivous.question01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acclivous.question01.adapters.TabContainerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val  adapter by lazy {
        TabContainerAdapter(this ,supportFragmentManager)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter.addFragment(JobsFragment(), "JOBS")
        adapter.addFragment(CompaniesFragment(), "COMPANIES")
        adapter.addFragment(SalariesFragment(), "SALARIES")

        view_pager.adapter = adapter

        tabLout.setupWithViewPager(view_pager)
        view_pager.currentItem = 0
    }
}
