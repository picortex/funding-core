@file:JsExport

package funding

import kollections.List
import koncurrent.Later
import kotlinx.JsExport

interface OpportunityMutationScheme {
    fun expire(uid: String): Later<List<String>>
}