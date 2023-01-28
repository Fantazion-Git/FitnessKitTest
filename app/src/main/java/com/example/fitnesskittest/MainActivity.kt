package com.example.fitnesskittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnesskittest.di.FitnessModule
import com.example.fitnesskittest.presentation.MainViewModel
import com.example.fitnesskittest.presentation.adapter.FitnessAdapter
import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths

class MainActivity : AppCompatActivity() {

    private val viewModel:MainViewModel by lazy {
        ViewModelProvider(this,FitnessModule.provideMainViewModelFactory())[MainViewModel::class.java]
    }

    private val adapter = FitnessModule.provideFitnessAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<RecyclerView>(R.id.rcView).apply {
            adapter=this@MainActivity.adapter
            layoutManager = LinearLayoutManager(context)
        }
        observeData()

    }

    private fun observeData(){
        viewModel.data.observe(this){
            adapter.setList(it)
        }
    }

}