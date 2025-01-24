package com.example.littlelemon

import androidx.compose.runtime.Composable
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

