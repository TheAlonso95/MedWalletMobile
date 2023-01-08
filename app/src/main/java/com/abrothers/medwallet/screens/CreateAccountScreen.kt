package com.abrothers.medwallet.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateAccountScreen(navController: NavController) {

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.primary) {
        Column(
            Modifier
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
                ) {
            Card(modifier = Modifier
                .weight(2f)
                .padding(8.dp), shape = RoundedCornerShape(32.dp)) {
                Column( Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Text(text = "Create account", fontWeight = FontWeight.Bold, fontSize = 32.sp)

                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CreateAccountScreenPreview() {
    CreateAccountScreen(navController = rememberNavController())
}