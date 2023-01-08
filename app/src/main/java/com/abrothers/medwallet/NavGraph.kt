package com.abrothers.medwallet

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.abrothers.medwallet.screens.CreateAccountScreen
import com.abrothers.medwallet.screens.LoginScreen

@Composable
fun NavGraphSetup(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable( route = Screen.Login.route) {
            LoginScreen(navController = navController)
        }
        composable(route = Screen.CreateAccount.route) {
            CreateAccountScreen(navController = navController)
        }
    }
}