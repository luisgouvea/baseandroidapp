package com.example.baseandroidapp.core.network.di

import com.example.baseandroidapp.core.network.NijNetworkDataSource
import com.example.baseandroidapp.core.network.retrofit.RetrofitNijNetwork
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkModule {

    @Binds
    @Singleton
    abstract fun bindsNetwork(
        addressRemoteRepositoryImpl: RetrofitNijNetwork
    ): NijNetworkDataSource

}