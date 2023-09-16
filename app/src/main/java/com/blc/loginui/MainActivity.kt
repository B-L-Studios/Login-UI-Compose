package com.blc.loginui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.blc.loginui.ui.screen.MainScreen
import com.blc.loginui.ui.screen.SignInScreen
import com.blc.loginui.ui.screen.SignUpScreen
import com.blc.loginui.ui.theme.LoginUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginUITheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "main") {
                        composable("main") {
                            MainScreen(navController = navController)
                        }
                        composable("sign_in") {
                            SignInScreen(navController = navController)
                        }
                        composable("sign_up") {
                            SignUpScreen(navController = navController)
                        }
                    }
                }
            }
        }
    }
}