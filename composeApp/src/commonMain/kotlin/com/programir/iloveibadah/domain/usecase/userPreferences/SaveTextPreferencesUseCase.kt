package com.programir.iloveibadah.domain.usecase.userPreferences

import com.programir.iloveibadah.domain.model.TextDisplayPreferences
import com.programir.iloveibadah.domain.repository.IUserPreferencesRepository

class saveTextPreferencesUseCase(private val _userPreferencesRepository: IUserPreferencesRepository) {
    suspend operator fun invoke(prefs: TextDisplayPreferences) = _userPreferencesRepository.saveTextPreferences(prefs)
}