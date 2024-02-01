@file:JsExport
package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class Threshold(
    val amount: Range,
    val loan: Range
)