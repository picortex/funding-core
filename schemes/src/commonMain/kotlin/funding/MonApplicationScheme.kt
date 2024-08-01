@file:JsExport

package funding

import funding.params.RejectApplicationParams
import funding.params.RequireActionApplicationParams
import koncurrent.Later
import kotlinx.JsExport

interface MonApplicationScheme : ApplicationScheme {
    fun review(uid: String): Later<ApplicationDto>
    fun requireAction(uid: String, params:RequireActionApplicationParams): Later<ApplicationDto>
    fun reject(uid: String, params: RejectApplicationParams): Later<ApplicationDto>
    fun accept(uid: String): Later<ApplicationDto>

}