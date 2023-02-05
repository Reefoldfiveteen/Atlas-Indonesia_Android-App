//Arif Purnomo Aji
package com.reefii.atlasindonesia

import android.os.Build
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.reefii.atlasindonesia.R
import com.reefii.atlasindonesia.kodepembantu
import com.reefii.atlasindonesia.ui.theme.AtlasDarkTheme
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp



//mulai main activity
class Langchangcompose : kodepembantu() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            Langchanges()
        }

    }

    @RequiresApi(Build.VERSION_CODES.N)
    @Preview(showBackground = true)
    @Composable
    fun Langchanges() {
        AtlasDarkTheme {
            // Material Components like Button, Card, Switch, etc.

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                Text(stringResource(R.string.pengaturanmain),
                    fontSize = 20.ssp,
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(10.sdp) // bottom margin

                )

                Button(
                    onClick = {
                        //your onclick code
                        changlanges()
                    },
                    shape = RoundedCornerShape(20.sdp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colorScheme.primary, contentColor = MaterialTheme.colorScheme.onPrimary),
                    modifier = Modifier
                        .padding(5.sdp) // bottom margin
                ) {
                    Text(stringResource(R.string.pengaturan),
                        fontSize = 15.ssp,

                        )
                }

                Button(
                    onClick = {
                        changetheme()
                    },
                    shape = RoundedCornerShape(20.sdp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colorScheme.primary, contentColor = MaterialTheme.colorScheme.onPrimary),
                ) {
                    Text(
                        stringResource(R.string.pengaturantema),
                        fontSize = 15.ssp,

                        )
                }
            }

        }
    }





}