package com.example.fitnesskittest.presentation.models

import android.graphics.Color

data class LessonModel(
    val startTime:String,
    val endTime:String,
    val tabName:String,
    val time: String,
    val trainerFullName:String,
    val place:String,
    val date:String,
    val color: Int?
) : FitnessModel
