package com.programir.iloveibadah.data.repository

import com.programir.iloveibadah.data.local.SettingsStorage
import com.programir.iloveibadah.domain.model.TextDisplayPreferences
import com.programir.iloveibadah.domain.repository.IUserPreferencesRepository

class UserPreferencesRepository(private val storage: SettingsStorage) : IUserPreferencesRepository {
    //private var _prefs = TextDisplayPreferences()

    override suspend fun getTextPreferences(): TextDisplayPreferences {
        return storage.getPreferences()
    }

    override suspend fun saveTextPreferences(prefs: TextDisplayPreferences) {
        storage.savePreferences(prefs)
    }
}