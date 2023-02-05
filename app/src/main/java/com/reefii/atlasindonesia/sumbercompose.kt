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
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.reefii.atlasindonesia.ui.theme.AtlasDarkTheme
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

//mulai main activity
class sumbercompose : kodepembantu() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            sumber_compose()
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun sumber_compose() {
        AtlasDarkTheme {
            // Material Components like Button, Card, Switch, etc.

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                val imageModifier = Modifier
                    .size(150.sdp)
                    .border(BorderStroke(1.sdp, Color.Transparent))
                    .background(Color.Transparent)
                    .padding(15.sdp)

                Image(
                    painter = painterResource(id = R.drawable.cover_atlasin),
                    contentDescription = stringResource(id = R.string.sumber_2),
                    contentScale = ContentScale.Fit,
                    modifier = imageModifier
                )


                Text(stringResource(R.string.sumber_1),
                    fontSize = 13.ssp,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .padding(1.sdp) // bottom margin
                )

                Text(stringResource(R.string.sumber_2),
                    fontSize = 13.ssp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFE64A19),
                    modifier = Modifier
                        .padding(1.sdp) // bottom margin
                )

                Text(stringResource(R.string.sumber_3),
                    fontSize = 13.ssp,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .padding(15.sdp) // bottom margin
                )


                Button(colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colorScheme.primary, contentColor = MaterialTheme.colorScheme.onPrimary),
                    onClick = { unduhatlasindo() }


                )

                {

                    Text(
                        stringResource(id = R.string.unduh_buku_atlas_indonesia),
                        fontSize = 14.ssp,
                        //color = MaterialTheme.colorScheme.onPrimary,
                    )

                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))

                    val imageModifier2 = Modifier
                        .size(25.sdp)
                        .border(BorderStroke(1.sdp, Color.Transparent))
                        //.background(Color.Transparent)

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
}
