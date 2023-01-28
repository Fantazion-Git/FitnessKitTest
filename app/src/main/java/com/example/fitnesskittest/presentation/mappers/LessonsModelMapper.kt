package com.example.fitnesskittest.presentation.mappers

import com.example.fitnesskittest.domain.Lesson
import com.example.fitnesskittest.presentation.models.LessonModel

object LessonsModelMapper {
    fun map(lesson: Lesson) : LessonModel {
        return LessonModel(
            startTime =lesson.startTime.toString(),
            endTime =lesson.endTime.toString(),
            tabName = lesson.tabName.toString(),
            time =lesson.time.toString(),
            trainerFullName =lesson.trainerFullName.toString(),
            place =lesson.place.toString(),
            date =lesson.date.toString(),
            color =lesson.color
            )
        }
    }