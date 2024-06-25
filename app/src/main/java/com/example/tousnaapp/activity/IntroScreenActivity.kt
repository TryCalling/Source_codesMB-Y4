package com.example.tousnaapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.tousnaapp.databinding.ActivityIntroscreenBinding

class IntroScreenActivity : AppCompatActivity() {
    private var binding: ActivityIntroscreenBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIntroscreenBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        // Simulate a delay using a Handler instead of Thread.sleep
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, HomeScreenActivity::class.java)
            startActivity(intent)
            installSplashScreen()
        }, 1800)

    }

    private fun installSplashScreen() {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null //Release the ViewBinding
    }


}