package com.github.slwtk.testexportplugin.model

import kotlinx.serialization.Serializable

/**
 * [id] Used for search autotest. If value equals Guid mask filled with zeros, search will be executed using ExternalId
 * [externalId] This property is used to set autotest identifier from client system
 * [projectId] This property is used to link autotest with project
 */
@Serializable
data class AutoTestPutModel(

    val id: String? = null,

    val externalId: String,

    val links: List<LinkPutModel>? = null,

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
) {
    constructor(atModel: AutoTestModel) : this(
        atModel.id,
        atModel.externalId,
        atModel.links,
        atModel.projectId,
        atModel.name,
        atModel.namespace,
        atModel.classname,
        atModel.steps,
        atModel.setup,
        atModel.teardown,
        atModel.title,
        atModel.description,
        atModel.labels?.map { LabelPostModel(it.name) },
        atModel.isFlaky,
        atModel.shouldCreateWorkItem,
    )
}