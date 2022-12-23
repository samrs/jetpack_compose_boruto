package com.example.borutoapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.borutoapp.presentation.navigation.Screen.Companion.DETAILS_ARG_HERO_ID
import com.example.borutoapp.presentation.screens.home.HomeScreen
import com.example.borutoapp.presentation.screens.onboarding.WelcomeScreen
import com.example.borutoapp.presentation.screens.splash.SplashScreen

@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navHostController)
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navHostController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen(navHostController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument(DETAILS_ARG_HERO_ID) {
                    type = NavType.StringType
                }
            )
        ) {

        }
        composable(route = Screen.Search.route) {

        }
    }
}