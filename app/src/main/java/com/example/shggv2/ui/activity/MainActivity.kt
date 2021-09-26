package com.example.shggv2.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.shggv2.R
import com.example.shggv2.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView




class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment)

        val appBarConfiguration = AppBarConfiguration(
                setOf(R.id.navigation_search, R.id.navigation_rank, R.id.navigation_record, R.id.navigation_friend)
        )

        navView.setupWithNavController(navController)
    }
}