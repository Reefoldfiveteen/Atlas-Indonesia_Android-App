//Arif Purnomo Aji
package com.reefii.atlasindonesia

//import plugin yg diperlukan
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//mulai main activity
class MainActivity : kodepembantu() {

    //smutable data
    private var itemData: MutableList<Item_data> = mutableListOf()

    //oncreate
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadLocale()
        checkTheme()
        setContentView(R.layout.activity_main)
        val list = findViewById<RecyclerView>(R.id.namee_list)
        initData()

        //load data array
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = RecyclerViewAdapter(this, itemData) {
            //load array data untuk persiapan transfer ke view detail
            val name = it.name
            val rank = it.nourut
            val detail = it.detail
            val image = it.imagelogodaerah
            val imagepul = it.imagepul
            //transfer data yang dipilih user ke detail view
            val moveDetail = Intent(this, Tampilan_Detail::class.java)
            moveDetail.putExtra(Tampilan_Detail.EXTRA_NAME, name)
            Tampilan_Detail.EXTRA_IMG_LOGO = image
            Tampilan_Detail.EXTRA_IMG_PULAU = imagepul
            moveDetail.putExtra(Tampilan_Detail.EXTRA_URUTAN, rank)
            moveDetail.putExtra(Tampilan_Detail.EXTRA_IDENTITY, detail)
            //tampilkan toast array yang dipilih user
            val toast = Toast.makeText(applicationContext, it.name, Toast.LENGTH_SHORT)
            toast.show()
            startActivity(moveDetail)
        }


    }


    //init data ke tampilan xml
    private fun initData() {
        val name = resources.getStringArray(R.array.nameea)
        val rank = resources.getStringArray(R.array.urutannya)
        val detail = resources.getStringArray(R.array.detaillnya)
        val image = resources.obtainTypedArray(R.array.photo_logonya)
        val imagepulau = resources.obtainTypedArray(R.array.photo_pulaunya)
        itemData.clear()
        for (i in name.indices) {
            itemData.add(Item_data(
                    name[i],
                    rank[i],
                    detail[i],
                    image.getResourceId(i, 0),
                    imagepulau.getResourceId(i, 0),
            ))
        }
        image.recycle()
        imagepulau.recycle()
    }

    //menambah pilihan option menu
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.pilihan_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //setting listener option menu pilihan user
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            //setting
            R.id.action_set -> {
                val objek2 = layoutInflater
                val v2 = objek2.inflate(R.layout.langchang, null)
                val a = AlertDialog.Builder(this@MainActivity)
                a.setView(v2)
                a.show()
                a.setCancelable(true)
            }
            //sumber
            R.id.action_sumber -> {
                val objek2 = layoutInflater
                val v2 = objek2.inflate(R.layout.sumber, null)
                val a = AlertDialog.Builder(this@MainActivity)
                a.setView(v2)
                a.show()
                a.setCancelable(true)
            }
            //tentang aplikasi
            R.id.action_tentangapp -> {
                val ttgapp = Intent(this@MainActivity, Tentang_app::class.java)
                startActivity(ttgapp)
            }
        }
    }

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
