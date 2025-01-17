package com.example.littlelemon

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.service.autofill.UserData
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(navController: NavController){
    val navController = rememberNavController()
    NavHost(
        navController = navController
        , startDestination =
        if (UserData == SharedPreferences) { Onboarding.route
        } else {Home.route}
    ) {
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