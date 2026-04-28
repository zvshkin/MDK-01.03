package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.ComponentsPR05.Screen
import com.example.myapplication.ui.theme.ComponentsPR09.Order
import com.example.myapplication.ui.theme.ComponentsPR09.Pay
import com.example.myapplication.ui.theme.ComponentsPR09.Screen
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.MyTheme
import com.example.myapplication.ui.theme.MyThemePR07

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                MyThemePR07 {
                    val navController = rememberNavController()

                    NavHost(navController, startDestination = Screen) {
                        composable<Screen>{
                            Screen(
                                navigateToScreen  = {
                                    navController.navigate(route=Order)
                                    {
                                        popUpTo<Screen>{inclusive = false}
                                    }
                                }
                            )
                        }
                        composable<Order>{
                            Order(
                                back = {navController.popBackStack()},
                                navigateToOrder = {
                                    navController.navigate(route=Pay)
                                    {
                                        popUpTo<Order>{inclusive = false}
                                    }
                                }
                            )
                        }
                        composable<Pay>
                        {
                            Pay(back = { navController.popBackStack()})
                        }
                    }

                }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        style = MyTheme.typography.headingBlack96,
        color = MyTheme.colors.primary
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

//    MyThemePR07 {
//        Greeting("Android")
//    }
}