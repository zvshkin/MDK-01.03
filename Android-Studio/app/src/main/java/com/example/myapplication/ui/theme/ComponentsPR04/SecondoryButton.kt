package com.example.myapplication.ui.theme.ComponentsPR04

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.ButtonColor

@Composable
fun SecondaryButton (modifier: Modifier,
                     onClick: () -> Unit,
                     butttonText: String,
                     enabled: Boolean=true) {
        Button(
            onClick = {onClick()},
            modifier = modifier
                .height(48.dp),
            colors = ButtonColors(
                contentColor = ButtonColor,
                disabledContentColor = ButtonColor,
                containerColor = Color.White,
                disabledContainerColor = ButtonColor

            ),
            border= BorderStroke(width = 1.dp, ButtonColor),
            shape = RoundedCornerShape(10.dp),
            enabled = enabled
        ) {
            Text(text = butttonText)
        }
}
@Preview(showBackground = true)
@Composable
fun SecondaryButtonPriview(){
    SecondaryButton(butttonText = "Еще одна кнопка", modifier = Modifier, onClick ={},enabled = true)
}