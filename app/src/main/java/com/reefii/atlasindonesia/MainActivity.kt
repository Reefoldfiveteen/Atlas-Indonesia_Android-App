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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.reefii.atlasindonesia.ui.theme.AtlasDarkTheme
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
            AtlasDarkTheme(){
            //AtlasDarkTheme() {
            //Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
                Navigation{
                    //startActivity(Intent(this, Detail_Compose::class.java))
                    val toast = Toast.makeText(applicationContext, it.namep, Toast.LENGTH_SHORT)
                        //Toast.makeText(applicationContext, it.namep, Toast.LENGTH_SHORT)
                    toast.show()
                    //startActivity(zoom_gambar.newIntent(this, it))
                    startActivity(Detail_Compose.newIntent(this, it))

                }
            //DetailKonten()
            }
        }


    }


    @RequiresApi(Build.VERSION_CODES.N)
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
            //.width(IntrinsicSize.Max)
            .fillMaxWidth()
            .fillMaxHeight()

        Image(
            painter = painterResource(R.drawable.atlasin2),
            contentDescription = "splash screen",
            contentScale = ContentScale.FillHeight,            // crop the image if it's not a square
            modifier = imageModifier

        )

        // AnimationEffect
        LaunchedEffect(key1 = true) {
            scale.animateTo(
                targetValue = 0.9f,
                animationSpec = tween(
                    durationMillis = 800,
                    easing = {
                        OvershootInterpolator(5f).getInterpolation(it)
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
    @RequiresApi(Build.VERSION_CODES.N)
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable

    fun TopBarrr() {

        // Create a boolean variable
        // to store the display menu state
        var mDisplayMenu by remember { mutableStateOf(false) }

        // fetching local context
        val mContext = LocalContext.current
        val context = LocalContext.current

        // Creating a Top bar
        AtlasDarkTheme() {
        TopAppBar(
            //title = { Text("Atlasindo", color = Color.White) },  Modifier.background(color =Color.Gray),
            title = { Text(text = getString(R.string.app_name),
                    style = MaterialTheme.typography.headlineMedium,
                    textAlign = TextAlign.Center)},
            actions = {

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
                    androidx.compose.material.DropdownMenuItem(
                        onClick =
                        {
                            //Toast.makeText(mContext, "Settings", Toast.LENGTH_SHORT).show()
                            //changlanges()
                            val Stgapp = Intent(this@MainActivity, Langchangcompose::class.java)
                            startActivity(Stgapp)
                        }) {
                        Text(text = stringResource(R.string.pengaturanmain))
                    }

                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    androidx.compose.material.DropdownMenuItem(
                        onClick =
                        {
                            //Toast.makeText(mContext, "Settings", Toast.LENGTH_SHORT).show()
                            //changlanges()
                            val ptkapp = Intent(this@MainActivity, sumbercompose::class.java)
                            startActivity(ptkapp)
                        }) {
                        Text(text = stringResource(R.string.pustaka))
                    }

                    // Creating dropdown menu item, on click
                    // would create a Toast message
                    androidx.compose.material.DropdownMenuItem(
                        onClick =
                        {
                            //Toast.makeText(mContext, "Settings", Toast.LENGTH_SHORT).show()
                            //changlanges()
                            val ttgapp = Intent(this@MainActivity, Tentangcompose::class.java)
                            startActivity(ttgapp)
                        }) {
                        Text(text = stringResource(R.string.tentang_aplikasi))
                    }

                }
            }
        )
        }
    }

    //composable view
    @RequiresApi(Build.VERSION_CODES.N)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    //@Preview(showBackground = true)
    @Composable
    fun DetailKonten(navigateToProfile: (Item_Atlasin) -> Unit) {
        loadLocale()
        Locale.current
        AtlasDarkTheme() {

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

    }


    //kembali_exit
    private val TIME_INTERVAL = 2000 // # milliseconds, desired time passed between two back presses.

    private var mBackPressed: Long = 0

    override fun onBackPressed() {
        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
            super.onBackPressed()
            finishAffinity()
            return
        } else {
            Toast.makeText(baseContext, getString(R.string.exit), Toast.LENGTH_SHORT)
                .show()
        }
        mBackPressed = System.currentTimeMillis()
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
//finish code

}