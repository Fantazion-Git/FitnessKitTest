package com.example.fitnesskittest.presentation

import androidx.lifecycle.*
import com.example.fitnesskittest.data.FitnessRepo
import com.example.fitnesskittest.domain.Lesson
import com.example.fitnesskittest.presentation.mappers.DayModelMapper
import com.example.fitnesskittest.presentation.mappers.LessonsModelMapper
import com.example.fitnesskittest.presentation.models.DayModel
import com.example.fitnesskittest.presentation.models.FitnessModel
import com.example.fitnesskittest.presentation.models.LessonModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*

class MainViewModel(private val repo: FitnessRepo) : ViewModel() {
    private val _data: MutableLiveData<List<FitnessModel>> = MutableLiveData()
    val data: LiveData<List<FitnessModel>> get() = _data

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val lessons = repo.loadAllData()
            val result = sortLessons(lessons)
            _data.postValue(result)
        }
    }
    private fun sortLessons (lessons: List<Lesson>) : List<FitnessModel>{ //TODO() Rename
        val temp = lessons.sortedBy { it.date }
        val result : MutableList<FitnessModel> = mutableListOf()
        var tempDate = temp[0].date
        val tempList: MutableList<Lesson> = mutableListOf()
         temp.forEachIndexed { index,lesson ->
            if (lesson.date==tempDate){
                tempList.add(lesson)
            }else{
                tempList.sortedBy { it.startTime }
                result.add(DayModelMapper.map(tempDate)) // TODO() DayModel.map в
                result.addAll(tempList.map {LessonsModelMapper.map(it)}) // TODO() TempList.map в ListModel
                tempDate=lesson.date
                tempList.clear()
                tempList.add(lesson)
            }
            if (index == temp.lastIndex) {
                tempList.sortedBy { it.startTime }
                result.add(DayModelMapper.map(tempDate))
                result.addAll(tempList.map {LessonsModelMapper.map(it)})
            }
        }
        return result
    }

}
