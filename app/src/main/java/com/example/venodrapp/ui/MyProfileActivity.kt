package com.example.venodrapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.venodrapp.R
import com.example.venodrapp.databinding.ActivityMyProfileBinding

class MyProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityMyProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}