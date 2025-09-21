package com.example.baseandroidapp.feature.user.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.baseandroidapp.feature.user.DetailsUserRoute
import com.example.baseandroidapp.feature.user.UserRoute

const val USER_FEATURE_ROUTE = "USER_FEATURE"
const val USER_ROUTE = "USER_ROUTE"

fun NavController.navigateToUser(navOptions: NavOptions) = navigate(USER_FEATURE_ROUTE, navOptions)

fun NavGraphBuilder.userSection() {
    composable(
        route = USER_FEATURE_ROUTE
    ) {
        UserNavHost()
    }
}

@Composable
fun UserNavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController, startDestination = USER_ROUTE) {
        composable(USER_ROUTE) {
            UserRoute(
                onNavigateToDetails = { userId ->
                    navController.navigate("details/$userId")
                }
            )
        }

        composable("details/{id}") { backStackEntry ->
            val id: String? = backStackEntry.arguments?.getString("id", "1")
            id?.let {
                DetailsUserRoute(userId = it.toInt())
            }
        }
    }
}