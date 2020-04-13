package com.pavel.demo

import android.app.Application
import com.pavel.demo.data.local.db.AppDatabase
import com.pavel.demo.data.prefs.PreferenceManager

class DemoApplication : Application() {


    companion object {
        lateinit var database: AppDatabase
        var preferenceManager: PreferenceManager? = null
    }

    override fun onCreate() {
        preferenceManager = PreferenceManager(applicationContext)
        super.onCreate()
    }
}