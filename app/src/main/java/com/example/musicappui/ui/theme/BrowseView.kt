package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.musicappui.R

@Composable
fun BrowseScreen() {
    val categories = listOf("Hits", "행복", "운동", "러닝", "불금", "명상")

    LazyVerticalGrid(
        GridCells.Fixed(2)
    ) {
        items(categories) {
            cat ->
            BrowserItem(cat = cat, drawable = R.drawable.baseline_apps_24)
        }

    }
}
