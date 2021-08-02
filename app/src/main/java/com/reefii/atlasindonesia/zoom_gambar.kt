package com.reefii.atlasindonesia

import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class zoom_gambar : kodepembantu() {

    //inisisalisasi oncreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.zoompeta)

        //konten xml
        val imgSetPhotoZoom: ImageView = findViewById(R.id.zoomimg)

        //data xml dari img main
        val tImgpul = Tampilan_Detail.EXTRA_IMG_PULAU
        tImgpul?.let { Picasso.get().load(it).into(imgSetPhotoZoom) }


    }

}

