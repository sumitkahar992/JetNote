package com.example.jetnote.data

import com.example.jetnote.model.Note

class NotesDataSource{
    fun loadNotes(): List<Note>{
        return listOf(

            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day"),
            Note(title = "A good Day", description = "a Bad Day")
        )    }
}