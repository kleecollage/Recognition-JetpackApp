package com.example.recognitionapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recognitionapp.ui.theme.RecognitionAppTheme
import com.example.recognitionapp.viewModel.ScannerViewModel
import com.example.recognitionapp.views.TabsView

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: ScannerViewModel by viewModels()

        setContent {
            RecognitionAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    TabsView(viewModel)
                }
            }
        }

    }
}