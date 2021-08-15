package com.alexey.minay.feature_account

import android.content.Context

class AccountRepo(
    private val context: Context
) {

    fun getAccount() {
        context.applicationContext
    }

}