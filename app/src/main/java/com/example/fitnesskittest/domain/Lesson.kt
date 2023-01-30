package com.example.fitnesskittest.domain

import java.time.LocalDate
import java.time.LocalTime

data class Lesson(
    val startTime: LocalTime?,
    val endTime:LocalTime?,
    val tabName:String?,
    val time: String?,
    val trainerFullName:String?,
    val place:String?,
    val date:LocalDate?,
    val color:Int?
)
