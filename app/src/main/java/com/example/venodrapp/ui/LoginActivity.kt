package com.example.venodrapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.venodrapp.R
import com.example.venodrapp.databinding.ActivityLoginBinding
import com.example.venodrapp.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnHomeScreen.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))

        }



    }
}