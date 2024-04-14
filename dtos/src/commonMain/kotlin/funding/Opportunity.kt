@file:JsExport

package funding

import kollections.List
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class Opportunity(
    val uid: String,
    val name: String,
    val funder: Funder,
    val logo: String,
    val details: String,
    val criteria: Section,
    val unfunded: Section,
    val funded: Section,
    val threshold: Threshold,
    val types: List<Type>
)