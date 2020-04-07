package com.pavel.demo

import android.app.Application
import com.pavel.demo.data.local.db.AppDatabase

class DemoApplication : Application() {


    companion object {

        // This static var should be injected for all Database repositories
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
    }
}