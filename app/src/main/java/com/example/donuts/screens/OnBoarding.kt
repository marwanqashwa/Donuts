package com.example.donuts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donuts.R
import com.example.donuts.ui.theme.interBold
import com.example.donuts.ui.theme.interMedium
import com.example.donuts.ui.theme.interSemiBold


@Composable
fun OnBoarding() {

    Scaffold(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .fillMaxSize()
                .background(Color(0xFFFED8DF))
                .padding(it)
                .verticalScroll(state = rememberScrollState(), enabled = true)
        ) {
            Image(
                painter = painterResource(R.drawable.onboarding_img), null, Modifier

                    .height(592.dp)
                    .fillMaxWidth(), contentScale = ContentScale.FillBounds
            )
            Column(
                Modifier
                    .offset(y = -100.dp)
                    .padding(start = 40.dp, bottom = 46.dp, end = 40.dp)
            ) {
                Text(
                    text = "Gonuts\nwith\nDonuts",
                    color = Color(0xFFFF7074),
                    fontSize = 54.sp,
                    fontFamily = interBold,
                    letterSpacing = 0.sp,
                    lineHeight = 65.sp
                )
                Spacer(Modifier.height(18.dp))
                Text(
                    text = "Gonuts with Donuts is a Sri Lanka\ndedicated food outlets for specialize\nmanufacturing of Donuts in Colombo,\nSri Lanka.",
                    color = Color(0xFFFF9494),
                    fontSize = 18.sp,
                    fontFamily = interMedium,
                    letterSpacing = 0.sp,
                    lineHeight = 22.sp
                )
                Spacer(Modifier.height(60.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(67.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color.White)
                ) {
                    Text(
                        text = "Get Started",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontFamily = interSemiBold,
                        letterSpacing = 0.sp,
                        lineHeight = 24.sp,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }

            }
        }


    }
}


@PreviewScreenSizes
@Composable
fun OnBoardingPreview() {
    OnBoarding()
}