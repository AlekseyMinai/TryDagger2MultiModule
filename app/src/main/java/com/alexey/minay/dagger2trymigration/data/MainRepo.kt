package com.alexey.minay.dagger2trymigration.data

import android.util.Log
import com.alexey.minay.dagger2trymigration.presentation.IMainRepo
import javax.inject.Inject

class MainRepo @Inject constructor(private val gateway: MainGateway): IMainRepo {

    override fun getData() {
        Log.d("MainModule", "MainRepo.getData")
    }

}