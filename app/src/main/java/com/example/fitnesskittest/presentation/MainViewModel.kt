package com.example.fitnesskittest.presentation

import android.util.Log
import androidx.lifecycle.*
import com.example.fitnesskittest.data.FitnessRepo
import com.example.fitnesskittest.domain.Lesson
import com.example.fitnesskittest.presentation.mappers.DayModelMapper
import com.example.fitnesskittest.presentation.mappers.LessonsModelMapper
import com.example.fitnesskittest.presentation.models.FitnessModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repo: FitnessRepo) : ViewModel() {
    private val _data: MutableLiveData<List<FitnessModel>> = MutableLiveData()
    val data: LiveData<List<FitnessModel>> get() = _data

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val lessons = repo.loadAllData()
                val result = sortLessons(lessons)
                _data.postValue(result)
            } catch (e: Throwable) {
                Log.e("MainViewModel",e.message ?: e.localizedMessage)
            }
        }
    }
    private fun sortLessons (lessons: List<Lesson>) : List<FitnessModel>{
        val temp = lessons.sortedBy { it.date }
        val result : MutableList<FitnessModel> = mutableListOf()
        var tempDate = temp.firstOrNull()?.date
        var tempList: MutableList<Lesson> = mutableListOf()
         temp.forEachIndexed { index,lesson ->
            if (lesson.date==tempDate){
                tempList.add(lesson)
            }else{
                tempList = tempList.sortedBy { it.startTime }.toMutableList()
                result.add(DayModelMapper.map(tempDate))
                result.addAll(tempList.map {LessonsModelMapper.map(it)})
                tempDate=lesson.date
                tempList.clear()
                tempList.add(lesson)
            }
            if (index == temp.lastIndex) {
                tempList = tempList.sortedBy { it.startTime }.toMutableList()
                result.add(DayModelMapper.map(tempDate))
                result.addAll(tempList.map {LessonsModelMapper.map(it)})
            }
        }
        return result
    }

}
