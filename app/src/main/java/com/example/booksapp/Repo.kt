package com.example.booksapp

object Repo {
    fun getAllBooks()= listOf<Book>(
        Book(
            bookName = "some book",
            bookPrice = "599",
            bookGener = "Educational",
            bookAuthor = "Some Author"
        ),
        Book(
            bookName = "some book1",
            bookPrice = "598",
            bookGener = "LifeStyle",
            bookAuthor = "Some Author1"
        ),
        Book(
            bookName = "some book2",
            bookPrice = "599",
            bookGener = "Educational",
            bookAuthor = "Some Author2"
        ),
        Book(
            bookName = "some book3",
            bookPrice = "599",
            bookGener = "Lifestyle",
            bookAuthor = "Some Author3"
        ),
        Book(
            bookName = "some book4",
            bookPrice = "599",
            bookGener = "Educational",
            bookAuthor = "Some Author4"
        )
    )
}