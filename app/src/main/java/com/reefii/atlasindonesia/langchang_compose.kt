
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
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Preview
@Composable
fun langchang_compose() {
    MaterialTheme {
        // Material Components like Button, Card, Switch, etc.

        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Text(stringResource(R.string.pengaturanmain),
                color = Color.White,
                fontSize = 20.ssp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(10.sdp) // bottom margin
            )

            Button(
                onClick = {
                    //your onclick code
                },
                shape = RoundedCornerShape(20.sdp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),
                modifier = Modifier
                    .padding(5.sdp) // bottom margin
            ) {
                Text(stringResource(R.string.pengaturan),
                    color = Color.White,
                    fontSize = 15.ssp,

                )
            }

            Button(
                onClick = {
                    //your onclick code
                },
                shape = RoundedCornerShape(20.sdp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray)
            ) {
                Text(stringResource(R.string.pengaturantema),
                    color = Color.White,
                    fontSize = 15.ssp,

                )
            }
        }

    }

}