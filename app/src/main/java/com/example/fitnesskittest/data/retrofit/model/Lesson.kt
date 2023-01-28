package com.example.fitnesskittest.data.retrofit.model

import android.graphics.Color
import java.util.Date

//TODO перименовать

data class Lesson(
    val name: String?=null,
    val description: String?=null,
    val place: String?=null,
    val coach_id : String?=null,//TODO доработать всё ниже
    val start_time: String?=null,
    val end_time: String?=null,
    val date: String?=null,
    var appointment_id: Int?=null,
    var service_id: Int?=null,
    var available_slots: Int?=null,
    var commercial: Boolean?=null,
    var client_recorded: Boolean?=null,
    var is_cancelled: Boolean?=null,
    var tab: String?=null,
    var color: String?=null,
    var imageUrl: String?=null
)
