package com.example.baseandroidapp.feature.user.data

import com.example.baseandroidapp.core.model.data.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

val usersTestData: Flow<List<User>> = flowOf(
    listOf(
        User(id = 1, name = "Leanne Graham"),
        User(id = 2, name = "Ervin Howell"),
        User(id = 3, name = "Clementine Bauch")
    )
)
