package com.pavel.demo.ui.features.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.makeText
import com.pavel.demo.DemoApplication
import com.pavel.demo.R
import com.pavel.demo.data.prefs.PreferenceManager

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Sample call
        makeText(this, DemoApplication.preferenceManager!!.isFirstTimeLaunch().toString(),Toast.LENGTH_LONG).show()
    }
}
