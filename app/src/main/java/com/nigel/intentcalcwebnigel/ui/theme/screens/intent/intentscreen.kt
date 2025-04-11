package com.nigel.intentcalcwebnigel.ui.theme.screens.intent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Intent_Screen(navController: NavHostController) {
    Column (verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)) {
        Text("Intent Screen",
            color=Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive
        )


        OutlinedButton(
            onClick = {/*TODO*/ },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(16.dp)
        )
        {
            Text(
                "Call ",
                fontSize = 30.sp
            )
        }
        OutlinedButton(onClick = {/*TODO*/},
            modifier=Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(16.dp)
        )
        {
            Text("Sms",
                fontSize = 30.sp)
        }
        OutlinedButton(
            onClick = {/*TODO*/ },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(16.dp)
        )
        {
            Text(
                "Share ",
                fontSize = 30.sp
            )
        }
        OutlinedButton(
            onClick = {/*TODO*/ },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(16.dp)
        )
        {
            Text(
                "Dial",
                fontSize = 30.sp
            )
        }

        OutlinedButton(
            onClick = {/*TODO*/ },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(16.dp)
        )
        {
            Text(
                "Camera ",
                fontSize = 30.sp
            )
        }
        OutlinedButton(
            onClick = {/*TODO*/ },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(16.dp)
        )
        {
            Text(
                "Email ",
                fontSize = 30.sp
            )
        }

        OutlinedButton(
            onClick = {/*TODO*/ },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(16.dp)
        )
        {
            Text(
                "Stk ",
                fontSize = 30.sp
            )
        }
    }

}

@Preview
@Composable
private fun Intentprev() {
    Intent_Screen(rememberNavController())

}