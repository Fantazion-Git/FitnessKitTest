package com.example.fitnesskittest.presentation.view_holders

import com.example.fitnesskittest.databinding.DayLayoutBinding
import com.example.fitnesskittest.presentation.models.DayModel

class DayViewHolder(
    private val binding: DayLayoutBinding
) : FitnessViewHolder(binding.root) {
    fun bind(model: DayModel) {
        binding.dayText.text = model.day
    }
}