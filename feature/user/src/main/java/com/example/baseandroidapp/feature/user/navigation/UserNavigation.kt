package com.example.baseandroidapp.feature.user.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.baseandroidapp.feature.user.UserRoute
const val FOR_YOU_ROUTE = "FOR_YOU_ROUTE"

fun NavController.navigateToUser(navOptions: NavOptions) = navigate(FOR_YOU_ROUTE, navOptions)

fun NavGraphBuilder.userSection() {
    composable(
        route = FOR_YOU_ROUTE
    ) {
        UserRoute()
    }
}