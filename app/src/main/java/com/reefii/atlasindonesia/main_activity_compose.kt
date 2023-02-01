package com.reefii.atlasindonesia

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview (showBackground = true)
@Composable
fun DetailKontensrt(navigateToProfile: (Item_Atlasin) -> Unit)  {

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
