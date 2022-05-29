package ru.kpfu.model

import kotlinx.serialization.Serializable

@Serializable
data class AutoTestStepModel(

    val title: String,

    val description: String? = null,

    val steps: List<AutoTestStepModel>? = null
)