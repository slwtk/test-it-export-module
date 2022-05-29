package com.github.slwtk.testexportplugin.model

import kotlinx.serialization.Serializable

/**
 * [isFavorite] Property is used to filter favourite projects
 */
@Serializable
data class ProjectModel(

    val attributesScheme: List<CustomAttributeModel>? = null,

    val testCasesCount: Int? = null,

    val sharedStepsCount: Int? = null,

    val checkListsCount: Int? = null,

    val autoTestsCount: Int? = null,

    val isFavorite: Boolean? = null,

    val isDeleted: Boolean? = null,

    val createdDate: String? = null,

    val modifiedDate: String? = null,

    val createdById: String? = null,

    val modifiedById: String? = null,

    val globalId: Long? = null,

    val id: String? = null,

    val description: String? = null,

    val name: String
)