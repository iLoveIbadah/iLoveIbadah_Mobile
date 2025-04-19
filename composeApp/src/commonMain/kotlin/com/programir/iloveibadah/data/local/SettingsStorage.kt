package com.programir.iloveibadah.data.local

import com.programir.iloveibadah.domain.model.TextDisplayPreferences
import com.programir.iloveibadah.domain.model.enum.LanguageMode
import com.programir.iloveibadah.domain.model.enum.LayoutDirection
import com.programir.iloveibadah.presentation.viewModels.options.settings.SettingsViewModel

class SettingsStorage(private val settings: Settings) {

    fun getPrefs(): TextDisplayPreferences {
        val languageMode = settings.getString("languageMode", "BOTH")
        val layout = settings.getString("layoutDirection", "RTL")

        return TextDisplayPreferences(
            languageMode = LanguageMode.valueOf(languageMode),
            layoutDirection = LayoutDirection.valueOf(layout)
        )
    }

    fun savePrefs(prefs: TextDisplayPreferences) {
        settings.putString("languageMode", prefs.languageMode.name)
        settings.putString("layoutDirection", prefs.layoutDirection.name)
    }
}