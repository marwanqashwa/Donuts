package com.example.donuts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donuts.R
import com.example.donuts.ui.theme.interMedium
import com.example.donuts.ui.theme.interNormal
import com.example.donuts.ui.theme.interSemiBold

@Composable
fun Buying() {

    Scaffold(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .fillMaxSize()
                .background(Color(0xFFFED8DF))
                .padding(it)
                .verticalScroll(state = rememberScrollState(), enabled = true)
        ) {
            Image(
                painter = painterResource(R.drawable.one_donut),
                null,
                Modifier
                    .fillMaxWidth()
                    .height(480.dp),
                contentScale = ContentScale.Crop
            )

            Box(
                Modifier
                    .fillMaxSize()
                    .offset(y = 4.dp)
            ) {
                Column(
                    Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp))
                        .background(Color(0xFFF5F5F5))
                        .padding(top = 35.dp, bottom = 40.dp)
                        .padding(horizontal = 40.dp)
                ) {
                    Text(
                        text = "Strawberry Wheel",
                        color = Color(0xFFFF7074),
                        fontSize = 30.sp,
                        fontFamily = interSemiBold,
                        letterSpacing = 0.sp,
                        lineHeight = 36.sp
                    )
                    Spacer(Modifier.height(30.dp))
                    Text(
                        text = "About Gonut",
                        color = Color(0xCC000000),
                        fontSize = 18.sp,
                        fontFamily = interSemiBold,
                        letterSpacing = 0.sp,
                        lineHeight = 22.sp
                    )
                    Spacer(Modifier.height(16.dp))
                    Text(
                        text = "These soft, cake-like Strawberry Frosted\nDonuts feature fresh strawberries and a\ndelicious fresh strawberry glaze frosting. Pretty\nenough for company and the perfect treat to\nsatisfy your sweet tooth.",
                        color = Color(0x99000000),
                        fontSize = 14.sp,
                        fontFamily = interNormal,
                        letterSpacing = 0.sp,
                        lineHeight = 17.sp
                    )
                    Spacer(Modifier.height(26.dp))
                    Text(
                        text = "Quantity",
                        color = Color(0xCC000000),
                        fontSize = 18.sp,
                        fontFamily = interMedium,
                        letterSpacing = 0.sp,
                        lineHeight = 22.sp
                    )
                    Spacer(Modifier.height(20.dp))

                    Row {
                        Box(
                            Modifier
                                .size(45.dp)
                                .clip(RoundedCornerShape(15.dp))
                                .background(Color.White)
                                .clickable(onClick = {})

                        ) {
                            Text(
                                text = "-",
                                color = Color.Black,
                                fontSize = 32.sp,
                                fontFamily = interMedium,
                                letterSpacing = 0.sp,
                                lineHeight = 39.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                        Spacer(Modifier.width(20.dp))
                        Box(
                            Modifier
                                .size(45.dp)
                                .clip(RoundedCornerShape(15.dp))
                                .background(Color.White)
                                .clickable(onClick = {})
                        ) {
                            Text(
                                text = "1",
                                color = Color.Black,
                                fontSize = 32.sp,
                                fontFamily = interMedium,
                                letterSpacing = 0.sp,
                                lineHeight = 39.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                        Spacer(Modifier.width(20.dp))
                        Box(
                            Modifier
                                .size(45.dp)
                                .clip(RoundedCornerShape(15.dp))
                                .background(Color.Black)
                                .clickable(onClick = {})
                        ) {
                            Text(
                                text = "+",
                                color = Color.White,
                                fontSize = 32.sp,
                                fontFamily = interMedium,
                                letterSpacing = 0.sp,
                                lineHeight = 39.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                    }
                    Spacer(Modifier.height(45.dp))

                    Row {
                        Text(
                            text = "£16",
                            color = Color.Black,
                            fontSize = 30.sp,
                            fontFamily = interSemiBold,
                            letterSpacing = 0.sp,
                            lineHeight = 36.sp,
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                        Spacer(Modifier.width(26.dp))
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(67.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .background(Color(0xFFFF7074))
                                .clickable(onClick = {})
                        ) {
                            Text(
                                text = "Add to Cart",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontFamily = interSemiBold,
                                letterSpacing = 0.sp,
                                lineHeight = 24.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                    }
                }

                Box(
                    Modifier
                        .size(45.dp)
                        .align(Alignment.TopEnd)
                        .offset(y = -22.dp, x = -16.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.White)
                        .clickable(onClick = {})
                ) {
                    Image(
                        painter = painterResource(R.drawable.heart),
                        null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }

            }

        }
    }
}

@Preview
@Composable
fun BuyingPreview() {
    Buying()
}