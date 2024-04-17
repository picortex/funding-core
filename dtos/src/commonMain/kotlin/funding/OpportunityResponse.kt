package funding

import kollections.List
import kotlinx.serialization.Serializable

@Serializable
data class OpportunityResponse(
    val uid: String,
    val name: String,
    val funder: String,
    val logo: String,
    val details: String,
    val criteria: Section,
    val unfunded: Section,
    val funded: Section,
    val threshold: Threshold,
    val types: List<Type>
)