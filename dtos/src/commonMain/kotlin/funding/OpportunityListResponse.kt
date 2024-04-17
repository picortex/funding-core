@file:JsExport

package funding

import kollections.List
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
class OpportunityListResponse(
    val funders: List<Funder>,
    val opportunities: List<OpportunityResponse>,
)