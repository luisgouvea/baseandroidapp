package com.example.baseandroidapp.core.network

import com.example.baseandroidapp.core.network.model.UserResponse


/**
 * Interface representing network calls to the NIJ backend
 */
interface NijNetworkDataSource {
    suspend fun fetchUser(): List<UserResponse>
}