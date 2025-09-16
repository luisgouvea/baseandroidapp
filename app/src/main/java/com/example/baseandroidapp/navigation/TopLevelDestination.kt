package com.example.baseandroidapp.navigation


import com.example.baseandroidapp.R
import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.rounded.Add
/**
 * Type for the top level destinations in the application. Each of these destinations
 * can contain one or more screens (based on the window size). Navigation from one screen to the
 * next within a single destination will be handled directly in composables.
 */
enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
    val titleTextId: Int,
) {
    FOR_YOU(
        selectedIcon = Icons.Rounded.Add,
        unselectedIcon = Icons.Rounded.Add,
        iconTextId =  R.string.app_name,
        titleTextId = R.string.app_name,
    )
}