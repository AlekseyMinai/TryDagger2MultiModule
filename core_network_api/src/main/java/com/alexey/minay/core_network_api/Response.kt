package com.alexey.minay.core_network_api

sealed class Response<Data, ErrorType> {
    class Success<Data>(val data: Data) : Response<Data, Nothing>()
    class Error<ErrorType>(val error: RError<ErrorType>) : Response<Nothing, ErrorType>()
}