package com.alexey.minay.dagger2trymigration.di

import android.content.Context
import com.alexey.minay.feature_account.AccountDiCompanion
import com.alexey.minay.feature_one.di.DaggerFeatureOneComponent_FeatureOneDependencyComponent
import com.alexey.minay.feature_one.di.FeatureOneComponent
import com.alexey.minay.myapplication.di.FeatureTwoComponent

object ApplicationDiCompanion {

    fun initFeatureOne() =
        FeatureOneComponent.initAndGet(
            DaggerFeatureOneComponent_FeatureOneDependencyComponent.builder()
                .iFeatureTwoFragmentProvider(initFeatureTwo()?.getFeatureTwoProvider())
                .accountRepo(AccountDiCompanion.accountRepo)
                .build()
        )

    fun initFeatureTwo() =
        FeatureTwoComponent.initAndGet()

    fun initAccount(context: Context) {
        AccountDiCompanion.init { context }
    }

}