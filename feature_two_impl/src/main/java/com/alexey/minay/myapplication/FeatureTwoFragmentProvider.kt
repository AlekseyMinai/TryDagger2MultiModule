package com.alexey.minay.myapplication

import androidx.fragment.app.Fragment
import com.alexey.minay.feature_two_api.IFeatureTwoFragmentProvider
import javax.inject.Inject

class FeatureTwoFragmentProvider @Inject constructor() : IFeatureTwoFragmentProvider {

    override fun get(): Fragment {
        return FeatureTwoFragment.newInstance()
    }

}