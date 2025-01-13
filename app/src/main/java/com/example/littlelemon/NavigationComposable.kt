package com.example.littlelemon

import android.content.Context
import android.content.Context.MODE_PRIVATE
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(userDataStored: Boolean){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination =
        if (userDataStored)Onboarding.route
        else Home.route)
    {
        composable(Home.route){
            Home()
        }
        composable(Profile.route){
            Profile()
        }
        composable(Onboarding.route){
            Onboarding(navController)
        }
    }
}