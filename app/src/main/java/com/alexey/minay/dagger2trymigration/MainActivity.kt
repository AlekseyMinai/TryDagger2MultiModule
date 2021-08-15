package com.alexey.minay.dagger2trymigration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alexey.minay.dagger2trymigration.presentation.MainViewModel
import com.alexey.minay.feature_one.FeatureOneFragment

class MainActivity : AppCompatActivity() {

    private val mViewModel by lazy {
        appComponent
            .viewModelFactory
            .create(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewModel.getData()

        val tag = FeatureOneFragment::class.java.simpleName
        if (supportFragmentManager.findFragmentByTag(tag) != null) {
            return
        }

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, FeatureOneFragment.newInstance(), tag)
            .commit()
    }
}