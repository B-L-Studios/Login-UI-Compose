package com.blc.loginui.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.blc.loginui.R
import com.blc.loginui.ui.components.CustomFilledButton
import com.blc.loginui.ui.components.CustomOutlinedButton
import com.blc.loginui.ui.components.DrawingZone

@Composable
fun MainScreen(navController: NavController) {
    Box {
        DrawingZone()

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                    .background(color = Color.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.books),
                    contentDescription = null,
                    modifier = Modifier.padding(32.dp)
                )

                Text(
                    text = "Welcome to the Online Library. A service dedicated to knowledgeable people of the world. This is one of the largest and most authoritative collections of online journals, books, and research resources, covering  life, health, social and physical sciences.",
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontFamily = FontFamily(Font(R.font.poppins))
                    )
                )

                CustomFilledButton(onClick = { navController.navigate("sign_up") }, text = "Sign Up")

                CustomOutlinedButton(onClick = { navController.navigate("sign_in") }, text = "Sign In")
            }
        }
    }
}