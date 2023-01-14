package com.abrothers.medwallet.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abrothers.medwallet.components.AccountComponent
import com.abrothers.medwallet.models.Account
import com.abrothers.medwallet.ui.theme.MedWalletTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    //NOTE: This is just for testing
    val account =
        Account("1", "Rafael", "https://img.freepik.com/free-icon/user_318-790139.jpg?w=2000")
    Box {
        val accountsListState = rememberLazyListState()

        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = "Welcome xxx")

            LazyRow(
                state = accountsListState,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(10) {
                    AccountComponent(account)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    MedWalletTheme {
        HomeScreen(navController = rememberNavController())
    }
}

