package com.example.baseandroidapp.core.data.mapper

import com.example.baseandroidapp.core.common.mapper.DomainMapper
import com.example.baseandroidapp.core.model.data.ResultSeriesData
import com.example.baseandroidapp.core.network.model.ResultSeriesDataResponse
import javax.inject.Inject

class ResultSeriesDataMapper @Inject constructor() : DomainMapper<ResultSeriesDataResponse, ResultSeriesData> {
    override fun toDomain(from: List<ResultSeriesDataResponse>): List<ResultSeriesData> {
        return from.map { toDomain(it) }
    }

    override fun toDomain(from: ResultSeriesDataResponse): ResultSeriesData {
        return ResultSeriesData(
            results = SeriesMapper().toDomain(from.results)
        )
    }
}