package com.github.slwtk.testexportplugin.model

import kotlinx.serialization.Serializable

/**
 * [externalId] This property is used to set autotest identifier from client system
 * [projectId] This property is used to link autotest with project
 */
@Serializable
data class AutoTestPostModel(
    val externalId: String,

    val links: List<LinkPostModel>? = null,

    val projectId: String,

    val name: String,

    val namespace: String? = null,

    val classname: String? = null,

    val steps: List<AutoTestStepModel>? = null,

    val setup: List<AutoTestStepModel>? = null,

    val teardown: List<AutoTestStepModel>? = null,

    val title: String? = null,

    val description: String? = null,

    val labels: List<LabelPostModel>? = null,

    val isFlaky: Boolean? = null,

    val shouldCreateWorkItem: Boolean? = null
)