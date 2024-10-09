@file:JsExport

package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class QuerySection(val label:String) {
    AdminInfo("Administration Information"),
    LegalDocs("Document Upload"),
    BusinessReview("Business Review"),
    SwotAnalysis("SWOT Analysis"),
    ManagementGovernance("Management Governance"),
    BusinessPlan("Business Plan"),
    FinancialAnalysis("Financial Analysis")
}