package com.example.littlelemon

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navHostController: NavHostController, userData: Boolean) {
    NavHost(
        navController = navHostController
        , startDestination =
        if (userData) Destinations.Onboarding.route
        else Destinations.Home.route
    ) {
        composable(Destinations.Home.route) {
            Home(navHostController)
        }
        composable(Destinations.Profile.route) {
            Profile(navHostController)
        }
        composable(Destinations.Onboarding.route) {
            Onboarding(navHostController)
        }
    }
}

const val USER_DATA = "userData"
const val FIRST_NAME = "firstName"
const val LAST_NAME = "lastName"
const val EMAIL = "email"