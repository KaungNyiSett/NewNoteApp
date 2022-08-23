package com.example.newnoteapp.feature_note.presentation.addeditnote

import android.provider.ContactsContract
import androidx.compose.animation.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Save
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.newnoteapp.feature_note.presentation.addeditnote.components.TransparentHintTextField
import com.example.newnoteapp.ui.theme.BabyBlue
import com.example.newnoteapp.ui.theme.RedOrange
import kotlinx.coroutines.launch


@Composable
fun AddEditNoteScreen(
        noteColor: Int
) {

    val scaffoldState = rememberScaffoldState()

    val scope = rememberCoroutineScope()

    val noteBackgroundAnimatable = remember {
        Animatable(
            Color(if (noteColor != -1) noteColor else BabyBlue.toArgb())
        )
    }

    LaunchedEffect(key1 = true){

    }

    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier.fillMaxSize(),
        backgroundColor = noteBackgroundAnimatable.value,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {

                },
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Icon(
                    imageVector = Icons.Default.Save,
                    contentDescription = null,
                )
            }
        }
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Circles(
                colorOnClick = { color ->
                    scope.launch {
                        noteBackgroundAnimatable.animateTo(
                            targetValue = color,
                            animationSpec = tween(
                                durationMillis = 500
                            )
                        )
                    }
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            TransparentHintTextField(
                text = "This is Heading.",
                hint = "This is Hint.",
                onValueChange = {

                },
                onFocusChange = {

                },
                textStyle = MaterialTheme.typography.h6,
                isHintVisible = false,
                singleLine = true
            )
            Spacer(modifier = Modifier.height(16.dp))
            TransparentHintTextField(
                text = "This is content.",
                hint = "This is hint.",
                onValueChange = {

                },
                onFocusChange = {

                },
                textStyle = MaterialTheme.typography.body1,
                singleLine = false,
                isHintVisible = false,
                modifier = Modifier.fillMaxHeight(),
            )
        }
    }

}

@Composable
fun Circles(
    modifier: Modifier = Modifier,
    colorOnClick:(Color) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
    }
}