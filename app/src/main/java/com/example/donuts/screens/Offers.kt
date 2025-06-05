package com.example.donuts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donuts.R
import com.example.donuts.ui.theme.interBold
import com.example.donuts.ui.theme.interMedium
import com.example.donuts.ui.theme.interNormal
import com.example.donuts.ui.theme.interSemiBold

@Composable
fun Offers() {
    Scaffold(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(it)
                .verticalScroll(state = rememberScrollState(), enabled = true)
        ) {
            Spacer(Modifier.height(80.dp))
            Row (
                Modifier.fillMaxWidth().padding(end = 40.dp)
            ){
                Column(Modifier.padding(start = 38.dp).weight(1f)) {
                    Text(
                        text = "Let’s Gonuts!",
                        color = Color(0xFFFF7074),
                        fontSize = 30.sp,
                        fontFamily = interSemiBold,
                        letterSpacing = 0.sp,
                        lineHeight = 36.sp
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                    text = "Order your favourite donuts from here",
                    color = Color(0x99000000),
                    fontSize = 14.sp,
                    fontFamily = interMedium,
                    letterSpacing = 0.sp,
                    lineHeight = 17.sp
                    )

                }
                Box(
                    Modifier.size(45.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.Black).clickable(onClick = {})
                )
            }
            Spacer(Modifier.height(54.dp))
            Text(
                text = "Today Offers",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = interSemiBold,
                letterSpacing = 0.sp,
                lineHeight = 24.sp,
                modifier = Modifier.padding(start = 40.dp)
            )
            Spacer(Modifier.height(25.dp))
            LazyRow (contentPadding = PaddingValues(40.dp), horizontalArrangement = Arrangement.spacedBy(54.dp)){
                item {
                    TodayOfferItem(
                        donutImg =   R.drawable.one_donut_offer,
                        title = "Strawberry Wheel",
                        description = "These Baked Strawberry\nDonuts are filled with\nfresh strawberries...",
                        priceAfter = 16,
                        priceBefore = 20
                    )
                }
                item {
                    TodayOfferItem(
                        donutImg =   R.drawable.one_donut_black,
                        title = "Chocolate Glaze",
                        description = "Moist and fluffy baked\nchocolate donuts full of\nchocolate flavor.",
                        priceAfter = 16,
                        priceBefore = 20
                    )
                }
            }





        }
    }
}


@Composable
fun TodayOfferItem(donutImg:Int,title:String,description:String,priceBefore:Int,priceAfter:Int){
  Box {
      Column (
          Modifier.height(325.dp)
              .width(193.dp)
              .clip(RoundedCornerShape(20.dp))
              .background(Color(0xFFD7E4F6))
      ){
          Column(Modifier.align(Alignment.Start).padding(top = 205.dp, start = 20.dp)) {
              Text(
                  text = title,
                  color = Color.Black,
                  fontSize = 16.sp,
                  fontFamily = interMedium,
                  letterSpacing = 0.sp,
                  lineHeight = 19.sp,
                  modifier = Modifier.padding(start = 2.dp)
              )
              Spacer(Modifier.height(8.dp))
              Text(
                  text = description,
                  color = Color(0x99000000),
                  fontSize = 12.sp,
                  fontFamily = interNormal,
                  letterSpacing = 0.sp,
                  lineHeight = 15.sp,
              )

              Row(Modifier.align(Alignment.End)) {
                  Text(
                      text = "\$$priceBefore",
                      color = Color(0x99000000),
                      fontSize = 14.sp,
                      fontFamily = interSemiBold,
                      letterSpacing = 0.sp,
                      lineHeight = 17.sp,
                      modifier = Modifier.align(Alignment.CenterVertically).padding(top = 4.dp),
                      textDecoration = TextDecoration.LineThrough
                  )
                  Spacer(Modifier.width(5.dp))
                  Text(
                      text = "\$$priceAfter",
                      color = Color.Black,
                      fontSize = 22.sp,
                      fontFamily = interBold,
                      letterSpacing = 0.sp,
                      lineHeight = 27.sp,
                  )
              }
          }

      }
      Box(
          Modifier
              .height(138.dp).width(137.dp)
              .align(Alignment.TopEnd)
              .offset(x=35.dp,y=50.dp)
              .clip(RoundedCornerShape(15.dp))
      ){
          Image(
              painter = painterResource(donutImg),
              null,
              contentScale = ContentScale.Crop,
              modifier = Modifier.fillMaxSize()

          )
      }
      Box(
          Modifier
              .size(35.dp)
              .align(Alignment.TopStart).offset(x = 15.dp,y=15.dp)
              .clip(RoundedCornerShape(100.dp))
              .background(Color.White)
              .clickable(onClick = {})
      ){
          Image(
              painter = painterResource(R.drawable.heart),
              null,
              contentScale = ContentScale.FillBounds,
              modifier = Modifier.size(20.dp,18.dp).align(Alignment.Center)

          )
      }
  }
}