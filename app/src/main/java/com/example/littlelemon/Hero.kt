package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Hero() {
    var search by rememberSaveable { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize(0.60f)
            .background(Color(0xFF495E57))
            .padding(bottom = 20.dp)
    ) {
        Text(
            text = stringResource(
                id = R.string.little_lemon),
            fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier
                .padding(start = 20.dp, top=20.dp)
        )
        Text(
            text = stringResource(
                id = R.string.chicago),
            fontSize = 24.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier
                .padding(start = 20.dp )
        )
        Row(
            Modifier
                .fillMaxWidth(1f)
                .fillMaxSize(0.8f)
                .padding(20.dp)
            ,horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = stringResource(id = R.string.descriptionone),
                Modifier.width(250.dp),
                color = Color.White,
                fontSize = 21.sp
            )
            Image(
                painter = painterResource(
                    id = R.drawable.hero
                ),
                contentDescription = "",
                Modifier
                    .size(1000.dp)
//                    . height(100.dp)
                    .fillMaxWidth(0.4f)

//                    .padding(start = 20.dp)
                    .clip(RoundedCornerShape(20.dp))
            )
        }
        TextField(
            value = search,
            onValueChange = {
                search = it
            },
            textStyle = TextStyle(fontSize = 25.sp),
            shape = RoundedCornerShape(10.dp),
            label = { Text("Enter search phrase") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun HeroPreview(){
    Hero()
}