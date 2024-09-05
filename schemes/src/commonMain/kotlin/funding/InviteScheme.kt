@file:JsExport

package funding

import kollections.List
import koncurrent.Later
import kotlinx.JsExport
import kronecker.LoadOptions

interface InviteScheme {

    fun list(options: LoadOptions = LoadOptions()): Later<List<InviteDto>>
    fun listByFunder(funderId:String, options: LoadOptions = LoadOptions()): Later<List<InviteDto>>
    fun load(uid: String): Later<InviteDto>
}