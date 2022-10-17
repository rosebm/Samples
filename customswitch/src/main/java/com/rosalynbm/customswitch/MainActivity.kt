package com.rosalynbm.customswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rosalynbm.customswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.customSwitch1.setOnCheckedChangeListener { _, isChecked ->
            Log.d("Switch 1", "isChecked = $isChecked")
        }

        binding.customSwitch2.setOnCheckedChangeListener { _, isChecked ->
            Log.d("Switch 2", "isChecked =  $isChecked")
        }

        binding.customSwitch3.setOnCheckedChangeListener { _, isChecked ->
            Log.d("Switch 3", "isChecked =  $isChecked")
        }

        binding.customSwitch4.setOnCheckedChangeListener { _, isChecked ->
            Log.d("Switch 4", "isChecked =  $isChecked")
        }

    }
}