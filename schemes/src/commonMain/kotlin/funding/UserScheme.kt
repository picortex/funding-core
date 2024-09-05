@file:JsExport

package funding

import kollections.List
import koncurrent.Later
import kotlinx.JsExport
import kronecker.LoadOptions

interface UserScheme {
    fun list(options: LoadOptions = LoadOptions()): Later<List<PersonalAccountDto>>
    fun listByFunder(funderId:String, options: LoadOptions = LoadOptions()): Later<List<PersonalAccountDto>>
    fun load(uid: String): Later<PersonalAccountDto>
}