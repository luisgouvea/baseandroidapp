package com.example.baseandroidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.baseandroidapp.ui.NiaApp
import com.example.baseandroidapp.ui.rememberNiaAppState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private var isLoading = true

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)

        splashScreen.setKeepOnScreenCondition {
            isLoading
        }

        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                delay(2000)
                isLoading = false
            }
        }

        enableEdgeToEdge()
        setContent {
            val appState = rememberNiaAppState()

            MaterialTheme {
                NiaApp(appState)
            }
        }
    }
}