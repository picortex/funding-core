package funding.params

import funding.ApplicationFundingDto
import funding.ApplicationRejectionReason
import kotlinx.serialization.Serializable

@Serializable
data class RequireActionApplicationParams(
    val comments: String,
)