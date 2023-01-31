package com.example.fitnesskittest

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnesskittest.di.FitnessModule
import com.example.fitnesskittest.presentation.MainViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(
            this,
            FitnessModule.provideMainViewModelFactory()
        )[MainViewModel::class.java]
    }

    private val adapter = FitnessModule.provideFitnessAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.actionbar)
        findViewById<RecyclerView>(R.id.rcView).apply {
            adapter = this@MainActivity.adapter
            layoutManager = LinearLayoutManager(context)
        }
        observeData()

    }

    private fun observeData() {
        viewModel.data.observe(this) {
            adapter.setList(it)
        }
    }

}