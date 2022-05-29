package ru.kpfu.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class LinkType() {
    @SerialName("Related") RELATED,
    @SerialName("BlockedBy") BLOCKEDBY,
    @SerialName("Defect") DEFECT,
    @SerialName("Issue") ISSUE,
    @SerialName("Requirement") REQUIREMENT,
    @SerialName("Repository") REPOSITORY,
}