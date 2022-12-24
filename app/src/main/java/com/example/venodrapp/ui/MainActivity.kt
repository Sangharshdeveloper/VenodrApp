package com.example.venodrapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.venodrapp.R
import com.example.venodrapp.adapters.VisitorAdapter
import com.example.venodrapp.databinding.ActivityMainBinding
import com.example.venodrapp.databinding.ActivityMyProfileBinding
import com.example.venodrapp.model.Visitor
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var list: ArrayList<Visitor>
    lateinit var adapter: VisitorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpUi()

        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_activity_home)

        navView.setupWithNavController(navController)
    }

    private fun setUpUi() {


    }
}