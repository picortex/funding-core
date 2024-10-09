@file:JsExport
package funding.reporting

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class DashboardReports(
    val applications: ApplicationsReports,
    val businesses: BusinessesReports,
    val queries: QueriesReports,
)