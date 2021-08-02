//Arif Purnomo Aji
package com.reefii.atlasindonesia

//import plugin yg diperlukan
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

@Suppress("DEPRECATION")
class Splash_Atlasin : kodepembantu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //membuat tampilan fullscreen
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.splashscreen_atlasin)

        //setting waktu splash screen & jalankan main activity
        Handler().postDelayed({
            //mulai main activity
            startActivity(Intent(this@Splash_Atlasin, MainActivity::class.java))
            finish()
        }, 3000) //waktu delay splash screen
    }
}