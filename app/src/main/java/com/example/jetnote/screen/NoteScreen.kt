package com.example.jetnote.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetnote.R
import com.example.jetnote.component.NoteButton
import com.example.jetnote.component.NoteInputText
import com.example.jetnote.data.NotesDataSource
import com.example.jetnote.model.Note

@Composable
fun NoteScreen(
    notes: List<Note>,
    onAddNote: (Note) -> Unit,
    onRemove: (Note) -> Unit

){
    var title by remember {
        mutableStateOf("")
    }
    var description by remember {
        mutableStateOf("")
    }



    Column(modifier = Modifier.padding(6.dp)) {
        TopAppBar(title = {
                          Text(text = stringResource(id = R.string.app_name))
        },
            actions = {
                Icon(imageVector = Icons.Default.Notifications,
                    contentDescription = "Icon")
            },
        backgroundColor = Color(0x75FFFFFF)
        )

        //content
        Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
            NoteInputText(
                modifier = Modifier.
                padding(
                    top = 9.dp,
                    bottom = 8.dp),
                text = "title",
                label = "Title",
                onTextChanges = {
                    if (it.all { char ->
                            char.isLetter() || char.isWhitespace()
                        }) title = it
                }) {
            }

            NoteInputText(
                modifier = Modifier.
                padding(
                    top = 19.dp,
                    bottom = 8.dp),
                text = "Description",
                label = "Add a note",
                onTextChanges = {
                    if (it.all { char ->
                            char.isLetter() || char.isWhitespace()
                        }) description = it
                }){}
            
            NoteButton(text = "Save" ,
                onClick = {
                    if (title.isNotEmpty() && description.isNotEmpty()){
                        title = ""
                        description = ""
                    }
                })


        }
        Divider(modifier = Modifier.padding(10.dp))
        LazyColumn{
            items(notes){ note ->
                Text(text = note.title)

            }
        }
        
    }

}


@Preview(showBackground = true)
@Composable
fun NotesScreenPreview(){
    NoteScreen(notes = NotesDataSource().loadNotes(),
    onAddNote = {}, onRemove = {}
    )
}