package funding

import flame.SmeDto
import kotlinx.serialization.Serializable

@Serializable
data class ApplicationDto(
    val uid: String,
    val opportunity: Opportunity,
    val funding: ApplicationFundingDto?,
    val business: SmeDto
)