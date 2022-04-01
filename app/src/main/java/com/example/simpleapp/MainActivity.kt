package com.example.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.simpleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)
        val PressedColors= findViewById<TextView>(R.id.ColorPressed)

        binding.btnBlue.setOnClickListener {
            PressedColors.text= resources.getString(R.string.btnBluePressed)
        }
        binding.btnGreen.setOnClickListener {
            PressedColors.text= resources.getString(R.string.btnGreenPressed)
        }
        binding.btnRed.setOnClickListener {
            PressedColors.text= resources.getString(R.string.btnRedPressed)
        }




    }
}