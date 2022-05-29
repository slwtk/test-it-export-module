package ru.kpfu.model

import kotlinx.serialization.Serializable

@Serializable
data class LinkPostModel(

    val title: String? = null,

    val url: String,

    val description: String? = null,

    val type: LinkType? = null,

    val hasInfo: Boolean? = null
)