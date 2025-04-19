package com.programir.iloveibadah.domain.remoteSource

import com.programir.iloveibadah.domain.model.LoginRequest
import com.programir.iloveibadah.domain.model.LoginResponse
import com.programir.iloveibadah.domain.model.RegisterRequest
import com.programir.iloveibadah.domain.models.UserAccount

interface IUserAccountRemoteSource {
    suspend fun register(request: RegisterRequest)
    suspend fun login(request: LoginRequest): LoginResponse
    suspend fun getById(token: String): UserAccount
    suspend fun getAll(token: String): List<UserAccount>
}