package com.example.myapplication.ui.theme.ComponentsPR04

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.AccentColor

@Composable
fun OnboardHeader(text: String){
    Text(
        text=text,
        color=AccentColor,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Bold
    )
}

@Preview(showBackground = true)
@Composable
fun OnboardHeaderPreview() {
    OnboardHeader("Заголовок")
}