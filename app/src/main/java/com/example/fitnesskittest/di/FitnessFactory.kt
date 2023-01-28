package com.example.fitnesskittest.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.fitnesskittest.data.FitnessRepo
import com.example.fitnesskittest.presentation.MainViewModel

class MainViewModelFactory(
    private val repo: FitnessRepo
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>) = MainViewModel(repo) as T
}