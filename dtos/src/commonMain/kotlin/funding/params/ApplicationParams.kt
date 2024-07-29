package funding.params

import funding.ApplicationFundingDto
import kotlinx.serialization.Serializable

@Serializable
data class ApplicationParams(
    val opportunity: String,
    val business: String,
    val funding: ApplicationFundingDto
)