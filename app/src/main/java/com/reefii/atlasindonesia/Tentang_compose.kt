package com.reefii.atlasindonesia


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.reefii.atlasindonesia.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Preview (showBackground = true)
@Composable
fun Tentang_compose() {
    MaterialTheme {
        // Material Components like Button, Card, Switch, etc.

        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            val imageModifier = Modifier
                .size(150.sdp)
                .border(BorderStroke(1.sdp, Color.Transparent))
                .background(Color.Transparent)
                .padding(15.sdp)

            Image(
                painter = painterResource(R.drawable.profile),
                contentDescription = "profile",
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = Modifier
                    .size(120.sdp)
                    .clip(CircleShape)                       // clip to the circle shape
                    .border(2.sdp, Color.Gray, CircleShape)   // add a border (optional)
            )

            Text(stringResource(R.string.tentang_aplikasi),
                fontSize = 20.ssp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(8.sdp) // bottom margin
            )

            Text(stringResource(R.string.tentangapp),
                fontSize = 13.ssp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(8.sdp) // bottom margin
            )


            Button(onClick = { /* Do something */ }) {

                Text(stringResource(id = R.string.unduh_buku_atlas_indonesia),
                    fontSize = 14.ssp,
                )

                Spacer(Modifier.size(ButtonDefaults.IconSpacing))

                val imageModifier2 = Modifier
                    .size(25.sdp)
                    .border(BorderStroke(1.sdp, Color.Transparent))
                    .background(Color.Transparent)

                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_arrow_circle_down_24),
                    contentDescription = stringResource(id = R.string.sumber_2),
                    contentScale = ContentScale.Fit,
                    modifier = imageModifier2
                )

            }

        }

    }

}