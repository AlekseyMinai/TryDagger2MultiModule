package com.alexey.minay.feature_one.di

import com.alexey.minay.core_dagger2.FeatureScope
import com.alexey.minay.feature_one.FeatureOneRepo
import com.alexey.minay.feature_one.IFeatureOneRepo
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface FeatureOneModule {

    @Binds
    @FeatureScope
    fun providerRepo(featureOneRepo: FeatureOneRepo): IFeatureOneRepo

}