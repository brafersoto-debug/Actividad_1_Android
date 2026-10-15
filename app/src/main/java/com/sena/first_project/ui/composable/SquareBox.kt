package com.sena.first_project.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SquareBox(
    color: Color,
    modifier: Modifier = Modifier,
    size: Dp = 50.dp
) {
    Box(
        modifier = modifier
            .size(size)
            .background(color)
    )
}
