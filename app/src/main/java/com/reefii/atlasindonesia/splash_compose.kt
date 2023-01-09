package com.reefii.atlasindonesia

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ir.kaaveh.sdpcompose.sdp

@Preview(showBackground = true)
@Composable
fun splash_compose() {
    MaterialTheme {
// Material Components like Button, Card, Switch, etc.
    val imageModifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()

        Image(
            painter = painterResource(R.drawable.atlasin),
            contentDescription = "splash screen",
            contentScale = ContentScale.Crop,            // crop the image if it's not a square
            modifier = imageModifier

        )
    }
}