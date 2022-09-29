package com.awesome.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Counter() {
    var count by remember { mutableStateOf(0) }
    val doubleCount by remember {
        derivedStateOf {
            count * 2
        }
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Compose Demo Counter Page") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { count++ }) {
                Icon(
                    Icons.Filled.Add,
                    contentDescription = "Add"
                )
            }
        },
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(text = "You have pushed the button this many times:")
            Text(text = "$doubleCount", style = MaterialTheme.typography.h4)
        }
    }
}

