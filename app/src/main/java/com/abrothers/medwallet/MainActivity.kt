package com.abrothers.medwallet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.abrothers.medwallet.ui.theme.MedWalletTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MedWalletTheme {
                navController = rememberNavController()
                
                NavGraphSetup(navController = navController)
            }
        }
    }
}