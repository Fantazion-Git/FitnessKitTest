package com.example.fitnesskittest.presentation.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fitnesskittest.R
import com.example.fitnesskittest.data.retrofit.model.Lesson
import com.example.fitnesskittest.databinding.DayLayoutBinding
import com.example.fitnesskittest.databinding.LessonLayoutBinding
import com.example.fitnesskittest.presentation.models.DayModel
import com.example.fitnesskittest.presentation.models.LessonModel
import com.example.fitnesskittest.presentation.view_holders.DayViewHolder
import com.example.fitnesskittest.presentation.view_holders.FitnessViewHolder
import com.example.fitnesskittest.presentation.view_holders.LessonViewHolder

class FitnessAdapter(
): RecyclerView.Adapter<FitnessViewHolder>() {

    private val list:MutableList<Any> = mutableListOf()

    override fun getItemViewType(position: Int): Int {
        return when (list[position]){
            is LessonModel ->1
            is DayModel ->2
            else -> -1
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FitnessViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lesson_layout, parent, false)
        return when(viewType){
            1 -> LessonViewHolder(LessonLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
            2 -> DayViewHolder(DayLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
            else -> throw IllegalArgumentException()
        }
    }

    override fun onBindViewHolder(p0: FitnessViewHolder, p1: Int) {
        when (p0){
            is DayViewHolder -> p0.bind(list[p1] as DayModel)
            is LessonViewHolder -> p0.bind(list[p1] as LessonModel)
        }
    }

    override fun getItemCount(): Int = list.size

    fun setList(list:List<Any>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }


}
