package com.abrothers.medwallet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.abrothers.medwallet.di.AppModule
import com.abrothers.medwallet.ui.theme.MedWalletTheme
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startKoin {
            // Logger for development
            androidLogger()
            //Add module dependencies
            modules(AppModule)

            //Add app context
            androidContext(this@MainActivity)
        }

        setContent {
            MedWalletTheme {
                navController = rememberNavController()
                
                NavGraphSetup(navController = navController)
            }
        }
    }
}