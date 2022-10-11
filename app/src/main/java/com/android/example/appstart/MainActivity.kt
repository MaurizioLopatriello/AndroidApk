package com.android.example.appstart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.example.appstart.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    val stars = listOf<Stars>(
        Stars("Stephenson 2-18",R.drawable.stephenson_two),
        Stars("UY Scuti",R.drawable.uy_scuti),
        Stars("VY Canis Majoris",R.drawable.vy_canismajoris),
        Stars("Betelgeuse",R.drawable.betelgeuse)
    )
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        //val navigationView =findNavController(R.id.nav_host_fragment)
        //return navigationView.navigate(androidx.navigation.fragment.R.id.nav_host_fragment_container)


    }


}

