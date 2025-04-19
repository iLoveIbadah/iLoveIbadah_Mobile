package com.programir.iloveibadah.presentation.viewModels.options.settings

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.programir.iloveibadah.domain.model.TextDisplayPreferences
import com.programir.iloveibadah.domain.repository.IUserPreferencesRepository
import kotlinx.coroutines.launch

class SettingsViewModel(private val _userPreferencesRepository: IUserPreferencesRepository) : ViewModel() {
    var _prefs by mutableStateOf(TextDisplayPreferences())
        private set

    init {
        viewModelScope.launch {
            loadPrefs()
        }
    }
    suspend fun loadPrefs() {
        _prefs = _userPreferencesRepository.getTextPreferences()
    }

    suspend fun updatePrefs(prefs: TextDisplayPreferences) {
        _prefs = prefs
        _userPreferencesRepository.saveTextPreferences(prefs)
    }
}