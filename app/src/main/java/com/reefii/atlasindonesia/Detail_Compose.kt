package com.reefii.atlasindonesia

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextAlign
import com.reefii.atlasindonesia.ui.theme.AtlasDarkTheme
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp


class Detail_Compose : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            val peta_name by remember { mutableStateOf(petaaa.namep) }
            val peta_des by remember { mutableStateOf(petaaa.detailp) }
            val detail_daerah by remember { mutableStateOf(R.string.detail_derah) }
            val peta_area by remember { mutableStateOf(R.string.peta_area) }
            val cubitin by remember { mutableStateOf(R.string.cubitin) }
            val cubitklik by remember { mutableStateOf(R.string.cubitklik) }

            //MaterialTheme {
                //Text(text = "Hello ${petaaa.namep}")
                //detil_compose()
            //}
            AtlasDarkTheme() {
                Locale.current
            //AtlasDarkTheme() {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .background(MaterialTheme.colorScheme.surface),

                    //verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {

                    Text(
                        ///text = stringResource(petaaa.namep),
                        text = stringResource(peta_name),
                        textAlign = TextAlign.Center,
                        fontSize = 15.ssp,
                        color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(5.sdp),

                    )

                    val imageModifierr = Modifier
                        .size(100.sdp)
                        .border(BorderStroke(1.sdp, Color.Transparent))
                        .background(Color.Transparent)
                        .padding(5.sdp)

                    Image(
                        painter = painterResource(petaaa.logodaerahp),
                        contentDescription = "LOGO",
                        contentScale = ContentScale.Fit,
                        modifier = imageModifierr
                    )

                    Box(
                    ) {
                        Text(
                            //text = stringResource(R.string.detail_derah),
                            text = stringResource(detail_daerah),
                            fontSize = 12.ssp,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier
                                .padding(5.sdp) // bottom margin
                                .align(Alignment.TopCenter)

                        )

                        Text(
                            //text = stringResource(petaaa.detailp),
                            text = stringResource(peta_des),
                            fontSize = 11.ssp,
                            color = MaterialTheme.colorScheme.onBackground,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(20.sdp) // bottom margin
                                .align(Alignment.TopCenter)
                        )
                    }


                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .align(Alignment.CenterHorizontally),
                    ) {
                        Text(
                            text = stringResource(peta_area) +" "+ stringResource(peta_name),
                            fontSize = 12.ssp,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onBackground,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(5.sdp) // bottom margin
                                .align(Alignment.TopCenter)
                        )

                        Text(
                            stringResource(cubitklik),
                            fontSize = 10.ssp,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier
                                .padding(20.sdp) // bottom margin
                                .align(Alignment.TopCenter)
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
                                .align(Alignment.TopCenter)
                        ) {
                            Image(
                                modifier = Modifier
                                    .align(Alignment.Center) // keep the image centralized into the Box
                                    .graphicsLayer(
                                        // adding some zoom limits (min 50%, max 200%)
                                        scaleX = maxOf(.5f, minOf(10f, scale.value)),
                                        scaleY = maxOf(.5f, minOf(10f, scale.value)),
                                        rotationZ = rotationState.value
                                    )

                                    .clickable(
                                        enabled = true,

                                        onClickLabel = "Clickable image",
                                        onClick = {
                                            //moveimage()
                                            //startActivity(zoom_gambar.newIntent(this, gambar))

                                            Toast
                                                .makeText(applicationContext,
                                                    getString(cubitin),
                                                    Toast.LENGTH_SHORT)
                                                .show()


                                            //startActivity(Intent(this, zoom_gambar::class.java))
                                            //val ttgapp =
                                            //Intent(this@Detail_Compose, zoom_gambar::class.java)
                                            //startActivity(ttgapp)

                                            /////

                                            setContent {
                                                AtlasDarkTheme() {

                                                    val scale = remember { mutableStateOf(1f) }
                                                    val rotationState =
                                                        remember { mutableStateOf(1f) }
                                                    Box(
                                                        modifier = Modifier
                                                            .clip(RectangleShape) // Clip the box content
                                                            .fillMaxSize() // Give the size you want...
                                                            .background(Color.Black)
                                                            .pointerInput(Unit) {
                                                                detectTransformGestures { centroid, pan, zoom, rotation ->
                                                                    scale.value *= zoom
                                                                    rotationState.value += rotation
                                                                }
                                                            }
                                                    ) {

                                                        Image(
                                                            modifier = Modifier
                                                                .align(Alignment.Center) // keep the image centralized into the Box
                                                                .graphicsLayer(
                                                                    // adding some zoom limits (min 50%, max 200%)
                                                                    scaleX = maxOf(.5f,
                                                                        minOf(10f, scale.value)),
                                                                    scaleY = maxOf(.5f,
                                                                        minOf(10f, scale.value)),
                                                                    rotationZ = rotationState.value
                                                                ),
                                                            contentDescription = null,

                                                            painter = painterResource(petaaa.imagepulaup)
                                                        )

                                                    }

                                                }
                                            }

                                            /////

                                        }
                                    )
                                ,
                                contentDescription = null,
                                painter = painterResource(petaaa.imagepulaup)
                            )

                        }
                    }




                }
            }
        }
    }


    companion object {
        private const val PETAAA_ID = "petaaa_id"
        fun newIntent(context: Context, petaaa: Item_Atlasin) =
            Intent(context, Detail_Compose::class.java).apply {
                putExtra(PETAAA_ID, petaaa)
            }
    }

    private val petaaa: Item_Atlasin by lazy {
        intent?.getSerializableExtra(PETAAA_ID) as Item_Atlasin
    }

    //val moveimage = {
       //     val sendImg = Intent(this@Detail_Compose,
       //     zoom_gambar::class.java)
       // sendImg.putExtra("imgpulausa", petaaa.imagepulaup)
       // startActivity(sendImg)

    //}


}

