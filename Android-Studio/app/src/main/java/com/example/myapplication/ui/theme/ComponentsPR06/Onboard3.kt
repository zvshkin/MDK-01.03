package com.example.myapplication.ui.theme.ComponentsPR06

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.ColorTextBlueLight
import com.example.myapplication.ui.theme.ColorTextGraySecondary
import com.example.myapplication.ui.theme.ColorTextGreen
import com.example.myapplication.ui.theme.LatoFontFamily

@Composable
fun Onboard3(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(
                start = 30.dp,
                end = 243.dp,
                top = 49.dp,
                bottom = 739.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Завершить",
            fontSize = 20.sp,
            fontFamily = LatoFontFamily,
            color = ColorTextBlueLight,
            modifier = Modifier.fillMaxWidth(),
            lineHeight = 20.sp,
            textAlign = TextAlign.Left
        )
    }
    Image(
        modifier = Modifier.padding(
            start = 208.dp,
            end = 0.04.dp,
            top = 49.dp,
            bottom = 599.89.dp
        ),
        painter = painterResource(id = R.drawable.shape),
        contentDescription = "Shape image"
    )
    Spacer(modifier = Modifier.height(60.89.dp))

    Text(
        text = "Мониторинг",
        fontSize = 20.sp,
        fontFamily = LatoFontFamily,
        color = ColorTextGreen,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 73.dp,
                end = 88.dp,
                top = 273.dp,
                bottom = 466.dp
            )
            .width(83.dp)
            .height(24.dp),
        lineHeight = 20.sp
    )
    Spacer(modifier = Modifier.height(29.dp))
    Text(
        text = "Наши врачи всегда наблюдают за вашими показателями здоровья",
        fontSize = 14.sp,
        fontFamily = LatoFontFamily,
        color = ColorTextGraySecondary,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 73.dp,
                end = 88.dp,
                top = 329.dp,
                bottom = 466.dp
            )
            .width(214.dp)
            .height(20.dp),
        lineHeight = 20.sp
    )

    Image(
        modifier = Modifier.padding(
            start = 159.dp,
            end = 158.dp,
            top = 406.dp,
            bottom = 391.71.dp
        ),
        painter = painterResource(id = R.drawable.image5),
        contentDescription = "image5 image"
    )

    Image(
        painter = painterResource(id = R.drawable.image5),
        modifier = Modifier.padding(
            start = 9.dp,
            end = 7.dp,
            top = 489.dp,
            bottom = 54.dp
        ),
        contentDescription = "image88 image"
    )
}

@Preview(showBackground = true)
@Composable
fun Onboard3Prev() {
    Onboard3()
}
