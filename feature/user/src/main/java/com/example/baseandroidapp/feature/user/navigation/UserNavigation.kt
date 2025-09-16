package com.example.baseandroidapp.feature.user.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.baseandroidapp.feature.user.UserRoute
const val USER_ROUTE = "USER_ROUTE"

fun NavController.navigateToUser(navOptions: NavOptions) = navigate(USER_ROUTE, navOptions)

fun NavGraphBuilder.userSection() {
    composable(
        route = USER_ROUTE
    ) {
        UserRoute()
    }
}