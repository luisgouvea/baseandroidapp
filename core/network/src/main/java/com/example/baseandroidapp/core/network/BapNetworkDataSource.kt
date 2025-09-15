package com.example.baseandroidapp.core.network

import com.example.baseandroidapp.core.network.model.UserResponse


/**
 * Interface representing network calls to the BAP backend
 */
interface BapNetworkDataSource {
    suspend fun fetchUser(): List<UserResponse>
}