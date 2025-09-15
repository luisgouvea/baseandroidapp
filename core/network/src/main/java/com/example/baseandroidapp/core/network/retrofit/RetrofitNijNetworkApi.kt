package com.example.baseandroidapp.core.network.retrofit

import com.example.baseandroidapp.core.network.model.UserResponse
import kotlinx.serialization.Serializable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


/**
 * Retrofit API declaration for NIJ Network API
 */
interface RetrofitNijNetworkApi {
    @GET("/users")
    suspend fun getUsers(): List<UserResponse>
}

const val NijBaseUrl = "url"

/**
 * Wrapper for data provided from the [NijBaseUrl]
 */
@Serializable
data class NetworkResponse<T>(
    val data: T,
)