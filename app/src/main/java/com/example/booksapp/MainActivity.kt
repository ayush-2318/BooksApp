package com.example.booksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var bookviewmodel:BookViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bookviewmodel=ViewModelProvider(this).get(BookViewModel::class.java)
        bookviewmodel.bookLiveData.observe(this){
           //use it to inflate ui
            //use it to pass to adapter
            Log.i("book detail",it.toString())
        }
    }
}