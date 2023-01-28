package com.example.fitnesskittest.data.retrofit.mappers

import android.graphics.Color
import com.example.fitnesskittest.data.retrofit.model.Lesson
import com.example.fitnesskittest.data.retrofit.model.Trainer
import java.time.Duration
import java.time.LocalDate
import java.time.LocalTime
import kotlin.math.abs
import com.example.fitnesskittest.domain.Lesson as LessonDomain

object LessonMapper {
    fun mapToDomain(lesson: Lesson, trainers: List<Trainer>): LessonDomain {
        val startTime = LocalTime.parse(lesson.start_time)
        val endTime = LocalTime.parse(lesson.end_time)
        return LessonDomain(
            startTime = startTime,
            endTime = endTime,
            tabName = lesson.tab,
            time = durationTime(startTime, endTime),
            trainerFullName = trainers.find { it.id == lesson.coach_id }?.fullName,
            place = lesson.place,
            date = LocalDate.parse(lesson.date),
            color = lesson.color?.let { Color.parseColor(it) }?.let { Color.valueOf(it) }
        )
    }

    private fun durationTime(time1: LocalTime?, time2: LocalTime?): String {
        val da = Duration.between(time1, time2)
        val minutes = da.seconds / 60
        val absMin = abs(minutes)
        val positive = "${absMin / 60} : $absMin"
        return if (da.seconds < 0) "-$positive" else positive
    }
}