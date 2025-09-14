package com.example.baseandroidapp.core.data.mapper

import com.example.baseandroidapp.core.common.mapper.DomainMapper
import com.example.baseandroidapp.core.model.data.ResultSeries
import com.example.baseandroidapp.core.network.model.ResultSeriesResponse
import javax.inject.Inject

class ResultSeriesMapper @Inject constructor(): DomainMapper<ResultSeriesResponse, ResultSeries> {
    override fun toDomain(from: List<ResultSeriesResponse>): List<ResultSeries> {
        return from.map { toDomain(it) }
    }

    override fun toDomain(from: ResultSeriesResponse): ResultSeries {
        return ResultSeries(
            data = SeriesMapper().toDomain(from.data)
        )
    }
}
