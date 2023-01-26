package com.example.fitnesskittest.presentation.view_holders

import androidx.recyclerview.widget.RecyclerView
import com.example.fitnesskittest.databinding.LessonLayoutBinding
import com.example.fitnesskittest.presentation.models.LessonModel

class LessonViewHolder(
    private val binding: LessonLayoutBinding
) :FitnessViewHolder(binding.root){
    fun bind (model : LessonModel){
        binding.textTimeStart.text=model.startTime.toString()
        TODO()
    }
}