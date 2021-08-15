package com.alexey.minay.feature_one

import android.util.Log
import javax.inject.Inject

class FeatureOneRepo @Inject constructor(
    private val featureGateway: FeatureOneGateway
) : IFeatureOneRepo {

    override fun getData() {
        featureGateway.getData()
        Log.d("FeatureOneRepo", "getData()")
    }

}