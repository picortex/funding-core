package funding

import kollections.List
import kotlinx.serialization.Serializable
import krono.Instant

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
    val range: Range,
    val types: List<Type>,
    val deadline: Instant?
)