//Arif Purnomo Aji
package com.reefii.atlasindonesia

//import plugin yg diperlukan
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem

class Tentang_app: kodepembantu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tentang)

        // tambahkan action bar
        val actionBar = getSupportActionBar()

        // menambah tampilan back button pada action bar
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_new_24)
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
    }

    // menambah fungsi kembali pada back button
    override fun onContextItemSelected(item: MenuItem): Boolean {
        val myIntent = Intent(applicationContext, MainActivity::class.java)
        startActivity(myIntent)
        return true
    }

    //inisialisasi back button
    override fun onBackPressed() {
        finish()
        val intent = Intent(this@Tentang_app, MainActivity::class.java)
        startActivity(intent)
    }
}