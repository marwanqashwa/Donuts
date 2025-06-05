package com.example.donuts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.donuts.screens.Buying
import com.example.donuts.screens.OnBoarding

import com.example.donuts.ui.theme.DonutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DonutsTheme {
              OnBoarding()
//                Buying()
            }
        }
    }
}
