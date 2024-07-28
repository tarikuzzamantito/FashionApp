package com.tarikuzzamantito.apps.fashionapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tarikuzzamantito.apps.fashionapp.screens.DashboardScreen
import com.tarikuzzamantito.apps.fashionapp.screens.LandingScreen
import com.tarikuzzamantito.apps.fashionapp.screens.ProductScreen

/**
 * Created by Tarikuzzaman Tito on 7/27/2024 6:36 PM
 */

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Landing.route) {
        composable(route = Screen.Landing.route) {
            LandingScreen(navController = navController)
        }
        composable(route = Screen.Dashboard.route) {
            DashboardScreen(navController = navController)
        }
        composable(route = Screen.Product.route) {
            ProductScreen(navController = navController)
        }
    }
}