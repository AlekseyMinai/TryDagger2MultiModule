package com.alexey.minay.feature_one

import androidx.lifecycle.ViewModel
import com.alexey.minay.feature_two_api.IFeatureTwoFragmentProvider
import javax.inject.Inject

class FeatureOneViewModel @Inject constructor(
    private val featureRepo: IFeatureOneRepo,
    val fragmentProvider: IFeatureTwoFragmentProvider
) : ViewModel() {

    fun init() {
        featureRepo.getData()
    }

}