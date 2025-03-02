package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Black)) { innerPadding ->
                    BusinessCardApp(
                        name = stringResource(R.string.name),
                        title = stringResource(R.string.title),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize().background(color = Color.LightGray)
    ) {
        IntroUI(name = name, title = title)
        AddressSection(
            tel = stringResource(R.string.phone_number),
            handle = stringResource(R.string.handle),
            email = stringResource(R.string.email)
        )
    }
}

@Composable
fun IntroUI(name: String, title: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            modifier = Modifier.background(color = Color.Black).width(104.dp),
            contentDescription = "Android Logo"
        )
        Text(
            text = name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = title,
            fontSize = 20.sp,
            color = Color(0xFF3ddc84),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Composable
fun AddressSection(tel: String, handle: String, email: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Row (
            modifier = Modifier.padding(bottom = 16.dp)
        ){
            Icon(
                Icons.Rounded.Call,
                tint = Color(0xFF3ddc84),
                contentDescription = "Call Icon",
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(text = tel)
        }
        Row(
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            Icon(
                Icons.Rounded.Share,
                tint = Color(0xFF3ddc84),
                contentDescription = "Handle Icon",
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(text = handle)
        }
        Row(
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            Icon(
                Icons.Rounded.Email,
                tint = Color(0xFF3ddc84),
                contentDescription = "Email Icon",
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(text = email)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCardApp("Abenezer Alebachew Endalew", "Software Engineer")
    }
}