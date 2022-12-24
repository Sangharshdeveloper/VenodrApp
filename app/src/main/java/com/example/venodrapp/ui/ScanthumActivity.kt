package com.example.venodrapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.venodrapp.R
import com.example.venodrapp.databinding.ActivityScanthumBinding

class ScanthumActivity : AppCompatActivity() {

    lateinit var binding: ActivityScanthumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScanthumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpUi()
    }

    private fun setUpUi() {
        binding.btnNext.setOnClickListener{
            startActivity(Intent(this,ThankyouActivity::class.java))
        }
    }
}