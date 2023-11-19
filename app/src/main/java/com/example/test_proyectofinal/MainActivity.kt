package com.example.test_proyectofinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.test_proyectofinal.navegacion.nav

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            nav()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    nav()
}
