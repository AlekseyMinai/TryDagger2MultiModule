package com.alexey.minay.dagger2trymigration.di

import androidx.lifecycle.ViewModel
import com.alexey.minay.core_dagger2.ViewModelKey
import com.alexey.minay.dagger2trymigration.data.MainRepo
import com.alexey.minay.dagger2trymigration.presentation.IMainRepo
import com.alexey.minay.dagger2trymigration.presentation.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface AppModule {

    @Binds
    @[IntoMap ViewModelKey(MainViewModel::class)]
    fun provideMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    fun provideMainRepo(mainRepo: MainRepo): IMainRepo

}