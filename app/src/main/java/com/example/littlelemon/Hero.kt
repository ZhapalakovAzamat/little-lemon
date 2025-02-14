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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Hero() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
//            .fillMaxSize(0.5f)
            .background(Color(0xFF495E57))
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
                .fillMaxWidth()
                .padding(20.dp)
            ,horizontalArrangement = Arrangement.Start
        ) {
            Text(text = stringResource(id = R.string.descriptionone),
                Modifier.width(200.dp),
                color = Color.White,
                fontSize = 21.sp)
            Image(painter = painterResource(
                id = R.drawable.hero),
                contentDescription = "",
                Modifier.height(200.dp)
                    .padding(start = 20.dp)
                    .clip(RoundedCornerShape(20.dp))
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HeroPreview(){
    Hero()
}