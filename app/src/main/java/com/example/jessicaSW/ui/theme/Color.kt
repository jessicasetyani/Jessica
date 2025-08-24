package com.example.jessicaSW.ui.theme

import android.annotation.SuppressLint
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance

//custom
val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)
val HeartRed = Color(0xFFFF4444)

@SuppressLint("ConflictingOnColor")
val LightThemeColors = lightColorScheme(
    primary = Color(0xFFE50914),
    primaryContainer = Color(0xFF971C1C),
    secondary = Color(0xFFE50914),
    secondaryContainer = Color(0xFF831010),
    background = Color.White,
    surface = Color.White,
    error = Color(0xFFE50914),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.Black,
    onSurface = Color(0xFF1C1C1C),
    onError = Color.White,
)

val DarkThemeColors = darkColorScheme(
    primary = Color(0xFFE50914),
    primaryContainer = Color(0xFF971C1C),
    secondary = Color(0xFFE50914),
    secondaryContainer = Color(0xFF831010),
    background = Color(0xFF1C1C1C),
    surface = Color(0xFF1C1C1C),
    error = Color(0xFFCF6679),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    onError = Color(0xFF1C1C1C),
)

fun ColorScheme.isLight() = this.background.luminance() > 0.5

val ColorScheme.topAppBarBackgroundColor: Color
    get() {
        return if(isLight()) Purple500 else Color.Black
    }

val ColorScheme.topAppBarContentColor: Color
    get() {
        return if(isLight()) Color.White else Color.LightGray
    }