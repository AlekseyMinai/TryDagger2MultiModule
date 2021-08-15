package com.alexey.minay.myapplication.di

import com.alexey.minay.core_dagger2.FeatureScope
import com.alexey.minay.feature_two_api.IFeatureTwoFragmentProvider
import com.alexey.minay.myapplication.FeatureTwoFragmentProvider
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface FeatureTwoModule {

    @Binds
    @FeatureScope
    fun provideFeatureTwoFragmentProvider(
        featureTwoFragmentProvider: FeatureTwoFragmentProvider
    ): IFeatureTwoFragmentProvider

}