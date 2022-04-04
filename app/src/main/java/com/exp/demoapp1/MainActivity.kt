package com.exp.demoapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var temp: String="8"
        Toast.makeText(applicationContext, "Email is valid", Toast.LENGTH_LONG).show()


    }
}