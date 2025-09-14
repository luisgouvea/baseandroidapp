package com.example.baseandroidapp.core.data.repository

import com.example.baseandroidapp.core.model.data.ResultSeries
import kotlinx.coroutines.flow.Flow

interface SerieRepository {
    fun fetchSerie(
        id: Int
    ): Flow<ResultSeries>
}