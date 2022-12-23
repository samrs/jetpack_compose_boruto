package com.example.borutoapp.presentation.navigation

sealed class Screen(val route: String) {
    companion object {
        const val DETAILS_SCREEN = "detail_screen"
        const val DETAILS_ARG_HERO_ID = "heroId"
    }
    object Splash: Screen("splash_screen")
    object Welcome: Screen("welcome_screen")
    object Home: Screen("home_screen")
    object Details: Screen("$DETAILS_SCREEN/{$DETAILS_ARG_HERO_ID}") {
        fun passHeroId(heroId: Int): String {
            return "$DETAILS_SCREEN/$heroId"
        }
    }
    object Search: Screen("search_screen")
}
