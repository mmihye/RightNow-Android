package com.example.rightnow.ui

import android.app.Application
import com.example.rightnow.MySharedPreferences

class MyApplication : Application() {
    companion object {
        lateinit var prefs: MySharedPreferences
    }

    override fun onCreate() {
        prefs = MySharedPreferences(applicationContext)
        super.onCreate()
    }
}