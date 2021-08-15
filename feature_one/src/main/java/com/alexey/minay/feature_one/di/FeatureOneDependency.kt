package com.alexey.minay.feature_one.di

import com.alexey.minay.feature_account.AccountRepo
import com.alexey.minay.feature_two_api.IFeatureTwoFragmentProvider

interface FeatureOneDependency {
    fun featureTwoFragmentProvider(): IFeatureTwoFragmentProvider
    fun accountRepoProvider(): AccountRepo
}