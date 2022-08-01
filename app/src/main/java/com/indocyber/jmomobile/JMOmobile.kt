package com.indocyber.jmomobile

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class JMOmobile : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@JMOmobile)
            //modules
        }
    }
}