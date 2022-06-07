package com.abrothers.medwallet.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateAccountScreen(navController: NavController) {

   Column(
       Modifier
           .fillMaxWidth()
           .padding(12.dp)) {
       Text(
           text = "Create Account",
           fontSize = MaterialTheme.typography.titleMedium.fontSize,
           fontWeight = FontWeight.Bold
       )
   }
}

@Composable
@Preview(showBackground = true)
fun CreateAccountScreenPreview() {
    CreateAccountScreen(navController = rememberNavController())
}