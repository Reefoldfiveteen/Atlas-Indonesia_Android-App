package com.reefii.atlasindonesia


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTransformGestures
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.reefii.atlasindonesia.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Preview (showBackground = true)
@Composable
fun detil_compose() {
    MaterialTheme {
        // Material Components like Button, Card, Switch, etc.

        Column(
            modifier = Modifier
                .fillMaxSize(),
            //verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {

            Text(
                stringResource(R.string.nama_daerah),
                textAlign = TextAlign.Center,
                fontSize = 15.ssp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(5.sdp), // bottom margin

            )

            val imageModifierr = Modifier
                .size(100.sdp)
                .border(BorderStroke(1.sdp, Color.Transparent))
                .background(Color.Transparent)
                .padding(5.sdp)

            Image(
                painter = painterResource(R.drawable.diy_logo),
                contentDescription = "profile",
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = imageModifierr
            )

            Box(
            ) {
                Text(
                    stringResource(R.string.detail_derah),
                    fontSize = 12.ssp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(5.sdp) // bottom margin
                        .align(TopCenter)

                )

                Text(
                    stringResource(R.string.uraian_detail_daerah),
                    fontSize = 11.ssp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(20.sdp) // bottom margin
                        .align(TopCenter)
                )
            }


            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .align(CenterHorizontally),
            ) {
                Text(
                    stringResource(R.string.peta_area),
                    fontSize = 12.ssp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(5.sdp) // bottom margin
                        .align(TopCenter)
                )

                Text(
                    stringResource(R.string.cubitklik),
                    fontSize = 10.ssp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(20.sdp) // bottom margin
                        .align(TopCenter)
                )

                val scale = remember { mutableStateOf(1f) }
                val rotationState = remember { mutableStateOf(1f) }
                Box(
                    modifier = Modifier
                        .clip(RectangleShape) // Clip the box content
                        //.fillMaxSize() // Give the size you want..
                        .fillMaxWidth()
                        .pointerInput(Unit) {
                            detectTransformGestures { centroid, pan, zoom, rotation ->
                                scale.value *= zoom
                                rotationState.value += rotation
                            }

                        }
                        .padding(40.sdp) // bottom margin
                        .align(TopCenter)
                ) {
                    Image(
                        modifier = Modifier
                            .align(Alignment.Center) // keep the image centralized into the Box
                            .graphicsLayer(
                                // adding some zoom limits (min 50%, max 200%)
                                scaleX = maxOf(.5f, minOf(3f, scale.value)),
                                scaleY = maxOf(.5f, minOf(3f, scale.value)),
                                rotationZ = rotationState.value
                            ),
                        contentDescription = null,
                        painter = painterResource(R.drawable.diy)
                    )

                }
            }




        }
    }
}

