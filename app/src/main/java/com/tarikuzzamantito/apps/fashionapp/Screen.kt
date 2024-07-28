package com.tarikuzzamantito.apps.fashionapp

/**
 * Created by Tarikuzzaman Tito on 7/27/2024 5:46 PM
 * Ref: https://www.youtube.com/watch?v=PUqsoja9_Oo&ab_channel=ChiragKachhadiya
 */

sealed class Screen(val route: String) {
    data object Landing : Screen("landing_screen")
    data object Dashboard : Screen("dashboard_screen")
    data object Product : Screen("product_screen")
}