package com.alexey.minay.feature_one

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.alexey.minay.feature_one.di.FeatureOneComponent

class FeatureOneFragment : Fragment(R.layout.fragment_feature_one) {

    private val mViewModel by lazy {
        FeatureOneComponent.get()
            ?.viewModelFactory
            ?.create(FeatureOneViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewModel?.init()
        view.findViewById<Button>(R.id.toFeatureTwo).setOnClickListener {
            val fragment = mViewModel?.fragmentProvider?.get() ?: return@setOnClickListener

            childFragmentManager.beginTransaction()
                .add(R.id.featureOneContainer, fragment, TAG_FEATURE_TWO)
                .addToBackStack(TAG_FEATURE_TWO)
                .commit()
        }
    }

    companion object {
        private const val TAG_FEATURE_TWO = "feature_two"

        fun newInstance() = FeatureOneFragment()
    }

}