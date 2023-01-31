package com.example.fitnesskittest.presentation.view_holders

import com.example.fitnesskittest.databinding.LessonLayoutBinding
import com.example.fitnesskittest.presentation.models.LessonModel

class LessonViewHolder(
    private val binding: LessonLayoutBinding
) : FitnessViewHolder(binding.root) {
    fun bind(model: LessonModel) {
        binding.textTimeStart.text = model.startTime
        binding.textTime.text = model.time
        binding.textPlace.text = model.place
        binding.textTimeStop.text = model.endTime
        binding.textTabName.text = model.tabName
        binding.textTrainerFullname.text = model.trainerFullName
        model.color?.let { binding.frameL.setBackgroundColor(it) }
    }
}