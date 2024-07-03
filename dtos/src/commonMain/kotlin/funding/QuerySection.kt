@file:JsExport

package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class QuerySection {
    AdminInfo,
    LegalDocs,
    SwotAnalysis,
    FinancialAnalysis,
    ManagementGovernance,
    BusinessPlan,
    FinancialStatements
}