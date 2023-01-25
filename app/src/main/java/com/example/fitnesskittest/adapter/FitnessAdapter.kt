package com.example.fitnesskittest.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.fitnesskittest.model.Lesson
import com.example.fitnesskittest.model.Option
import com.example.fitnesskittest.model.Tab
import com.example.fitnesskittest.model.Trainer

class FitnessAdapter(
    private val context : Context,
    private val lessonList: MutableList<Lesson>,
    private val optionList: MutableList<Option>,
    private val tabList: MutableList<Tab>,
    private val trainerList: MutableList<Trainer>
): RecyclerView.Adapter<FitnessAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        TODO("Not yet implemented")
    }
}