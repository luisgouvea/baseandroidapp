package com.example.baseandroidapp.core.network.di

import com.example.baseandroidapp.core.network.BapNetworkDataSource
import com.example.baseandroidapp.core.network.retrofit.RetrofitBapNetwork
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
        retrofitBapNetwork: RetrofitBapNetwork
    ): BapNetworkDataSource

}