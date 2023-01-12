package com.abrothers.medwallet.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import coil.compose.rememberAsyncImagePainter
import com.abrothers.medwallet.R
import com.abrothers.medwallet.models.Account


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AccountComponent(account: Account) {
    Column() {
        Card() {
            Image(
                painter = rememberAsyncImagePainter(account.imageUrl),
                contentDescription = stringResource(R.string.user_avatar_description)
            )
            /*AsyncImage(
                model = account.imageUrl,
                contentDescription = stringResource(R.string.user_avatar_description)
            )*/
            Text(text = account.name)
        }
    }
}