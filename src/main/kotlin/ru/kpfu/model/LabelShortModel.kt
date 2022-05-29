package ru.kpfu.model

import kotlinx.serialization.Serializable

@Serializable
data class LabelShortModel(val globalId: Long? = null, val name: String)