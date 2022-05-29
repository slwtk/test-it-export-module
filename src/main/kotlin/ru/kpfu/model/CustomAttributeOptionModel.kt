package ru.kpfu.model

import kotlinx.serialization.Serializable

@Serializable
data class CustomAttributeOptionModel(

    val id: String? = null,

    val isDeleted: Boolean? = null,

    val value: String? = null,

    val isDefault: Boolean? = null
)