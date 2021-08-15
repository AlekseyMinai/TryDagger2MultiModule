package com.alexey.minay.dagger2trymigration.di

import com.alexey.minay.core_dagger2.MultiViewModelFactory
import dagger.Component

@Component(modules = [AppModule::class])
@AppScope
interface AppComponent {

    val viewModelFactory: MultiViewModelFactory

    @Component.Builder
    interface Builder {

        fun build(): AppComponent
    }

}