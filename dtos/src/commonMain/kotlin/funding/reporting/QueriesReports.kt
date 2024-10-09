@file:JsExport
package funding.reporting

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class QueriesReports(
    val total: Int,
)