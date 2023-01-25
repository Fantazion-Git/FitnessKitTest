package com.example.fitnesskittest.Interface

import com.example.fitnesskittest.model.Lesson
import com.example.fitnesskittest.model.Option
import com.example.fitnesskittest.model.Tab
import com.example.fitnesskittest.model.Trainer
import retrofit2.http.GET
import retrofit2.Call

interface RetrofitServices {
    @GET("marvel")
    fun getLessonList(): Call<MutableList<Lesson>>
    @GET("marvel")
    fun getOptionList():Call<MutableList<Option>>
    @GET("marvel")
    fun getTabList():Call<MutableList<Tab>>
    @GET("marvel")
    fun getTrainerList():Call<MutableList<Trainer>>

}