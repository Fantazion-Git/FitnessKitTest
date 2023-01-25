package com.example.fitnesskittest.common

import com.example.fitnesskittest.Interface.RetrofitServices
import com.example.fitnesskittest.retrofit.RetrofitClient

object Common {
    private const val BASE_URL="http://olimpia/fitnesskit-admin.ru/schedule/get_v3/?club_id=2"

    val retrofitServices:RetrofitServices
    get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}