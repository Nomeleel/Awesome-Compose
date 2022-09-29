package com.awesome.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.*

data class User(
    val name: String,
    val gender: String,
)

@Composable
fun UserView() {
    var user by remember {
        mutableStateOf(User("zs", "female"))
    }
    Column() {
        UserName(name = user.name)
        UserGender(gender = user.gender)
        Button(onClick = {
            // user.name = "";
            user = user.copy(name = "ls")
        }) {
            Text(text = "change")
        }
    }
}

@Composable
fun UserName(
    name: String
) {
    Text(text = name)
}


@Composable
fun UserGender(
    gender: String
) {
    println("build gender")
    Text(text = gender)
}
