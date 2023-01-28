package com.example.fitnesskittest.data.retrofit

import com.example.fitnesskittest.data.retrofit.model.Lesson
import com.example.fitnesskittest.data.retrofit.model.LessonResult
import com.example.fitnesskittest.data.retrofit.model.Trainer
import retrofit2.http.GET
import retrofit2.Call

interface RetrofitServices {
    @GET("schedule/get_v3/?club_id=2")
    fun getLessonsData(): Call<LessonResult>

}