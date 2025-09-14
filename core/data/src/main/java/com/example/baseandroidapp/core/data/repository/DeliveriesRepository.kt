package com.example.baseandroidapp.core.data.repository

import com.example.baseandroidapp.core.model.data.Delivery


interface DeliveriesRepository {
    suspend fun fetchDeliveries(
        page: Int
    ): List<Delivery>
}