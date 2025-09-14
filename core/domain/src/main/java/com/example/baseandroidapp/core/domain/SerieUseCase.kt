package com.example.baseandroidapp.core.domain

import com.example.baseandroidapp.core.data.repository.SerieRepository
import com.example.baseandroidapp.core.model.data.ResultSeries
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SerieUseCase @Inject constructor(
    private val serieRepository: SerieRepository
)  {
    fun fetchSerie(): Flow<ResultSeries> =
        serieRepository.fetchSerie(1011334)
}