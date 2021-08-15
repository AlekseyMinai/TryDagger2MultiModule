package com.alexey.minay.myapplication.di

import com.alexey.minay.core_dagger2.FeatureScope
import com.alexey.minay.core_dagger2.initDaggerComponent
import com.alexey.minay.feature_two_api.IFeatureTwoApi
import dagger.Component
import java.lang.ref.WeakReference

@Component(modules = [FeatureTwoModule::class])
@FeatureScope
abstract class FeatureTwoComponent : IFeatureTwoApi {

    companion object {

        @Volatile
        private var mFeatureOneComponentWeak: WeakReference<FeatureTwoComponent?>? = null

        internal fun get(): FeatureTwoComponent? {
            return mFeatureOneComponentWeak?.get()
        }

        fun initAndGet(): FeatureTwoComponent? {
            initDaggerComponent(mFeatureOneComponentWeak) {
                val featureOneComponent = DaggerFeatureTwoComponent.builder()
                    .build()
                mFeatureOneComponentWeak = WeakReference(featureOneComponent)
            }
            return mFeatureOneComponentWeak?.get()
        }

    }


}