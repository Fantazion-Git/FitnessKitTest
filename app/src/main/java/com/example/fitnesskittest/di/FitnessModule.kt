package com.example.fitnesskittest.di

import com.example.fitnesskittest.data.FitnessRepo
import com.example.fitnesskittest.data.retrofit.RetrofitServices
import com.example.fitnesskittest.data.retrofit.RetrofitClient
import com.example.fitnesskittest.presentation.adapter.FitnessAdapter

object FitnessModule {
    private const val BASE_URL="https://olimpia.fitnesskit-admin.ru/"
    //функции провайд (в стиле дагера)
    fun provideFitnessAdapter() = FitnessAdapter()

    fun provideMainViewModelFactory()= MainViewModelFactory(provideFitnessRepo())

    private fun provideFitnessRepo() = FitnessRepo(provideRetrofitServices())

    private fun provideRetrofitServices(): RetrofitServices = RetrofitClient.getClient(BASE_URL).create(
        RetrofitServices::class.java)
}