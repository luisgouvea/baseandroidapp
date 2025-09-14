package com.example.baseandroidapp.core.network.model

import com.squareup.moshi.Json

data class ResultSeriesDataResponse(
    @Json(name = "results") val results: List<SeriesResponse>
)