@file:JsExport

package funding

import kollections.List
import kotlinx.JsExport
import kotlinx.serialization.Serializable
import krono.Instant

@Serializable
data class OpportunityParams(
    val name: String,
    val funder: String,
    val details: String,
    val criteria: Section,
    val unfunded: Section,
    val funded: Section,
    val threshold: Threshold,
    val range: Range,
    val types: List<Type>,
    val deadline: Instant?
)