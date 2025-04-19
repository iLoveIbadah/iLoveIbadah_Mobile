package com.programir.iloveibadah.domain.repository

import com.programir.iloveibadah.domain.model.TextDisplayPreferences

interface IUserPreferencesRepository {
    suspend fun getTextPreferences(): TextDisplayPreferences
    suspend fun saveTextPreferences(prefs: TextDisplayPreferences)
}