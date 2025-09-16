package com.example.baseandroidapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.example.baseandroidapp.feature.user.navigation.userSection
import com.example.baseandroidapp.ui.NiaAppState

@Composable
fun NiaNavHost(
    appState: NiaAppState,
    modifier: Modifier = Modifier
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = "FOR_YOU_ROUTE",
        modifier = modifier,
    ) {
        userSection()
    }
}
