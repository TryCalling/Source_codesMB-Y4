package com.example.tousnaapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tousnaapp.databinding.ActivityItemPnhompenhBinding

private lateinit var binding: ActivityItemPnhompenhBinding

class ItemPhnomPenhActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemPnhompenhBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}