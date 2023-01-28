package com.example.fitnesskittest.data

import com.example.fitnesskittest.data.retrofit.RetrofitServices
import com.example.fitnesskittest.data.retrofit.mappers.LessonMapper
import com.example.fitnesskittest.domain.Lesson
import retrofit2.awaitResponse

class FitnessRepo(
    private val services: RetrofitServices
) {
     suspend fun loadAllData():List<Lesson> {
         val  call = services.getLessonsData().awaitResponse()
         val lessonsResult = if (call.isSuccessful) {
             call.body() ?: throw IllegalStateException()
         } else throw Exception("Своя ошибка тут, можно использовать response.errorBody(), response.code() для обработки")
         return lessonsResult.lessons.map { LessonMapper.mapToDomain(it, lessonsResult.trainers) }
    }
}