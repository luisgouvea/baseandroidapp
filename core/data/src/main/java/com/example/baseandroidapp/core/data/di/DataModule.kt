package com.example.baseandroidapp.core.data.di

import com.example.baseandroidapp.core.data.repository.DeliveriesRepository
import com.example.baseandroidapp.core.data.repository.DeliveriesRepositoryImpl
import com.example.baseandroidapp.core.data.repository.SerieRepository
import com.example.baseandroidapp.core.data.repository.SerieRepositoryImpl
import com.example.baseandroidapp.core.data.repository.UserRepository
import com.example.baseandroidapp.core.data.repository.UserRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun bindSerieRepositoryImplHum(
        serieRepositoryImplNew: SerieRepositoryImpl
    ): SerieRepository

    @Binds
    abstract fun bindQualquer(
        deliveriesRepositoryImpl: DeliveriesRepositoryImpl
    ): DeliveriesRepository

    @Binds
    abstract fun bindUserRepository(
        userRepositoryImpl: UserRepositoryImpl
    ): UserRepository
}