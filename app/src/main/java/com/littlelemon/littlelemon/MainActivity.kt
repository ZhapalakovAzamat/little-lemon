package com.littlelemon.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.littlelemon.littlelemon.ui.theme.LittleLemonTheme
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import io.ktor.http.ContentType

class MainActivity : ComponentActivity() {
    private val httpClient = HttpClient(Android) {
        install(ContentNegotiation) {
            json(contentType = ContentType("text", "plain"))
        }
    }
    private val database by lazy {
        Room.databaseBuilder(applicationContext, AppDatabase::class.java, "database").build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                // A surface container using the 'background' color from the theme
                MyNavigation()
            }
        }
    }
}

@Composable
fun MyNavigation() {
    val navHostController = rememberNavController()
    val userData = true
    Navigation(
        navHostController = navHostController
        , userData = userData
    )
}
