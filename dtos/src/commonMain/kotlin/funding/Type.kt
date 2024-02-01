@file:JsExport
package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class Type(val label: String) {
    Grand("Grant"),
    Debt("Pure Debt"),
    Equity("Pure Equity"),
    DebtAndEquity("A Combination of Debt and Equity"),
    Mezzanine("Mezzanine type instruments"),
    PurchaseOrderFinancing("Purchase Order Financing"),
    WorkingCapitalSolutions("Working Capital Solutions"),
    Overdrafts("Overdrafts"),
    InvoiceFinancing("Invoice Financing"),
    InvoiceFactoring("Invoice Factoring"),
    AssetBackedFinance("Asset Backed Finance")
}