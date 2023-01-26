package com.example.fitnesskittest.presentation.models

import android.graphics.Color
import java.util.Date

data class LessonModel(
    val startTime:Date,
    val endTime:Date,
    val tabName:String,
    val time: Date,
    val trainerFullName:String,
    val place:String,
    val date:Date,
    val color:Color
)
