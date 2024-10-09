@file:JsExport
package funding.reporting

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class BusinessesReports(
    val total: Int,
    val completed: Int,
)