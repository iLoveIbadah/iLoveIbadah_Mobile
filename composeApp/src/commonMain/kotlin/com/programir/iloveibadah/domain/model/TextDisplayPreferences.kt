package com.programir.iloveibadah.domain.model

import com.programir.iloveibadah.domain.model.enum.LanguageMode

data class TextDisplayPreferences (
    val languageMode: LanguageMode = LanguageMode.BOTH
)