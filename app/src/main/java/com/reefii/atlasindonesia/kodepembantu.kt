//Arif Purnomo Aji
package com.reefii.atlasindonesia

//import plugin yg diperlukan
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.LocaleList
import android.preference.PreferenceManager
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import java.util.*

//kode pembantu berupa plugin tambahan yang dapat digunakan untuk seluruh aktifitas
open class kodepembantu: AppCompatActivity() {

    //Fungsi tombol pada halaman Tentang Aplikasi
    //Facebook
    open fun facebook(view: View?) {
        val intent = Intent()
        intent.action = Intent.ACTION_VIEW
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        intent.data = Uri.parse("https://www.facebook.com/aji.klenggotan")
        startActivity(intent)
    }
    //gmail
    open fun gmail(view: View?) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "plain/text"
        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("arifpurnomoaji998@gmail.com"))
        intent.putExtra(Intent.EXTRA_SUBJECT, "subject")
        intent.putExtra(Intent.EXTRA_TEXT, "mail body")
        startActivity(Intent.createChooser(intent, ""))
    }

    //Undih buku atlas indonesia
    open fun unduhatlasindo(view: View?) {
        val intent = Intent()
        intent.action = Intent.ACTION_VIEW
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        intent.data = Uri.parse("https://atlas.big.go.id/eatlas1/Ebook/data_download")
        startActivity(intent)
    }

    //pengaturan bahasa
    @RequiresApi(Build.VERSION_CODES.N)
    open fun changlanges(view: View?) {
        val languages = arrayOf("Bahasa Indonesia", "English")
        val langSelectorBuilder = AlertDialog.Builder(this)
        langSelectorBuilder.setTitle(R.string.pengaturan)
        langSelectorBuilder.setSingleChoiceItems(languages, -1) { dialog, selection ->
            when(selection) {
                0 -> {
                    setLocale("id")
                }
                1 -> {
                    setLocale("en")
                }
            }
            recreate()
            dialog.dismiss()
        }
        langSelectorBuilder.create().show()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun setLocale(localeToSet: String) {
        val localeListToSet = LocaleList(Locale(localeToSet))
        LocaleList.setDefault(localeListToSet)
        resources.configuration.setLocales(localeListToSet)
        resources.updateConfiguration(resources.configuration, resources.displayMetrics)
        val sharedPref = getSharedPreferences("Settings", Context.MODE_PRIVATE).edit()
        sharedPref.putString("locale_to_set", localeToSet)
        sharedPref.apply()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun loadLocale() {
        val sharedPref = getSharedPreferences("Settings", Context.MODE_PRIVATE)
        val localeToSet: String = sharedPref.getString("locale_to_set", "")!!
        //val themeToSet: String = sharedPref.getString("theme_to_set", "")!!
        setLocale(localeToSet)
        //changetheme(themeToSet)
    }

    //pengaturan tema
    open fun changetheme(view: View?) {
        val themeset = arrayOf("Light","Dark","System")
        val temasetBuilder = AlertDialog.Builder(this)
        val checkedItem = ThemePreferences(this).darkMode
        temasetBuilder.setTitle(R.string.pengaturantema)
        temasetBuilder.setSingleChoiceItems(themeset, checkedItem) { dialog, selection ->
            when(selection) {
                0 -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                    ThemePreferences(this).darkMode = 0
                    delegate.applyDayNight()
                    dialog.dismiss()
                }
                1 -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                    ThemePreferences(this).darkMode = 1
                    delegate.applyDayNight()
                    dialog.dismiss()
                }
                2 -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                    ThemePreferences(this).darkMode = 2
                    delegate.applyDayNight()
                    dialog.dismiss()
                }
            }
            recreate()
            dialog.dismiss()
        }
        temasetBuilder.create().show()
    }

    //simpan pengaturan bahasa
    class ThemePreferences(context: Context?) {
        companion object {
            private const val DARK_STATUS = "DARK_STATUS"
        }
        private val preferences = PreferenceManager.getDefaultSharedPreferences(context)
        var darkMode = preferences.getInt(DARK_STATUS, 0)
            set(value) = preferences.edit().putInt(DARK_STATUS, value).apply()
    }
    fun checkTheme() {
        when (ThemePreferences(this).darkMode) {
            0 -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                delegate.applyDayNight()
            }
            1 -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                delegate.applyDayNight()
            }
            2 -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                delegate.applyDayNight()
            }
        }
    }

}
