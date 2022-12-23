package com.example.borutoapp.domain.usecase

import com.example.borutoapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(complete: Boolean) {
        repository.saveOnBoardingState(complete)
    }
}