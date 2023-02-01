//Arif Purnomo Aji
package com.reefii.atlasindonesia

//import plugin yg diperlukan

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.*
import android.view.animation.OvershootInterpolator
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay


//mulai main activity
class MainActivity : kodepembantu() {

    //oncreate
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadLocale()
        checkTheme()

        //migrate to composable
        setContent {
            MaterialTheme{
            //Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
                Navigation{startActivity(Intent(this, Detail_Compose::class.java))}
                //DetailKonten()
            }


        }

    }
    @Composable
    fun Navigation(navigateToProfile: (Item_Atlasin) -> Unit) {
        val navController = rememberNavController()
        NavHost(navController = navController,
            startDestination = "splash_screen") {
            composable("splash_screen") {
                SplashScreen(navController = navController)
            }
            // Main Screen
            composable("main_screen") {
                DetailKonten(navigateToProfile = navigateToProfile)
            }
        }
    }

    @Composable
    fun SplashScreen(navController: NavController) {
        val scale = remember {
            androidx.compose.animation.core.Animatable(0f)
        }

        val imageModifier = Modifier
            .width(IntrinsicSize.Max)

        Image(
            painter = painterResource(R.drawable.atlasin2),
            contentDescription = "splash screen",
            contentScale = ContentScale.Crop,            // crop the image if it's not a square
            modifier = imageModifier

        )

        // AnimationEffect
        LaunchedEffect(key1 = true) {
            scale.animateTo(
                targetValue = 0.7f,
                animationSpec = tween(
                    durationMillis = 800,
                    easing = {
                        OvershootInterpolator(4f).getInterpolation(it)
                    })
            )
            delay(3000L)
            navController.navigate("main_screen")
        }

        // Image
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()) {
            Image(painter = painterResource(id = R.drawable.atlasin1),
                contentDescription = "Logo",
                modifier = Modifier.scale(scale.value))
        }
    }



    // Creating a composable function
    // to display Top Bar and options menu
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TopBarrr() {

        // Create a boolean variable
        // to store the display menu state
        var mDisplayMenu by remember { mutableStateOf(false) }

        // fetching local context
        val mContext = LocalContext.current

        // Creating a Top bar
        TopAppBar(
            //title = { Text("Atlasindo", color = Color.White) },  Modifier.background(color =Color.Gray),
            title = { Text(text = getString(R.string.app_name),
                    style = MaterialTheme.typography.headlineMedium,
                    textAlign = TextAlign.Center)},
            actions = {

                // Creating Icon button favorites, on click
                // would create a Toast message
                IconButton(onClick = { Toast.makeText(mContext, "Favorite", Toast.LENGTH_SHORT).show() }) {
                    Icon(Icons.Default.Favorite, "")
                }

                // Creating Icon button for dropdown menu
                IconButton(onClick = { mDisplayMenu = !mDisplayMenu }) {
                    Icon(Icons.Default.MoreVert, "")
                }

                // Creating a dropdown menu
                DropdownMenu(
                    expanded = mDisplayMenu,
                    onDismissRequest = { mDisplayMenu = false }
                ) {

                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    androidx.compose.material.DropdownMenuItem(onClick = { Toast.makeText(mContext, "Settings", Toast.LENGTH_SHORT).show() }) {
                        Text(text = "Settings")
                    }

                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    androidx.compose.material.DropdownMenuItem(onClick = { Toast.makeText(mContext, "Logout", Toast.LENGTH_SHORT).show() }) {
                        Text(text = "Logout")
                    }
                }
            }
        )
    }

    //composable view
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    //@Preview(showBackground = true)
    @Composable
    fun DetailKonten(navigateToProfile: (Item_Atlasin) -> Unit) {

        Column() {

            //Loading Top App Bar
            TopBarrr()

            //Initiate Data from String.XML
            Scaffold(
                content = {
                    //AtlasListContent()
                    val atlasindo = remember { DataProvider.Item_Atlasin }
                    LazyColumn(
                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                    ) {
                        items(
                            items = atlasindo,
                            itemContent = {
                                AtlasCard(petaaa = it, navigateToProfile)
                            })
                    }

                }
            )
        }

    }



    //menambah pilihan option menu
    //-//-override fun onCreateOptionsMenu(menu: Menu): Boolean {
    //-//-menuInflater.inflate(R.menu.pilihan_menu, menu)
    //-//-return super.onCreateOptionsMenu(menu)
    //-//-}

    //setting listener option menu pilihan user
    //-//-override fun onOptionsItemSelected(item: MenuItem): Boolean {
    //-//-setMode(item.itemId)
    //-//-return super.onOptionsItemSelected(item)
    //-//-}

    //-//-private fun setMode(selectedMode: Int) {
    //-//-when (selectedMode) {
            //setting
    //-//-R.id.action_set -> {
    //-//-val objek2 = layoutInflater
    //-//-      val v2 = objek2.inflate(R.layout.langchang, null)
    //-//-      val a = AlertDialog.Builder(this@MainActivity)
    //-//-      a.setView(v2)
    //-//-      a.show()
    //-//-      a.setCancelable(true)
    //-//-  }
            //sumber
    //-//-  R.id.action_sumber -> {
    //-//-      val objek2 = layoutInflater
    //-//-      val v2 = objek2.inflate(R.layout.sumber, null)
    //-//-      val a = AlertDialog.Builder(this@MainActivity)
    //-//-      a.setView(v2)
    //-//-      a.show()
    //-//-      a.setCancelable(true)
    //-//-  }
            //tentang aplikasi
    //-//-  R.id.action_tentangapp -> {
    //-//-      val ttgapp = Intent(this@MainActivity, Tentang_app::class.java)
    //-//-      startActivity(ttgapp)
    //-//-  }
    //-//-}
    //-//-}

    //tombol share
    fun shareme(view: View?) {
        val intent = Intent()
        val shareah = getString(R.string.daerah_ini)
        val inidaerahnya = intent.getStringExtra(Tampilan_Detail.EXTRA_NAME)
        val diaplikasi = getString(R.string.diaplikasi)
        val lamdasasa = "$shareah $inidaerahnya $diaplikasi"
        intent.action = Intent.ACTION_SEND
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, lamdasasa)
        startActivity(Intent.createChooser(intent, "Share with:"))
    }



}
//finish code
