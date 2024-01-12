package com.example.booksapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BookViewModel:ViewModel() {

    val bookLiveData=MutableLiveData<List<Book>>()
    init {
        getAllBook()
    }

    fun getAllBook(){
        val allBooks=Repo.getAllBooks()
        bookLiveData.value=allBooks
    }
}