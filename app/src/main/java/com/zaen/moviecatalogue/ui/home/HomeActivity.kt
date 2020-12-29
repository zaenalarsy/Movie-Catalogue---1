package com.zaen.moviecatalogue.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zaen.moviecatalogue.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)

        val homePagerAdapter = HomePagerAdapter(this, supportFragmentManager)
        activityHomeBinding.viewPager.adapter = homePagerAdapter
        activityHomeBinding.tabs.setupWithViewPager(activityHomeBinding.viewPager)

        supportActionBar?.elevation = 0f

    }
}