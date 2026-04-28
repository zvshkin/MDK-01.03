package com.example.myapplication.ui.theme.ComponentsPR09

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.ColorDisabledBlue
import com.example.myapplication.ui.theme.ColorPrimaryBlue
import com.example.myapplication.ui.theme.ColorTextPayGreen
import com.example.myapplication.ui.theme.ColorWhiteDisabled
import com.example.myapplication.ui.theme.ComponentsPR10.Menu

@Composable
fun Pay(
    modifier: Modifier = Modifier,
    back: () -> Unit
) {
    Scaffold(
        bottomBar = { Menu() }
    ) { contentPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(contentPadding)
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(62.dp))
            Text(
                text = "Оплата",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 28.sp
            )
            Spacer(modifier = Modifier.height(64.dp))
            Image(
                modifier = Modifier
                    .padding(start = 85.dp, end = 86.dp)
                    .size(204.dp, 201.dp),
                painter = painterResource(id = R.drawable.illustration),
                contentDescription = "illustration image"
            )
            Spacer(modifier = Modifier.height(31.dp))
            Text(
                text = "Ваш заказ успешно оплачен!",
                color = ColorTextPayGreen,
                fontSize = 20.sp,
                lineHeight = 28.sp
            )
            Spacer(modifier = Modifier.height(31.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                onClick = { back() },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ColorPrimaryBlue,
                    contentColor = ColorWhiteDisabled,
                    disabledContainerColor = ColorDisabledBlue,
                    disabledContentColor = ColorDisabledBlue
                ),
            ) {
                Text(
                    text = "Назад",
                    color = Color.White,
                    fontSize = 17.sp,
                    lineHeight = 24.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PayPrev() {
    Pay(back = {})
}
