package com.programir.iloveibadah.domain.model

import com.programir.iloveibadah.domain.model.enum.LanguageMode
import com.programir.iloveibadah.domain.model.enum.LayoutDirection

data class TextDisplayPreferences (
    val languageMode: LanguageMode = LanguageMode.BOTH,
    val layoutDirection: LayoutDirection = LayoutDirection.RightToLeft
)