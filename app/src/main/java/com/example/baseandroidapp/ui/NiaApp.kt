package com.example.baseandroidapp.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import com.example.baseandroidapp.navigation.NiaNavHost
import com.example.baseandroidapp.navigation.TopLevelDestination
import com.example.baseandroidapp.ui.components.NiaNavigationBar
import com.example.baseandroidapp.ui.components.NiaNavigationBarItem

@Composable
fun NiaApp(
    appState: NiaAppState
) {
    NiaApp2(
        appState = appState
    )
}

@Composable
@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
internal fun NiaApp2(
    appState: NiaAppState,
    modifier: Modifier = Modifier
) {

    Scaffold(
        containerColor = Color.Transparent,
        contentColor = MaterialTheme.colorScheme.onBackground,
        contentWindowInsets = WindowInsets(0, 0, 0, 0),
        bottomBar = {
            NiaBottomBar(
                destinations = appState.topLevelDestinations,
                onNavigateToDestination = appState::navigateToTopLevelDestination,
                currentDestination = appState.currentDestination,
                modifier = Modifier.testTag("NiaBottomBar"),
            )
        },
    ) { padding ->
        Row(
            Modifier
                .fillMaxSize()
                .padding(padding)
                .consumeWindowInsets(padding)
                .windowInsetsPadding(
                    WindowInsets.safeDrawing.only(
                        WindowInsetsSides.Horizontal,
                    ),
                ),
        ) {

            Column(Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier.consumeWindowInsets(
                        WindowInsets(0, 0, 0, 0),
                    ),
                ) {
                    NiaNavHost(
                        appState = appState
                    )
                }
            }

            // TODO: We may want to add padding or spacer when the snackbar is shown so that
            //  content doesn't display behind it.
        }
    }
}

@Composable
private fun NiaBottomBar(
    destinations: List<TopLevelDestination>,
    onNavigateToDestination: (TopLevelDestination) -> Unit,
    currentDestination: NavDestination?,
    modifier: Modifier = Modifier,
) {
    NiaNavigationBar(
        modifier = modifier,
    ) {
        destinations.forEach { destination ->
            val selected = currentDestination.isTopLevelDestinationInHierarchy(destination)
            NiaNavigationBarItem(
                selected = selected,
                onClick = { onNavigateToDestination(destination) },
                icon = {
                    Icon(
                        imageVector = destination.unselectedIcon,
                        contentDescription = null,
                    )
                },
                selectedIcon = {
                    Icon(
                        imageVector = destination.selectedIcon,
                        contentDescription = null,
                    )
                },
                label = { Text(stringResource(destination.iconTextId)) }
            )
        }
    }
}

private fun NavDestination?.isTopLevelDestinationInHierarchy(destination: TopLevelDestination) =
    this?.hierarchy?.any {
        it.route?.contains(destination.name, true) ?: false
    } ?: false
