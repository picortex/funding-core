@file:JsExport

package funding

import koncurrent.Later
import kotlinx.JsExport
import kronecker.LoadOptions

interface OpportunityQueryScheme {
    fun list(options: LoadOptions = LoadOptions()): Later<OpportunityListResponse>
    fun load(uid: String): Later<Opportunity>
}