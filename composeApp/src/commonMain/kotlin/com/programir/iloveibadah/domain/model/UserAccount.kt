package com.programir.iloveibadah.domain.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserAccount(
    @SerialName("id")
    val id: String,
    @SerialName("fullName")
    val fullName: String,
    @SerialName("uniqueId")
    val uniqueId: String,
    @SerialName("email")
    val email: String,
    @SerialName("profilePictureTypeId")
    val profilePictureTypeId: Int,
    @SerialName("currentLocation")
    val currentLocation: String,
    @SerialName("isPermanentlyBanned")
    val isPermanentlyBanned: Boolean
)
