package funding

import cabinet.AttachmentDto
import flame.SmeDto
import kotlinx.serialization.Serializable

@Serializable
data class ApplicationFundingDto(
    val amount: Double?,
    val type:Type?,
    val breakdown: List<FundingBreakdownItem>,
    val description: String?,
    val attachment: AttachmentDto?
)