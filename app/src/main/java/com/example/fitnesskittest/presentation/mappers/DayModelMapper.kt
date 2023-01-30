package com.example.fitnesskittest.presentation.mappers


import com.example.fitnesskittest.presentation.models.DayModel
import java.time.LocalDate
import java.time.format.DateTimeFormatter

object DayModelMapper {
    fun map (date: LocalDate?) : DayModel {
        return DayModel(
            day = date?.format(DateTimeFormatter.ofPattern("EEEE, DD MMMM")) ?: throw Exception("Date is null in DayModelMapper")
        )
    }
}