package org.codeforegypt.gdgapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.content.ContextCompat
import org.codeforegypt.gdgapp.features.home.HomeScreen
import org.codeforegypt.gdgapp.ui.theme.GDGAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            window.statusBarColor = ContextCompat.getColor(this, R.color.white)
            GDGAppTheme {
                MainContent()
            }
        }
    }
}

@Composable
fun MainContent() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = { paddingValues ->
            HomeScreen(
                modifier = Modifier.padding(paddingValues),
                featuredEvents = listOf(
                    R.drawable.img_devfest,
                    R.drawable.img_devfest,
                    R.drawable.img_devfest
                )
            )
        }
    )
}
