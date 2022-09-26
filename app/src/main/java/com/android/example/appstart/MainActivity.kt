package com.android.example.appstart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val navigationView =findNavController(R.id.nav_host_fragment)
        //return navigationView.navigate(androidx.navigation.fragment.R.id.nav_host_fragment_container)

    }
}