package com.programir.iloveibadah.data.local

import com.programir.iloveibadah.domain.model.TextDisplayPreferences
import com.programir.iloveibadah.domain.model.enum.LanguageMode
import com.programir.iloveibadah.presentation.viewModels.options.settings.SettingsViewModel

//class SettingsStorage(private val settings: Settings) {
//
//    fun getPrefs(): TextDisplayPreferences {
//        val languageMode = settings.getString("languageMode", "BOTH")
//
//        return TextDisplayPreferences(
//            languageMode = LanguageMode.valueOf(languageMode)
//        )
//    }
//
//    fun savePrefs(prefs: TextDisplayPreferences) {
//        settings.putString("languageMode", prefs.languageMode.name)
//    }
//}