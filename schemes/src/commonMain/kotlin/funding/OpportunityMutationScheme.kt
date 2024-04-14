@file:JsExport

package funding

import kollections.List
import koncurrent.Later
import kotlinx.JsExport

interface OpportunityMutationScheme {
    fun create(opportunity: Opportunity): Later<Opportunity>
    fun expire(uid: String): Later<List<String>>
}