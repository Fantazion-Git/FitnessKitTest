package com.example.fitnesskittest.data.retrofit.model

import android.graphics.Color
import java.sql.Date
import java.sql.Time

data class Lesson(
    val name: String?=null,
    val description: String?=null,
    val place: String?=null,
    val coach_id : Trainer?=null,//TODO доработать всё ниже
    val start_time: Time?=null,
    val end_time: Time?=null,
    val date: Date?=null,
    var appointment_id: Int?=null,
    var service_id: Int?=null,
    var available_slots: Int?=null,
    var commercial: Boolean?=null,
    var client_recorded: Boolean?=null,
    var is_cancelled: Boolean?=null,
    var tab: Tab?=null,
    var color: Color?=null,
    var imageUrl: String?=null
)
