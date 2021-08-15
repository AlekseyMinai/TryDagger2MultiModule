package com.alexey.minay.feature_account

import android.content.Context

object AccountDiCompanion {

    val accountRepo by lazy { AccountRepo(mContextProvider()) }

    private lateinit var mContextProvider: () -> Context

    fun init(contextProvider: () -> Context) {
        mContextProvider = contextProvider
    }

}