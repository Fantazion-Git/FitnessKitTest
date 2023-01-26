package com.example.fitnesskittest.common

import com.example.fitnesskittest.data.Interface.RetrofitServices
import com.example.fitnesskittest.data.retrofit.RetrofitClient

object Common {
    private const val BASE_URL="http://olimpia/fitnesskit-admin.ru/schedule/get_v3/"

    val retrofitServices: RetrofitServices
    get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}