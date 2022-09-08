package com.example.semana2_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.semana2_1.ui.theme.Semana2_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            principal()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppBar() {
    TopAppBar(title = { Text(text = "UPC MOVIL")},
        backgroundColor = Color.Blue,
        contentColor = Color.White)
}

@Preview(showBackground = true)
@Composable
fun principal() {
    AppBar()

    var txtMail by remember { mutableStateOf("") }
    var txtPas by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "UPC",
            modifier = Modifier.height(300.dp))

        Text(text = "Login users",
            fontSize = 32.sp,
            color=Color.Blue,
            textAlign = TextAlign.Center)


        OutlinedTextField(
            value = txtMail,
            modifier = Modifier.padding(15.dp),
            keyboardOptions = KeyboardOptions(keyboardType =KeyboardType.Email),
            label = { Text(text="Ingrese Correo") },
            onValueChange = {

            })

        OutlinedTextField(
            value = txtPas,
            modifier = Modifier.padding(15.dp),
            keyboardOptions = KeyboardOptions(keyboardType =KeyboardType.Password),
            label = { Text(text="Ingrese Password") },
            visualTransformation = PasswordVisualTransformation(),
            onValueChange = {

            })

        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
            modifier=Modifier.padding(20.dp).width(250.dp),
            onClick = { /*TODO*/ })
        {
            Text(text = "Iniciar Sesión",color=Color.White)
        }

    }

}