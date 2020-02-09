package com.keksec.smack.controller

import android.app.Application
import com.keksec.smack.utilities.SharedPrefs

class App : Application() {
    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }
}