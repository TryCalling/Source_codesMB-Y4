package com.example.tousnaapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tousnaapp.databinding.ActivityItemProvinceBinding

private lateinit var binding: ActivityItemProvinceBinding

class ItemProvinceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemProvinceBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}