package com.programir.iloveibadah.domain.repository

import com.programir.iloveibadah.domain.model.LoginRequest
import com.programir.iloveibadah.domain.model.LoginResponse
import com.programir.iloveibadah.domain.model.RegisterRequest
import com.programir.iloveibadah.domain.models.UserAccount
import com.programir.iloveibadah.domain.remoteSource.IUserAccountRemoteSource

class IUserAccountRepository(private val _remote: IUserAccountRemoteSource) {

    suspend fun register(fullName: String, email: String, password: String) {
        _remote.register(RegisterRequest(fullName, email, password))
    }

    suspend fun login(email: String, password: String): LoginResponse {
        return _remote.login(LoginRequest(email, password))
    }

    suspend fun getById(token: String): UserAccount {
        return _remote.getById(token)
    }

    suspend fun getAll(token: String): List<UserAccount> {
        return _remote.getAll(token)
    }
    //suspend fun logout() {}
}