@file:JsExport

package funding

import kollections.List
import kollections.map
import koncurrent.Later
import koncurrent.Laters
import koncurrent.later.filterSuccessValues
import koncurrent.later.then
import kotlinx.JsExport
import kotlinx.JsName
import kronecker.LoadOptions

interface UserScheme {
    fun list(options: LoadOptions = LoadOptions()): Later<List<PersonalAccountDto>>
    fun listByFunder(funderId:String, options: LoadOptions = LoadOptions()): Later<List<PersonalAccountDto>>
    fun load(uid: String): Later<PersonalAccountDto>
    fun remove(uid: String): Later<PersonalAccountDto>

    @JsName("removeMany")
    fun remove(uids: List<String>) = Laters(uids.map { remove(it) }).then {
        it.filterSuccessValues()
    }
}