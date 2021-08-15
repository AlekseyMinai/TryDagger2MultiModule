package com.alexey.minay.feature_one

import com.alexey.minay.core_network_api.get
import com.alexey.minay.feature_account.AccountRepo
import javax.inject.Inject

class FeatureOneGateway @Inject constructor(
    private val account: AccountRepo
) {

    fun getData() {
        account.getAccount()
        get<DataJson, Error>("url")
    }

    data class DataJson(val id: String)

    enum class Error

}