package com.example.venodrapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.venodrapp.databinding.ActivityThankyouBinding

class ThankyouActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThankyouBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThankyouBinding.inflate(layoutInflater)
        setContentView(binding.root)



        setUpUi()


    }

    private fun setUpUi() {
        binding.btnReturnHome.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}