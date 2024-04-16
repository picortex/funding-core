package funding.params

import kotlinx.serialization.Serializable

@Serializable
data class ApplicationParams(
    val opportunity: String,
    val business: String,
)