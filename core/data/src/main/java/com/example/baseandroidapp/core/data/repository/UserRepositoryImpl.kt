package com.example.baseandroidapp.core.data.repository

import com.example.baseandroidapp.core.data.mapper.UserMapper
import com.example.baseandroidapp.core.model.data.User
import com.example.baseandroidapp.core.network.BapNetworkDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val mapper: UserMapper,
    private val bapNetworkDataSourceImpl: BapNetworkDataSource
) : UserRepository {

    override fun getUser(): Flow<List<User>> = flow {
        emit(
            mapper.toDomain(bapNetworkDataSourceImpl.fetchUser())
        )
    }
}