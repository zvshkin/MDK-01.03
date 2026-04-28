package com.example.myapplication.ui.theme.ComponentsPR04

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.ButtonColor
import com.example.myapplication.ui.theme.SecondaryButtonColor
@Composable
fun PrimaryButton(modifier: Modifier,
                  onClick: () -> Unit,
                  butttonText: String,
                  enabled: Boolean=true) {
    Button(
        onClick = {onClick()},
        modifier=modifier
            .height(56.dp),
        colors = ButtonColors(
            contentColor = Color.White,
            disabledContentColor = Color.White,
            containerColor = ButtonColor,
            disabledContainerColor = SecondaryButtonColor

        ),
        shape = RoundedCornerShape(10.dp),
        enabled = enabled
    ){
        Text(text = butttonText)
    }
}


@Preview(showBackground = true)
@Composable
fun PrimaryButtonPreview(){
    PrimaryButton(butttonText = "Кнопка", modifier = Modifier, onClick = {},enabled = true)
}