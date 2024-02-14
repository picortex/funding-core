@file:JsExport

package funding

import kollections.List
import koncurrent.Later
import kotlinx.JsExport
import kronecker.LoadOptions

interface OpportunityQueryScheme {
    fun list(options: LoadOptions = LoadOptions()): Later<List<Opportunity>>
    fun load(uid: String): Later<Opportunity>
}