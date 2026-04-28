package com.example.myapplication.ui.theme.ComponentsPR04

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextInputField(
    value: String,
    onValueChange: (String) -> Unit,
    enabled: Boolean=true,
    modifier: Modifier = Modifier,
    placeholder: String = "Поле для ввода с подсказкой"
    ){
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            enabled = enabled,
            shape = RoundedCornerShape(10.dp),
            placeholder = {
                Text(text = placeholder)
            }
        )
}


@Preview(showBackground = true)
@Composable
private fun TextInputPreview(){
    TextInputField(value = "Поле для ввода с подсказкой", onValueChange = {}, enabled = false)
}