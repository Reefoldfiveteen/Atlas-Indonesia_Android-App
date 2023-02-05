package com.reefii.atlasindonesia


import android.content.Intent
import android.text.Layout.Alignment
import androidx.compose.compiler.plugins.kotlin.ComposeFqNames.remember
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.reefii.atlasindonesia.ui.theme.AtlasDarkTheme
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun AtlasCard(petaaa: Item_Atlasin, navigateToProfile: (Item_Atlasin) -> Unit) {
    AtlasDarkTheme() {

        Card(modifier = Modifier
                .padding(horizontal = 3.sdp, vertical = 3.sdp)
                .fillMaxWidth()
                .background(color = androidx.compose.material3.MaterialTheme.colorScheme.tertiaryContainer, shape = RoundedCornerShape(16.sdp),
            //elevation = 2.dp,
            //backgroundColor = Color.LightGray,
            //shape = RoundedCornerShape(corner = CornerSize(16.sdp),
            )


        ) {
            val peta_des by remember { mutableStateOf(petaaa.detailp) }

            Row(modifier = Modifier
                .padding(10.sdp)
                .clickable { navigateToProfile(petaaa) }) {
                Column(modifier = Modifier.weight(1f),
                    Arrangement.Center) {
                    Text(
                        text = stringResource(petaaa.namep),
                        style =
                        TextStyle(
                            color = androidx.compose.material3.MaterialTheme.colorScheme.onBackground,
                            fontSize = 15.ssp,
                            fontWeight = FontWeight.SemiBold,
                        ),
                    )


                    Box( modifier = Modifier
                        .height(55.sdp),) {

                        Text(
                            text = stringResource(peta_des),
                            // stringResource(petaaa.detailp),
                            style = TextStyle(
                                color = androidx.compose.material3.MaterialTheme.colorScheme.onBackground,
                                fontSize = 10.ssp,
                            ),
                            maxLines = 4,
                        )
                    }

                    //share action
                    val shareah = stringResource(R.string.daerah_ini)
                    val inidaerahnya = stringResource(petaaa.namep)
                    val diaplikasi = stringResource(R.string.diaplikasi)
                    val lamdasasa = "$shareah $inidaerahnya $diaplikasi"
                    val sendIntent: Intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, lamdasasa)
                        type = "text/plain"
                    }


                    val shareIntent = Intent.createChooser(sendIntent, null)
                    val context = LocalContext.current

                    OutlinedButton(
                        onClick = {
                            context.startActivity(shareIntent)

                        },
                        border = BorderStroke(1.sdp, color = androidx.compose.material3.MaterialTheme.colorScheme.onPrimary),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = androidx.compose.material3.MaterialTheme.colorScheme.primary,
                            contentColor = androidx.compose.material3.MaterialTheme.colorScheme.onPrimary),
                        modifier = Modifier
                            .absolutePadding(left = 50.sdp, bottom = 5.sdp)
                            .fillMaxWidth(1F),

                    ) {

                        Icon(
                            imageVector = Icons.Filled.Share,
                            contentDescription = "Share",
                            modifier = Modifier.size(ButtonDefaults.IconSize),
                        )
                        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing)
                            .background(Color.Transparent))
                        Text(
                            text = stringResource(R.string.share),
                            fontWeight = FontWeight.SemiBold,
                        )

                    }
                }

                Image(painter = painterResource(petaaa.logodaerahp),
                    contentDescription = "Profile Image",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .padding(8.sdp)
                        .size(80.sdp, 100.sdp)
                        .clip((RoundedCornerShape(corner = CornerSize(5.sdp))))

                )

            }
        }

    }


}
