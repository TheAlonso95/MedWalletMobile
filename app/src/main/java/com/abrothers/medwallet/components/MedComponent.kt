package com.abrothers.medwallet.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.abrothers.medwallet.data.remote.dto.MedInfo

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun MedComponent(it: MedInfo) {
    Card() {
        Row(
            modifier = Modifier.padding(15.dp)
            ) {

        }
    }
}