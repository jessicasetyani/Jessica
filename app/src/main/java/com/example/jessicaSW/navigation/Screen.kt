package com.example.jessicaSW.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home_screen")
    data object Search : Screen("search_screen")
}
