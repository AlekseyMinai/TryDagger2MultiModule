package com.alexey.minay.core_network_api

sealed class RError<ErrorType> {
    class ServerError<ErrorType>(val serverError: ErrorType) : RError<ErrorType>()
    object NoInternetConnection : RError<Nothing>()
    object UnknownError : RError<Nothing>()
}