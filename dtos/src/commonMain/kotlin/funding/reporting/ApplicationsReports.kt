@file:JsExport
package funding.reporting

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class ApplicationsReports(
    val total: Int,
)