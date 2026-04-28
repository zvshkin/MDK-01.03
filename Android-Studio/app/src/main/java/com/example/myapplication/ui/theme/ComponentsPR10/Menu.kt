package com.example.myapplication.ui.theme.ComponentsPR10

import androidx.compose.foundation.Image
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.R
import com.example.myapplication.ui.theme.ColorMenuIconActive
import com.example.myapplication.ui.theme.ColorMenuIconInactive
import com.example.myapplication.ui.theme.ColorMenuTextActive
import com.example.myapplication.ui.theme.ColorMenuTextInactive
import com.example.myapplication.ui.theme.MyTheme

@Composable
fun Menu(modifier: Modifier = Modifier) {
    var selItem by remember { mutableStateOf(-1) }

    val itemList = remember {
        listOf(
            BarItem(0, R.drawable.tests, "Анализы"),
            BarItem(1, R.drawable.result, "Результаты"),
            BarItem(2, R.drawable.massage, "Поддержка"),
            BarItem(3, R.drawable.profille, "Профиль"),
        )
    }

    NavigationBar(
        modifier = modifier,
        containerColor = MyTheme.colors.white
    ) {
        itemList.forEach { itemNavBar ->
            NavigationBarItem(
                selected = itemNavBar.index == selItem,
                onClick = { selItem = itemNavBar.index },
                icon = {
                    Image(
                        imageVector = ImageVector.vectorResource(itemNavBar.icon),
                        contentDescription = itemNavBar.title,
                    )
                },
                label = {
                    Text(text = itemNavBar.title)
                },
                colors = NavigationBarItemDefaults.colors(
                    unselectedIconColor = ColorMenuIconInactive,
                    unselectedTextColor = ColorMenuTextInactive,
                    selectedIconColor = ColorMenuIconActive,
                    selectedTextColor = ColorMenuTextActive,
                    indicatorColor = Color.Transparent
                )
            )
        }
    }
}

@Preview
@Composable
private fun MenuPrev() {
    Menu()
}
