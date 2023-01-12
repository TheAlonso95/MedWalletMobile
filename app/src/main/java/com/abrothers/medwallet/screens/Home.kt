package com.abrothers.medwallet.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abrothers.medwallet.components.AccountComponent
import com.abrothers.medwallet.models.Account
import com.abrothers.medwallet.ui.theme.MedWalletTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    //NOTE: This is just for testing
    val account = Account("1", "Rafael", "https://img.freepik.com/free-icon/user_318-790139.jpg?w=2000")
    Column() {
        Text(text = "Welcome xxx")
        AccountComponent(account)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    MedWalletTheme {
        HomeScreen(navController = rememberNavController())
    }
}

