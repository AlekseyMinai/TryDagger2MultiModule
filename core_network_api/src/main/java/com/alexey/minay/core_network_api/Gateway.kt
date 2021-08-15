package com.alexey.minay.core_network_api

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request

inline fun <reified Data, ErrorType> get(url: String) = try {
    val request = Request.Builder()
        .url(url)
        .get()
        .build()
    val body = OkHttpClient().newCall(request).execute().body
    val result = Gson().fromJson(body!!.string(), Data::class.java)
    Response.Success(result)
} catch (e: Exception) {
    Response.Error(RError.UnknownError)
}