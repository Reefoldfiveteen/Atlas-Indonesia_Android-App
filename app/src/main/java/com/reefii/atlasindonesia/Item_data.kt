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

data class EmployDetails(val id: Int,
                         val title: String,
                         val sex: String,
                         val age: Int,
                         val description: String,
                         val ImageId: Int = 0)


data class Item_Atlasin(
    val nourutp: Int,
    val namep: String,
    val detailp: String,
    val logodaerahp: Int = 0,
    val imagepulaup: Int = 0
)

data class Puppy(
    val nourutp: Int,
    val namep: String,
    val detailp: String,
    val logodaerahp: Int = 0,
    val imagepulaup: Int = 0
) : Serializable