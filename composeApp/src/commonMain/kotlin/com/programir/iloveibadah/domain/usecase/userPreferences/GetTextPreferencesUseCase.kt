package com.programir.iloveibadah.domain.usecase.userPreferences

import com.programir.iloveibadah.domain.repository.IUserPreferencesRepository

class GetTextPreferencesUseCase(private val _userPreferencesRepository: IUserPreferencesRepository) {
    suspend operator fun invoke() = _userPreferencesRepository.getTextPreferences()
}