package com.alexey.minay.feature_one.di

import com.alexey.minay.core_dagger2.FeatureScope
import com.alexey.minay.core_dagger2.MultiViewModelFactory
import com.alexey.minay.core_dagger2.initDaggerComponent
import com.alexey.minay.feature_account.AccountRepo
import com.alexey.minay.feature_two_api.IFeatureTwoFragmentProvider
import dagger.Component
import java.lang.ref.WeakReference
import javax.inject.Singleton

@Component(
    dependencies = [FeatureOneDependency::class],
    modules = [FeatureOneModule::class, FeatureOneVMModule::class]
)
@FeatureScope
abstract class FeatureOneComponent {

    abstract val viewModelFactory: MultiViewModelFactory

    companion object {

        @Volatile
        private var mFeatureOneComponentWeak: WeakReference<FeatureOneComponent?>? = null

        internal fun get(): FeatureOneComponent? {
            return mFeatureOneComponentWeak?.get()
        }

        fun initAndGet(featureOneDependency: FeatureOneDependency): FeatureOneComponent? {
            initDaggerComponent(mFeatureOneComponentWeak) {
                val component = DaggerFeatureOneComponent.builder()
                    .featureOneDependency(featureOneDependency)
                    .build()
                mFeatureOneComponentWeak = WeakReference(component)
            }
            return mFeatureOneComponentWeak?.get()
        }

    }

    @Component(dependencies = [IFeatureTwoFragmentProvider::class, AccountRepo::class])
    @Singleton
    interface FeatureOneDependencyComponent : FeatureOneDependency

}