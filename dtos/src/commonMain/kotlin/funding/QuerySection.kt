@file:JsExport

package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class QuerySection(val label:String) {
    AdminInfo("Admin Info"),
    LegalDocs("Legal Docs"),
    SwotAnalysis("SWOT Analysis"),
    FinancialAnalysis("Financial Analysis"),
    ManagementGovernance("Management Governance"),
    BusinessPlan("Business Plan"),
    FinancialStatements("Financial Statements")
}