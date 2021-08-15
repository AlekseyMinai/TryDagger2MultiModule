package com.alexey.minay.feature_one.di

import androidx.lifecycle.ViewModel
import com.alexey.minay.core_dagger2.ViewModelKey
import com.alexey.minay.feature_one.FeatureOneViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface FeatureOneVMModule {

    @Binds
    @[IntoMap ViewModelKey(FeatureOneViewModel::class)]
    fun provideFeatureOneViewModel(featureOneViewModel: FeatureOneViewModel): ViewModel

}