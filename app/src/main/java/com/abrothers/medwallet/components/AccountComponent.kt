package com.abrothers.medwallet.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.abrothers.medwallet.R
import com.abrothers.medwallet.data.remote.dto.SubAccount


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AccountComponent(account: SubAccount) {
    Card(
        elevation = CardDefaults.cardElevation(),
        onClick = { }
    ) {
        Column(
            modifier = Modifier.padding(15.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = rememberAsyncImagePainter(account.imageUrl),
                contentDescription = stringResource(R.string.user_avatar_description),
                modifier = Modifier.size(100.dp)
            )
            Text(text = account.name)
        }
    }
}