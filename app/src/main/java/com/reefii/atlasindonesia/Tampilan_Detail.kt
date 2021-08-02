//Arif Purnomo Aji
package com.reefii.atlasindonesia

//import plugin yg diperlukan
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class Tampilan_Detail : kodepembantu() {

    //inisisalisasi oncreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detil_view)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail View"
        actionbar.setDisplayHomeAsUpEnabled(true)

        //pengaturan konten xml
        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_logo_daerah)
        val imgSetPhotoPulau: ImageView = findViewById(R.id.img_pulau_daerah)
        //val tvUrutan: TextView = findViewById(R.id.urutan)
        val tvSetIden: TextView = findViewById(R.id.tv_set_identity)
        val petas: TextView = findViewById(R.id.tv_set_name_peta)


        //data xml dari array pilihan user
        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = EXTRA_IMG_LOGO
        val tImgpul = EXTRA_IMG_PULAU
        //val tRank = intent.getStringExtra(EXTRA_URUTAN)
        val tIden = intent.getStringExtra(EXTRA_IDENTITY)
        val peta = getString(R.string.peta_area)
        val PETA_AREA = "$peta $tName"

        //kirim data xml ke pengaturan konten xml
        tvSetName.text = tName
        tImg?.let { Picasso.get().load(it).into(imgSetPhoto) }
        tImgpul?.let { Picasso.get().load(it).into(imgSetPhotoPulau) }
        tvSetIden.text = tIden
        //tvUrutan.text = tRank
        petas.text = PETA_AREA


        //cari id foto daerah untuk ke zoom foto
        val image_zoom = findViewById<ImageView>(R.id.img_pulau_daerah)
        image_zoom.setOnClickListener {
            val zoomaja = Intent(this@Tampilan_Detail, zoom_gambar::class.java)
            startActivity(zoomaja)
        }
    }


    //objek pengambilan data array pilihan user
    companion object {
        const val EXTRA_NAME = "extra_name"
        var EXTRA_IMG_LOGO: Int? = null
        var EXTRA_IMG_PULAU: Int? = null
        const val EXTRA_IDENTITY = "extra_identity"
        const val EXTRA_URUTAN = "extra_urutan"
    }

    //fungsi kembali
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
