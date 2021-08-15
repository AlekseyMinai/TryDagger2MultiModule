package com.alexey.minay.dagger2trymigration.presentation

import androidx.lifecycle.ViewModel
import com.alexey.minay.dagger2trymigration.data.MainRepo
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repo: IMainRepo
): ViewModel() {


    fun getData() {
        repo.getData()
    }

}