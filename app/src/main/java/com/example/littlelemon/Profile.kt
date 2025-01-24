package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Profile(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxWidth()
        , verticalArrangement = Arrangement.Center
        ){
        Image(
            painter = painterResource(id = R.drawable.logo)
            , contentDescription = "Logo"
            , modifier = Modifier
                . fillMaxWidth()
                . height(80.dp)
                . padding(20.dp)
                .align(Alignment.CenterHorizontally)
        )
        Box(modifier = Modifier
            .size(400.dp, 75.dp)
        ) {
            Text(
                text = "Profile information:"
                , fontSize = 20.sp
                , fontWeight = FontWeight.SemiBold
                , textAlign = TextAlign.Start
                , modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 50.dp, start = 10.dp)
            )
        }
    }
}



@Preview(showSystemUi = true)
@Composable
fun ProfileScreen(){
    Profile(navController = rememberNavController())
}