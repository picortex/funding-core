@file:JsExport

package funding

import kollections.List
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class CapitalPortalDto(
    val uid: String,
    val monitor: String,
    val name: String,
    val logo: String,
    val address: String,
    val domains: List<String>
)