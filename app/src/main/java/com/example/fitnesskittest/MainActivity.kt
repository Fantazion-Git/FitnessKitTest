package com.example.fitnesskittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.fitnesskittest.presentation.MainViewModel
import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths

class MainActivity : AppCompatActivity() {

    private val viewModel:MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}