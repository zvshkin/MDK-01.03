package com.example.myapplication.ui.theme.ComponentsPR04

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.ClickableText
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ClickableTextExample(modifier: Modifier = Modifier,
                        text: String,
                         onClick: () ->Unit) {
    Text(
        text = text,
        color = ClickableText,
        modifier = modifier
            .clickable {onClick()}
            .padding(8.dp),
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight(400)
    )
}

@Preview(showBackground = true)
@Composable
fun ClickableTextExamplePreview() {
    ClickableTextExample(text = "Текст, на который можно нажать", onClick = {})
}