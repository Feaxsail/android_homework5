package com.shcherbakov.homework_lab5_androidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        TitleSection()
        ColorSquaresRow()
        NestedContainersSection()
    }
}

@Composable
fun TitleSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "Jetpack Compose",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A237E)
        )
        Text(
            text = "Контейнеры и цвета",
            fontSize = 18.sp,
            color = Color(0xFF546E7A)
        )
    }
}

@Composable
fun ColorSquaresRow() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color(0xFF2196F3))
        )
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color(0x80F44336))
        )
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color(0xFF4CAF50))
        )
    }
}

@Composable
fun NestedContainersSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F5F5))
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "Вложенные контейнеры",
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF1976D2)
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .background(Color(0xFFFF9800))
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(28.dp)
                        .background(Color(0xFFE91E63))
                )
                Box(
                    modifier = Modifier
                        .size(28.dp)
                        .background(Color(0xFF9C27B0))
                )
            }
        }
    }
}