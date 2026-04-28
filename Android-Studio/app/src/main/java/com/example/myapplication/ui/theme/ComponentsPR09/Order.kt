package com.example.myapplication.ui.theme.ComponentsPR09

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.AppBackgroundColor
import com.example.myapplication.ui.theme.ColorDisabledBlue
import com.example.myapplication.ui.theme.ColorFieldBackground
import com.example.myapplication.ui.theme.ColorFieldBorder
import com.example.myapplication.ui.theme.ColorPrimaryBlue
import com.example.myapplication.ui.theme.ColorTextCommentary
import com.example.myapplication.ui.theme.ColorTextPromoGray
import com.example.myapplication.ui.theme.ColorWhiteDisabled

@Composable
fun Order(
    modifier: Modifier = Modifier,
    back: () -> Unit,
    navigateToOrder: () -> Unit
) {
    var addressText by remember { mutableStateOf("") }
    var phoneText by remember { mutableStateOf("") }
    var commentaryText by remember { mutableStateOf("") }

    val isButtonEnabled = addressText.isNotEmpty() &&
            phoneText.isNotEmpty() &&
            commentaryText.isNotEmpty()

    Column(
        modifier = modifier
            .background(AppBackgroundColor)
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        Spacer(modifier = Modifier.height(60.dp))
        Image(
            modifier = Modifier
                .size(32.dp)
                .clickable { back() },
            painter = painterResource(id = R.drawable.back),
            contentDescription = "back image"
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Оформление заказа",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 28.sp,
            textAlign = TextAlign.Left
        )

        Spacer(modifier = Modifier.height(32.dp))

        Image(
            modifier = Modifier.size(51.dp, 20.dp),
            painter = painterResource(id = R.drawable.tittle),
            contentDescription = "Title"
        )
        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(
            value = addressText,
            onValueChange = { addressText = it },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = ColorFieldBackground,
                unfocusedContainerColor = ColorFieldBackground,
                unfocusedBorderColor = ColorFieldBorder,
                focusedBorderColor = ColorFieldBorder
            ),
            placeholder = {
                Text(
                    text = "Введите ваш адрес",
                    color = Color.Gray
                )
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(12.dp))
        Image(
            modifier = Modifier.size(68.dp, 20.dp),
            painter = painterResource(id = R.drawable.tittle__1_),
            contentDescription = "Title 2"
        )
        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(
            value = phoneText,
            onValueChange = { phoneText = it },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = ColorFieldBackground,
                unfocusedContainerColor = ColorFieldBackground,
                unfocusedBorderColor = ColorFieldBorder,
                focusedBorderColor = ColorFieldBorder
            ),
            placeholder = {
                Text(
                    text = "Введите ваш номер телефона",
                    color = Color.Gray
                )
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Комментарий",
                textAlign = TextAlign.Left,
                fontSize = 14.sp,
                color = ColorTextCommentary,
                lineHeight = 20.sp
            )
            Spacer(modifier = Modifier.width(221.dp))
            Image(
                modifier = Modifier.size(68.dp, 20.dp),
                painter = painterResource(id = R.drawable.male),
                contentDescription = "Male icon"
            )
        }

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(
            value = commentaryText,
            onValueChange = { commentaryText = it },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = ColorFieldBackground,
                unfocusedContainerColor = ColorFieldBackground,
                unfocusedBorderColor = ColorFieldBorder,
                focusedBorderColor = ColorFieldBorder
            ),
            placeholder = {
                Text(
                    text = "Можете оставить свои пожелания",
                    color = Color.Gray
                )
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(157.dp)
        )
        Spacer(modifier = Modifier.height(143.dp))

        Text(
            text = "Промокод",
            textAlign = TextAlign.Left,
            fontSize = 14.sp,
            color = ColorTextPromoGray,
            modifier = Modifier.fillMaxWidth(),
            lineHeight = 20.sp
        )

        Spacer(modifier = Modifier.height(15.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            onClick = {
                Log.d("MyLog", "Введенный email: $addressText")
                navigateToOrder()
            },
            enabled = isButtonEnabled,
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = ColorPrimaryBlue,
                contentColor = ColorWhiteDisabled,
                disabledContainerColor = ColorDisabledBlue,
                disabledContentColor = ColorDisabledBlue
            ),
        ) {
            Text(
                text = "Заказать",
                color = Color.White,
                fontSize = 17.sp,
                lineHeight = 24.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun OrderPrev() {
    Order(back = {}, navigateToOrder = {})
}
