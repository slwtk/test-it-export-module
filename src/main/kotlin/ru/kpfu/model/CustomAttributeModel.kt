package com.github.slwtk.testexportplugin.model

import kotlinx.serialization.Serializable

@Serializable
data class CustomAttributeModel(

    val id: String? = null,

    val options: List<CustomAttributeOptionModel>? = null,

    val type: CustomAttributeTypesEnum,

    val isDeleted: Boolean? = null,

    val name: String,

    val enabled: Boolean? = null,

    val required: Boolean? = null,

    val isGlobal: Boolean? = null
)