package com.example.newnoteapp.feature_note.presentation.notes.components

import android.provider.ContactsContract
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.newnoteapp.ui.theme.BabyBlue


@Composable
fun NoteItem(
    modifier: Modifier = Modifier.padding(bottom = 16.dp),
    onDeleteClick:() -> Unit = {},
    id: Int?
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = BabyBlue
            ),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .padding(
                    end = 32.dp
                )
        ) {
            Text(
                text = "Hello Android!",
                style = MaterialTheme.typography.h6,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                color = MaterialTheme.colors.onSurface
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "You are so hard to learn",
                style = MaterialTheme.typography.body1,
                maxLines = 10,
                overflow = TextOverflow.Ellipsis,
                color = MaterialTheme.colors.onSurface
            )
            Spacer(modifier = Modifier.height(8.dp))
            id?.let{
                Text(
                    text = it.toString()
                )
            }
        }
        IconButton(
            modifier = Modifier.align(alignment = Alignment.BottomEnd),
            onClick = {
                onDeleteClick()
            }
        ) {
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = null,
                tint = MaterialTheme.colors.onSurface
            )
        }
    }
}