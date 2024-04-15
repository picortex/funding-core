@file:JsExport

package funding

import kollections.List
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class OpportunityParams(
    val name: String,
    val funder: String,
    val details: String,
    val criteria: Section,
    val unfunded: Section,
    val funded: Section,
    val threshold: Threshold,
    val types: List<Type>
)