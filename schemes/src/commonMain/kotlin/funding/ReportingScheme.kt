@file:JsExport

package funding

import funding.reporting.DashboardReports
import koncurrent.Later
import kotlinx.JsExport

interface ReportingScheme {
    fun dashboard():Later<DashboardReports>
}