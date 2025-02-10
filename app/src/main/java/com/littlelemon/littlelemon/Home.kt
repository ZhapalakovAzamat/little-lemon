package com.littlelemon.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Home(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top=15.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                horizontalArrangement = Arrangement.Center, modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxSize(0.1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .fillMaxWidth(0.70f)
                        .height(100.dp)
                        .padding(start = 100.dp, end = 30.dp)
                )
                Image(painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .height(100.dp)
                        .padding(start = 20.dp)
                        .clickable { navController.navigate(Destinations.Profile.route) }
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPrev(){
    val navController = rememberNavController()
    Home(navController)
}