package com.rosalynbm.samples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //switch.setOnTouchListener { _, event ->
            /*if (event?.action == MotionEvent.ACTION_UP) {
                toggleCoverStatus()
            }*/
            //true
        //}
    }
}