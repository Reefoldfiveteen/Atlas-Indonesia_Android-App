package com.reefii.atlasindonesia


import android.os.Build
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.reefii.atlasindonesia.ui.theme.AtlasDarkTheme
import com.reefii.atlasindonesia.ui.theme.md_theme_light_background
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

//mulai main activity
class Tentangcompose : kodepembantu() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        checkTheme()


        setContent {
            Tentang_compose()
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun Tentang_compose() {
        AtlasDarkTheme() {
            // Material Components like Button, Card, Switch, etc.

            Column(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .fillMaxSize(),
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
                    modifier = imageModifier
                        .size(120.sdp)
                        .clip(CircleShape)                       // clip to the circle shape
                        .border(2.sdp, Color.Gray, CircleShape)   // add a border (optional)
                )

                Text(stringResource(R.string.tentang_aplikasi),
                    fontSize = 20.ssp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .padding(8.sdp) // bottom margin

                )

                Text(stringResource(R.string.tentangapp),
                    fontSize = 13.ssp,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .padding(8.sdp) // bottom margin
                )


                Button(colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colorScheme.primary, contentColor = MaterialTheme.colorScheme.onPrimary),
                    onClick = { gmail()


                }) {

                    Text("Mail",
                        fontSize = 14.ssp,
                        //color = MaterialTheme.colorScheme.onPrimary,
                    )

                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))

                    val imageModifier2 = Modifier
                        .size(25.sdp)
                        .border(BorderStroke(1.sdp, Color.Transparent))
                        .background(Color.Transparent)

                    Image(
                        painter = painterResource(id = R.drawable.mail),
                        contentDescription = "Mail",
                        contentScale = ContentScale.Fit,
                        modifier = imageModifier2
                    )

                }

            }

        }

    }
}