package com.programir.iloveibadah.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.style.TextAlign
import com.programir.iloveibadah.domain.model.enum.LanguageMode
import com.programir.iloveibadah.domain.model.enum.LayoutDirection
import com.programir.iloveibadah.presentation.common.LocalTextPrefs

@Composable
fun ArabicEnglishText(arabic: String, english: String) {
    val prefs = LocalTextPrefs.current

    val layoutDirection = when(prefs.layoutDirection) {
        LayoutDirection.RightToLeft -> androidx.compose.ui.unit.LayoutDirection.Rtl
        LayoutDirection.LeftToRight -> androidx.compose.ui.unit.LayoutDirection.Ltr
    }

    CompositionLocalProvider(LocalLayoutDirection provides layoutDirection) {
        Column(horizontalAlignment = Alignment.Start) {
            when (prefs.languageMode) {
                LanguageMode.ARABIC_ONLY -> Text(arabic, textAlign = TextAlign.Start)
                LanguageMode.ENGLISH_ONLY -> Text(english, textAlign = TextAlign.Start)
                LanguageMode.BOTH -> {
                    Text(arabic, textAlign = TextAlign.Start)
                    Text(english, textAlign = TextAlign.Start)
                }
            }
        }
    }
}