package com.github.slwtk.testexportplugin.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Values: STRING,DATETIME,OPTIONS,USER,MULTIPLEOPTIONS
 */
@Serializable
enum class CustomAttributeTypesEnum {
    @SerialName("string") STRING,
    @SerialName("datetime") DATETIME,
    @SerialName("options") OPTIONS,
    @SerialName("user") USER,
    @SerialName("multipleOptions") MULTIPLEOPTIONS;
}