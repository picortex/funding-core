@file:JsExport

package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class FundingBreakdownItem(val label: String) {
    BusinessAcquisition("Business Acquisition"),
    CAPEX("CAPEX (Plant & Equipment"),
    WorkingCapital("Working Capital"),
    ProjectFinance("Project Finance"),
    PurchaseOrderFinancing("Purchase Order Financing")
}