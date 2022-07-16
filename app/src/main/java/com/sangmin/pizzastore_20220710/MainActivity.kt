package com.sangmin.pizzastore_20220710

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import com.sangmin.pizzastore_20220710.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mPagerAdapter: MainViewPagerAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mPagerAdapter


        mainTabLayout.setupWithViewPager(mainViewPager)
    }

    }
