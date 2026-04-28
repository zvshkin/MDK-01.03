package com.example.myapplication.ui.theme.ComponentsPR05

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.ColorBottomBorderBlue
import com.example.myapplication.ui.theme.ColorDisabledBlue
import com.example.myapplication.ui.theme.ColorFieldBackground
import com.example.myapplication.ui.theme.ColorFieldBorder
import com.example.myapplication.ui.theme.ColorPrimaryBlue
import com.example.myapplication.ui.theme.ColorTextBottomGray
import com.example.myapplication.ui.theme.ColorTextGray
import com.example.myapplication.ui.theme.ColorWhiteDisabled

@Composable
fun Screen(modifier: Modifier = Modifier, navigateToScreen: () -> Unit) {
    var emailText by remember { mutableStateOf("") }
    val isButtonEnabled = emailText.isNotEmpty()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(103.dp))

        Text(
            text = "Добро пожаловать!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 28.sp,
        )

        Spacer(modifier = Modifier.height(23.dp))

        Text(
            text = "Войдите, чтобы пользоваться функциями приложения",
            fontSize = 15.sp,
            lineHeight = 20.sp
        )

        Spacer(modifier = Modifier.height(70.dp))

        Text(
            text = "Вход по E-mail",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 14.sp,
            color = ColorTextGray,
            lineHeight = 20.sp,
            textAlign = TextAlign.Start
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = emailText,
            onValueChange = { emailText = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(text = "example@mail.ru", color = Color.Gray)
            },
            shape = RoundedCornerShape(10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = ColorFieldBackground,
                unfocusedContainerColor = ColorFieldBackground,
                unfocusedBorderColor = ColorFieldBorder,
                focusedBorderColor = ColorFieldBorder
            )
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                Log.d("MyLog", "Введенный email: $emailText")
                navigateToScreen()
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            enabled = isButtonEnabled,
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = ColorPrimaryBlue,
                contentColor = Color.White,
                disabledContainerColor = ColorDisabledBlue,
                disabledContentColor = ColorWhiteDisabled
            )
        ) {
            Text(
                text = "Далее",
                fontSize = 17.sp,
                lineHeight = 24.sp
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "Или войдите с помощью",
            color = ColorTextBottomGray,
            fontSize = 17.sp,
            lineHeight = 24.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Логика Яндекса */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(1.dp, color = ColorBottomBorderBlue),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            )
        ) {
            Text(
                text = "Войти с Яндекс",
                color = ColorBottomBorderBlue,
                fontSize = 17.sp,
                lineHeight = 24.sp
            )
        }

        // Финальный отступ от края экрана
        Spacer(modifier = Modifier.height(56.dp))
    }
}

@Preview(showBackground = true)
@Composable
private fun ScreenPrev() {
    Screen(navigateToScreen = {})
}
