package com.abrothers.medwallet

sealed class Screen(val route: String) {
    object Login: Screen(route = "login")
    object CreateAccount: Screen(route = "create_acc")
}