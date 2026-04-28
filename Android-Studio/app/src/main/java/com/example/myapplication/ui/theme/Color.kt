package com.example.myapplication.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Primary80 = Color(0xFFD0BCFF)
val Secondary80 = Color(0xFFCCC2DC)
val Tertiary80 = Color(0xFFEFB8C8)

val Primary40 = Color(0xFF6650a4)
val Secondary40 = Color(0xFF625b71)
val Tertiary40 = Color(0xFF7D5260)

val AppBackgroundColor = Color(0xFFFFFFFF)

val ColorSuccess = Color(0xFF00FF1E)
val ColorTextSecondary = Color(0xFF939396)
val ColorBlueLight = Color(0xFF57A9FF)

val ColorWhite = Color(0xFFFFFFFF)
val ColorPrimaryBlue = Color(0xFF1A6FEE)

val ColorWhiteDisabled = Color(0xFFFFFFFF)
val ColorDisabledBlue = Color(0xFFC9D4FB)

val ColorSecondaryBlueText = Color(0xFF1A6FEE)
val ColorSecondaryBlue = Color(0xFF1A6FEE)

val ColorInputBackground = Color(0xFFF5F5F9)
val ColorInputBorder = Color(0xFFEBEBEB)
val ColorInputHint = Color(0xFF00000080)

val ColorInputBackgroundFocused = Color(0xFFF5F5F9)
val ColorInputBorderFocused = Color(0xFFB8C1CC)
val ColorInputText = Color(0xFF000000)

// PR04 Colors
val AccentColor= Color(0xFF00B712)
val ButtonColor= Color(0xFF1A6FEE)
val SecondaryButtonColor=Color(0xFFC9D4FB)
val Descriptions=Color(0xFF939396)
val ClickableText=Color(0xFF57A9FF)

// PR05 Colors
val ColorFieldBackground = Color(0xFFF5F5F9)
val ColorFieldBorder = Color(0xFFEBEBEB)

val ColorTextGray = Color(0xFF7E7E9A)
val ColorButtonBlue = Color(0xFF1A6FEE)
val ColorButtonContentBlue = Color(0xFFC9D4FB)

val ColorTextBottomGray = Color(0xFF939396)
val ColorBottomBorderBlue = Color(0xFF1A6FEE)

// PR06 Colors
val ColorTextBlueLight = Color(0xFF57A9FF)
val ColorTextGreen = Color(0xFF00B712)
val ColorTextGraySecondary = Color(0xFF939396)

// PR07 Theme Support
data class AppColors(
    val primary: Color,
    val secondary: Color,
    val success: Color,
    val warning: Color,
    val info: Color,
    val error: Color,
    val blacktext1: Color,
    val blacktext2: Color,
    val gray1: Color,
    val gray2: Color,
    val white: Color
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        primary = Color.Unspecified,
        secondary = Color.Unspecified,
        success = Color.Unspecified,
        warning = Color.Unspecified,
        info = Color.Unspecified,
        error = Color.Unspecified,
        blacktext1 = Color.Unspecified,
        blacktext2 = Color.Unspecified,
        gray1 = Color.Unspecified,
        gray2 = Color.Unspecified,
        white = Color.Unspecified
    )
}

// PR09 Colors
val ColorTextCommentary = Color(0xFF7E7E9A)
val ColorTextPromoGray = Color(0xFF939396)
val ColorTextPayGreen = Color(0xFF00B712)

// PR10 Colors
val ColorMenuTextInactive = Color(0xFFB8C1CC)
val ColorMenuIconInactive = Color(0xFFB8C1CC)

val ColorMenuTextActive = Color(0xFF1A6FEE)
val ColorMenuIconActive = Color(0xFF1A6FEE)
