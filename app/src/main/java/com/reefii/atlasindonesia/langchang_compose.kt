import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import com.reefii.atlasindonesia.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Preview
@Composable
fun langchang_compose() {
    MaterialTheme {
        // Material Components like Button, Card, Switch, etc.

        Column(modifier = Modifier.fillMaxSize().background(color = ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


        ) {
            Text(stringResource(R.string.pengaturanmain),
                color = Color.White,
                fontSize = 20.ssp,
                modifier = Modifier
                    .padding(15.sdp) // bottom margin

            )

            Button(
                onClick = {
                    //your onclick code
                },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray)
            ) {
                Text(stringResource(R.string.pengaturan),color = Color.White)
            }

            Button(
                onClick = {
                    //your onclick code
                },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray)
            ) {
                Text(stringResource(R.string.pengaturantema),color = Color.White)
            }
        }

    }

}