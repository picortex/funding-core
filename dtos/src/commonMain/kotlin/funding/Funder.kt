@file:JsExport

package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class Funder(
    val uid: String,
    val name: String,
    val logo: String? = null,
)