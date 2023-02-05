package com.reefii.atlasindonesia

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import com.reefii.atlasindonesia.ui.theme.AtlasDarkTheme


class zoom_gambar : AppCompatActivity() {

    //inisisalisasi oncreate
    //override fun onCreate(savedInstanceState: Bundle?) {
    //    super.onCreate(savedInstanceState)
    //    setContentView(R.layout.zoompeta)
    //konten xml
    //val imgSetPhotoZoom: ImageView = findViewById(R.id.zoomimg)
    //data xml dari img main
    //val tImgpul = Tampilan_Detail.EXTRA_IMG_PULAU
    //tImgpul?.let { Picasso.get().load(it).into(imgSetPhotoZoom) }
    //}
// }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // for resource ID
        val imagepulaus = intent.getIntExtra("imgpulausa", -1)

        setContent {
            //MaterialTheme {
            //Text(text = "Hello ${petaaa.namep}")
            //detil_compose()
            //}
            //MaterialTheme {
            AtlasDarkTheme() {

                val scale = remember { mutableStateOf(1f) }
                val rotationState = remember { mutableStateOf(1f) }
                Box(
                    modifier = Modifier
                        .clip(RectangleShape) // Clip the box content
                        .fillMaxSize() // Give the size you want...
                        .background(Color.Gray)
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
                                scaleX = maxOf(.5f, minOf(10f, scale.value)),
                                scaleY = maxOf(.5f, minOf(10f, scale.value)),
                                rotationZ = rotationState.value
                            ),
                        contentDescription = null,

                        painter = painterResource(imagepulaus)
                    )

                }

            }
        }
    }


//    val delimage = {
//        getIntent().removeExtra("imgpulausa");
//    }

    //    val tImgpul = Detail_Compose
//inisialisasi back button
    override fun onBackPressed() {
        intent.removeExtra("imgpulausa")

        }

}
