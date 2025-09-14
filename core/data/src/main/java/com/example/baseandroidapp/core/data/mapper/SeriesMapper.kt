package com.example.baseandroidapp.core.data.mapper

import com.example.baseandroidapp.core.common.mapper.DomainMapper
import com.example.baseandroidapp.core.model.data.Series
import com.example.baseandroidapp.core.network.model.SeriesResponse
import javax.inject.Inject

class SeriesMapper @Inject constructor():
    DomainMapper<SeriesResponse, Series> {
    override fun toDomain(from: List<SeriesResponse>): List<Series> {
        return from.map { toDomain(it) }
    }

    override fun toDomain(from: SeriesResponse): Series {
        return Series(
            id = from.id,
            title = from.title
        )
    }
}