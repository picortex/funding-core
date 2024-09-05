@file:JsExport

package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class InviteApiParams(
    val email: String,
    val name: String,
    val funder: Funder? = null
)