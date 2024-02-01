@file:JsExport

package funding

import kollections.List
import koncurrent.Later
import kotlinx.JsExport

interface OpportunityQueryScheme {
    fun list() : Later<List<Opportunity>>
    fun load(uid: String) : Later<Opportunity>
}