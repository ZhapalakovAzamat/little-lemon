package com.example.littlelemon

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun Onboarding(
    navController: NavHostController
) {
    val firstName = remember{mutableStateOf("")}
    val lastName = remember{mutableStateOf("")}
    val email = remember{mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .height(80.dp)
                .fillMaxWidth()
                .padding(20.dp)
                .align(Alignment.CenterHorizontally)
        )
        Box(
            modifier = Modifier
                .background(Color(0xFF485E57))
                .padding(0.dp, 48.dp, 0.dp, 48.dp)
                .fillMaxWidth()

        ){
            Text(
                text = ("Let's get to know you"),
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()

            )
        }
        Box(modifier = Modifier
            .size(400.dp, 75.dp)
        ) {
            Text(
                text = ("Personal information"),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 50.dp, start = 10.dp)
            )
        }
        Text(
            text = ("First name"),
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 10.dp)
        )
        OutlinedTextField(
            value = firstName.value,
            textStyle = TextStyle(fontSize = 25.sp),
            shape = RoundedCornerShape(10.dp),
            onValueChange = {newText -> firstName.value = newText},
            label = { Text("First name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        )
        Text(
            text = ("Last name"),
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 10.dp)
        )
        OutlinedTextField(
            value = lastName.value,
            textStyle = TextStyle(fontSize = 25.sp),
            shape = RoundedCornerShape(10.dp),
            onValueChange = {newText -> lastName.value = newText},
            label = { Text("Last name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        )
        Text(
            text = ("Email"),
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 10.dp)
        )
        OutlinedTextField(
            value = email.value,
            textStyle = TextStyle(fontSize = 25.sp),
            shape = RoundedCornerShape(10.dp),
            onValueChange = {newText -> email.value = newText},
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        )
        Button(
            onClick = { /*TODO*/ },
            border = BorderStroke(1.dp, Color.Red),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors
                (Color(0xFFDCAB3B)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(
                text = "Register",
                color = Color.Black
            )
        }
    }
}

//@Preview(showSystemUi = true)
//@Composable
//private fun OnboardingPreview() {
//    Onboarding(navController)
//}
