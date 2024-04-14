@file:JsExport

package funding

import koncurrent.Later
import kollections.List
import kollections.map
import koncurrent.Laters
import koncurrent.later.filterSuccessValues
import koncurrent.later.then
import kotlinx.JsExport
import kotlinx.JsName
import kronecker.LoadOptions

interface FundersScheme {
    fun create(params: FunderParams): Later<Funder>

    fun list(options: LoadOptions = LoadOptions()): Later<List<Funder>>

    fun load(uid: String): Later<Funder>

    fun update(funder: Funder): Later<Funder>

    fun remove(uid: String): Later<Funder>

    @JsName("removeMany")
    fun remove(uids: List<String>) = Laters(uids.map { remove(it) }).then {
        it.filterSuccessValues()
    }
}