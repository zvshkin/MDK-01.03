package com.example.myapplication.ui.theme.ComponentsPR06

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun OnboardingScreen(
    textUp: String,
    textCenterTitle: String,
    textCenter: String,
    imageTopResId: Int,
    imageBottomResId: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.shape),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopEnd)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = textUp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 49.dp),
                fontSize = 20.sp,
                fontFamily = LatoFontFamily,
                color = ColorTextBlueLight,
                textAlign = TextAlign.Start
            )

            Spacer(modifier = Modifier.height(160.dp))

            Text(
                text = textCenterTitle,
                fontSize = 20.sp,
                fontFamily = LatoFontFamily,
                color = ColorTextGreen,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = textCenter,
                fontSize = 14.sp,
                fontFamily = LatoFontFamily,
                color = ColorTextGraySecondary,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .width(214.dp),
                lineHeight = 20.sp
            )

            Spacer(modifier = Modifier.height(40.dp))

            Image(
                painter = painterResource(id = imageTopResId),
                contentDescription = null,
                modifier = Modifier.size(58.dp, 15.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(id = imageBottomResId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(270.dp)
                    .padding(bottom = 50.dp)
            )
        }
    }
}

@Preview(showBackground = true, name = "Анализы")
@Composable
fun PreviewStep1() {
    OnboardingScreen(
        textUp = "Далее",
        textCenterTitle = "Анализы",
        textCenter = "Экспресс сбор и получение проб",
        imageTopResId = R.drawable.group_2,
        imageBottomResId = R.drawable.illustration
    )
}

@Preview(showBackground = true, name = "Уведомления")
@Composable
fun PreviewStep2() {
    OnboardingScreen(
        textUp = "Далее",
        textCenterTitle = "Уведомления",
        textCenter = "Вы быстро узнаете о результатах",
        imageTopResId = R.drawable.image5,
        imageBottomResId = R.drawable._30_1
    )
}

@Preview(showBackground = true, name = "Мониторинг")
@Composable
fun PreviewStep3() {
    OnboardingScreen(
        textUp = "Завершить",
        textCenterTitle = "Мониторинг",
        textCenter = "Наши врачи всегда наблюдают за вашими показателями здоровья",
        imageTopResId = R.drawable.group,
        imageBottomResId = R.drawable.__2022_09_17__19_21_1
    )
}
