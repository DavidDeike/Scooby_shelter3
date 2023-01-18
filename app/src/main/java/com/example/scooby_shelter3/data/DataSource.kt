package com.example.scooby_shelter3.data
import com.example.scooby_shelter3.data.model.Dog
import com.example.scooby_shelter3.R

class DataSource {
    fun getDogs(): List<Dog>{
        return listOf(
            Dog(
                "Fritz",
                48,
                6.5,
                R.drawable.dog1
            ),
            Dog(
                "Luna",
                63,
                5.25,
                R.drawable.dog2
            ),
            Dog(
                "Cupper",
                24,
                6.8,
                R.drawable.dog3
            ),
            Dog(
                "Frida",
                48,
                4.0,
                R.drawable.dog4
            )
        )
    }
}