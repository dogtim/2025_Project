package com.tim.google.photos.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tim.google.photos.R
//
//@Composable
//fun ImageGrid(images: List<Painter>) {
//    LazyVerticalGrid(
//        columns = GridCells.Fixed(3),
//        contentPadding = PaddingValues(8.dp),
//        verticalArrangement = Arrangement.spacedBy(8.dp),
//        horizontalArrangement = Arrangement.spacedBy(8.dp)
//    ) {
//        items(images) { image ->
//            Image(
//                painter = image,
//                contentDescription = null
//            )
//        }
//    }
//}
//
//// Example usage:
@Composable
fun MyScreen() {
    val imageList = listOf(
        painterResource(id = R.drawable.ic_launcher_foreground), // Replace with your actual image resources
    )
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = null
    )
}