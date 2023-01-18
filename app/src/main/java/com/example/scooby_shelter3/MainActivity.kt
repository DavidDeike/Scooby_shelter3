package com.example.scooby_shelter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.scooby_shelter3.adapter.DogAdapter
import com.example.scooby_shelter3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val dataSource = com.example.scooby_shelter3.data.DataSource()
        val dogList = dataSource.getDogs()

        binding.dogRecycler.adapter = DogAdapter(dogList)
    }
}