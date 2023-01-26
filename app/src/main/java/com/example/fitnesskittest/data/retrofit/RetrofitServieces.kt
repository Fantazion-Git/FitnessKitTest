package com.example.fitnesskittest.data.Interface

import com.example.fitnesskittest.data.retrofit.model.Lesson
import com.example.fitnesskittest.data.retrofit.model.Option
import com.example.fitnesskittest.data.retrofit.model.Tab
import com.example.fitnesskittest.data.retrofit.model.Trainer
import retrofit2.http.GET
import retrofit2.Call

interface RetrofitServices {
    @GET("?club_id=2")
    fun getLessonList(): Call<MutableList<Lesson>>
    @GET("?club_id=2")
    fun getOptionList():Call<MutableList<Option>>
    @GET("?club_id=2")
    fun getTabList():Call<MutableList<Tab>>
    @GET("?club_id=2")
    fun getTrainerList():Call<MutableList<Trainer>>

}