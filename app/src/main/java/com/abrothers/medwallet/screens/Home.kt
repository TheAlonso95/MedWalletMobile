package com.abrothers.medwallet.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abrothers.medwallet.ui.theme.MedWalletTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Column() {
        Text(text = "Welcome xxx")
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    MedWalletTheme {
        HomeScreen(navController = rememberNavController())
    }
}

