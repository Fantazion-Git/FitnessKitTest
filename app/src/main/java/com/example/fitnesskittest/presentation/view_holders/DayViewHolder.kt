package com.example.fitnesskittest.presentation.view_holders

import androidx.recyclerview.widget.RecyclerView
import com.example.fitnesskittest.databinding.DayLayoutBinding
import com.example.fitnesskittest.presentation.models.DayModel

class DayViewHolder (
    private val binding: DayLayoutBinding
):FitnessViewHolder(binding.root){
    fun bind(model:DayModel){
        binding.textView2.text=model.day
    }
}