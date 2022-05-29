package ru.kpfu.model

import kotlinx.serialization.Serializable

/**
 * [lastTestResultOutcome] Property can contain one of these values: Passed, Failed, Pending, Blocked, Skipped
 * [externalId] This property is used to set autotest identifier from client system
 * [projectId] This property is used to link autotest with project
 */
@Serializable
data class AutoTestModel(
    val globalId: Long? = null,

    val isDeleted: Boolean? = null,

    val mustBeApproved: Boolean? = null,

    val id: String? = null,

    val createdDate: String? = null,

    val modifiedDate: String? = null,

    val createdById: String? = null,

    val modifiedById: String? = null,

    val lastTestRunId: String? = null,

    val lastTestRunName: String? = null,

    val lastTestResultId: String? = null,

    val lastTestResultOutcome: String? = null,

    val stabilityPercentage: Int? = null,

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

    val labels: List<LabelShortModel>? = null,

    val isFlaky: Boolean? = null,

    val shouldCreateWorkItem: Boolean? = null
)