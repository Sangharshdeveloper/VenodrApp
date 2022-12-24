package com.example.venodrapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.venodrapp.R
import com.example.venodrapp.databinding.ActivityVisitorInfoBinding

class VisitorInfoActivity : AppCompatActivity() {
    lateinit var binding: ActivityVisitorInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVisitorInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnSubmit.setOnClickListener{
            startActivity(Intent(this,ScanthumActivity::class.java))
        }


    }
}