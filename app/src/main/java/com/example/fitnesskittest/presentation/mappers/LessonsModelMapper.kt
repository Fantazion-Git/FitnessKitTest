package com.example.fitnesskittest.presentation.mappers

import com.example.fitnesskittest.domain.Lesson
import com.example.fitnesskittest.presentation.models.LessonModel

object LessonsModelMapper {
    fun map(lesson: Lesson): LessonModel = LessonModel(
        startTime = lesson.startTime?.toString() ?: "",
        endTime = lesson.endTime?.toString() ?: "",
        tabName = lesson.tabName ?: "",
        time = lesson.time ?: "",
        trainerFullName = lesson.trainerFullName ?: "",
        place = lesson.place ?: "",
        date = lesson.date?.toString() ?: "",
        color = lesson.color
    )
}