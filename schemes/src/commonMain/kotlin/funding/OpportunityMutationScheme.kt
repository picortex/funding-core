@file:JsExport

package funding

import kollections.List
import koncurrent.Later
import kotlinx.JsExport

interface OpportunityMutationScheme {
    fun create(params: OpportunityParams): Later<Opportunity>
    fun expire(uid: String): Later<List<String>>
    fun remove(uid: String): Later<Opportunity>
    fun update(opportunity: Opportunity): Later<Opportunity>
}