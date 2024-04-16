@file:JsExport
package funding

import kotlinx.JsExport
import flame.SmeDto
import kotlinx.serialization.Serializable

@Serializable
data class Application(
    val uid: String,
    val opportunity: Opportunity,
    val business: SmeDto
)