package funding.params

import funding.ApplicationFundingDto
import funding.ApplicationRejectionReason
import funding.QuerySection
import kotlinx.serialization.Serializable

@Serializable
data class RequireActionApplicationParams(
    val comments: String,
    val section: QuerySection
)