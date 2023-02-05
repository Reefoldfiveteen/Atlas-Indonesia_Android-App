//Arif Purnomo Aji
package com.reefii.atlasindonesia

import java.io.Serializable

//memecah data dari sumber string
data class Item_data (
        val name: String?,
        val nourut: String?,
        val detail: String?,
        val imagelogodaerah: Int?,
        val imagepul: Int?,
        )

data class Item_Atlasin(
    val nourutp: Int,
    val namep: Int,
    val detailp: Int,
    val logodaerahp: Int = 0,
    val imagepulaup: Int = 0
) : Serializable
