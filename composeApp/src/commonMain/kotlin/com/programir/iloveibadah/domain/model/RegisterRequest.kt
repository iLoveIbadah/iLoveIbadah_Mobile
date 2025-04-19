package com.programir.iloveibadah.domain.model

data class RegisterRequest (
    val fullName: String,
    val email: String,
    val password: String
)