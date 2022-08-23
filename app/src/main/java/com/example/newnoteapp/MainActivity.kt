package com.example.newnoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.example.newnoteapp.feature_note.presentation.addeditnote.AddEditNoteScreen
import com.example.newnoteapp.feature_note.presentation.notes.NotesScreen
import com.example.newnoteapp.ui.theme.BabyBlue
import com.example.newnoteapp.ui.theme.NewNoteAppTheme
import com.example.newnoteapp.ui.theme.RedPink

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewNoteAppTheme {
                //NotesScreen()
                AddEditNoteScreen(noteColor = RedPink.toArgb())
            }
        }
    }
}