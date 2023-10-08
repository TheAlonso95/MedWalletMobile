package com.abrothers.medwallet.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abrothers.medwallet.components.AccountComponent
import com.abrothers.medwallet.data.remote.AccountService
import com.abrothers.medwallet.data.remote.dto.Account
import com.abrothers.medwallet.data.remote.dto.MedInfo
import com.abrothers.medwallet.ui.theme.MedWalletTheme
import org.koin.androidx.compose.get


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    service: AccountService = get()
) {
    //NOTE: This is just for testing

    val account = produceState(
        initialValue = Account(),
        producer = {
            value = service.getUserInfo()!!
        }
    )

    //TODO: Find how to change the state of a variable based on an external trigger,
    // for example when clicking in a different account card it should trigger an event that will
    // change the state of the meds list and fetch a new list with the provided id
    // on the card click event
    val meds = produceState(
        initialValue = emptyList<MedInfo>(),
        producer = {
            value = service.getProfileMeds("1")!!
        }
    )

    Box {
        val accountsListState = rememberLazyListState()
        val medsListState = rememberLazyListState()

        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = "Welcome ${account.value.name}")

            LazyRow(
                state = accountsListState,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(
                    account.value.accounts,
                    key = { it.subAccountId }
                ) { AccountComponent(it) }
            }

            LazyColumn(
                state = medsListState,
                verticalArrangement = Arrangement.SpaceEvenly
            )
            {
                items(
                    meds.value,
                    key = { it.id }
                ) {
                    //TODO: Create component to display meds
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
