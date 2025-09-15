package com.example.baseandroidapp.core.network.retrofit

import com.example.baseandroidapp.core.network.model.UserResponse
import kotlinx.serialization.Serializable
import retrofit2.http.GET


/**
 * Retrofit API declaration for BAP Network API
 */
interface RetrofitBapNetworkApi {
    @GET("/users")
    suspend fun getUsers(): List<UserResponse>
}

const val BapBaseUrl = "url"

/**
 * Wrapper for data provided from the [BapBaseUrl]
 */
@Serializable
data class NetworkResponse<T>(
    val data: T,
)