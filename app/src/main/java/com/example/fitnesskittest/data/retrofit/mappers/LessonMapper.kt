package com.example.fitnesskittest.data.retrofit.mappers

import android.graphics.Color
import com.example.fitnesskittest.data.retrofit.model.Lesson
import com.example.fitnesskittest.data.retrofit.model.Trainer
import java.time.Duration
import java.time.LocalDate
import java.time.LocalTime
import com.example.fitnesskittest.domain.Lesson as LessonDomain

object LessonMapper {
    fun mapToDomain(lesson: Lesson, trainers: List<Trainer>): LessonDomain {
        val startTime = lesson.startTime?.let { LocalTime.parse(it) }
        val endTime = lesson.endTime?.let { LocalTime.parse(it) }
        return LessonDomain(startTime = startTime,
            endTime = endTime,
            tabName = lesson.tab,
            time = durationTime(startTime, endTime),
            trainerFullName = trainers.find { it.id == lesson.coach_id }?.full_name,
            place = lesson.place,
            date = LocalDate.parse(lesson.date),
            color = lesson.color?.let { Color.parseColor(it) })
    }

    private fun durationTime(time1: LocalTime?, time2: LocalTime?): String {
        time1 ?: return ""
        time2 ?: return ""
        val da = Duration.between(time1, time2)
        return da.toString().replace("PT", "").replace("H", "ч. ").replace("M", "мин.")
    }
}