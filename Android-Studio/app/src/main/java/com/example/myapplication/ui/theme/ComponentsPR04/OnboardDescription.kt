package com.example.myapplication.ui.theme.ComponentsPR04

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Descriptions

@Composable
fun  OnboardDescription(text: String){
    Text(
        text=text,
        color=Descriptions,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight(400)
    )
}

@Preview(showBackground = true)
@Composable
fun OnboardDescriptionPreview(){
    OnboardDescription("Описание")
}