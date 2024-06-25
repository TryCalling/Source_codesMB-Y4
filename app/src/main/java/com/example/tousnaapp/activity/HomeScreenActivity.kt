package com.example.tousnaapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.tousnaapp.R
import com.example.tousnaapp.databinding.ActivityHomescreeenBinding
import com.example.tousnaapp.fragment.HomeFragment
import com.example.tousnaapp.fragment.MapFragment
import com.example.tousnaapp.fragment.MoreFragment

class HomeScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomescreeenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomescreeenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set Color_Nav_Bar
        setNavigationBarColor(R.color.primary_color)

        // Set up bottom navigation view
        val bottomNavigationView = binding.btnnavView
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.iconHome -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.iconMap -> {
                    replaceFragment(MapFragment())
                    true
                }
                R.id.iconMore -> {
                    replaceFragment(MoreFragment())
                    true
                }
                else -> false
            }
        }

        // Initial fragment to show (You can customize this based on your app logic)
        replaceFragment(HomeFragment())
    }

    // Set Navigation Bar Color
    private fun setNavigationBarColor(colorId: Int) {
        window.navigationBarColor = resources.getColor(colorId, theme)
    }

    // Replace Fragment in the container
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, fragment)
            .commit()
    }
}
