package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MenuListScreen() {
    Column {
        Text(
            text = "ORDER FOR DELIVERY!",
            modifier = Modifier
                .padding(5.dp)
            , fontWeight = FontWeight.Bold
        )
        LazyRow {
            items(Categories){ category ->
                MenuCategory(category)
            }
        }
        Divider(
            modifier = Modifier.padding(5.dp)
            , color = Color.White
            , thickness = 1.dp
        )
        LazyColumn {
            items(Dishes){Dish ->
                MenuDish(Dish)
            }
        }
    }
}

@Composable
fun MenuCategory(category: String) {
    Button(
        onClick = {/*TODD*/}
        , colors = ButtonDefaults.buttonColors(Color.LightGray)
        , shape = RoundedCornerShape(40)
        , modifier = Modifier.padding(5.dp)
    ){
        Text(
            text = category,
            color = Color.Black)
    }
}

@Composable
fun MenuDish(Dish: Dish) {
    Card {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Column {
                Text(text = Dish.name
                    , fontSize = 18.sp
                    , fontWeight = FontWeight.Bold
                )
                Text(text = Dish.description
                    , color = Color.Gray
                    , modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f)
                )
                Text(text = Dish.price
                    , color = Color.Black
                    , fontWeight = FontWeight.Bold
                )
            }
            Image(
                painter = painterResource(id = Dish.image)
                , contentDescription =""
            )
        }
    }
    Divider(
        modifier = Modifier
            .padding(start = 8.dp, end = 8.dp)
        , color = Color.White
        , thickness = 1.dp
    )
}
