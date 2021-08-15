package com.alexey.minay.dagger2trymigration

import android.app.Application
import android.content.Context
import com.alexey.minay.dagger2trymigration.di.AppComponent
import com.alexey.minay.dagger2trymigration.di.ApplicationDiCompanion
import com.alexey.minay.dagger2trymigration.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .build()

        ApplicationDiCompanion.initAccount(this)
        ApplicationDiCompanion.initFeatureOne()
        ApplicationDiCompanion.initFeatureTwo()
    }

}

val Context.appComponent: AppComponent
    get() = when (this) {
        is App -> appComponent
        else -> this.applicationContext.appComponent
    }