package com.example.baseandroidapp.core.data.mapper

import com.example.baseandroidapp.core.common.mapper.DomainMapper
import com.example.baseandroidapp.core.model.data.Delivery
import com.example.baseandroidapp.core.network.model.DeliveryResponse
import javax.inject.Inject

class DeliveriesMapper @Inject constructor(): DomainMapper<DeliveryResponse, Delivery> {
    override fun toDomain(from: List<DeliveryResponse>): List<Delivery> {
        return from.map { toDomain(it) }
    }

    override fun toDomain(from: DeliveryResponse): Delivery {
        return Delivery(
            hasTracking = from.hasTracking,
            date = from.date
        )
    }
}