//Arif Purnomo Aji
package com.reefii.atlasindonesia

//import plugin yg diperlukan
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService

class token_layanan_firebase: FirebaseMessagingService() {
    val TAG = "PushNotifService"
    lateinit var name: String

    //Mengambil Token Device
    fun onTokenRefresh() {
        val token = FirebaseMessaging.getInstance().token
        Log.d(TAG, "Token perangkat ini: ${token}")
    }

}