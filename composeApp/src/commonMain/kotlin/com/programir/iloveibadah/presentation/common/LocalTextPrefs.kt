package com.programir.iloveibadah.presentation.common

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import com.programir.iloveibadah.domain.model.TextDisplayPreferences

val LocalTextPrefs = compositionLocalOf { TextDisplayPreferences() }

@Composable
fun WithTextPrefs(prefs: TextDisplayPreferences, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalTextPrefs provides prefs) {
        content()
    }
}