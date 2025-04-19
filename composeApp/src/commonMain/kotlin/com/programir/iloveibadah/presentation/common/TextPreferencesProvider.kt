package com.programir.iloveibadah.presentation.common

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import com.programir.iloveibadah.domain.model.TextDisplayPreferences

val LocalTextPreferences = compositionLocalOf { TextDisplayPreferences() }

@Composable
fun WithTextPreferences(prefs: TextDisplayPreferences, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalTextPreferences provides prefs) {
        content()
    }
}