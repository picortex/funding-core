@file:JsExport

package funding

import koncurrent.Later
import kollections.List
import kotlinx.JsExport
import kronecker.LoadOptions

interface FundersScheme {
    fun create(name: String): Later<Funder>

    fun list(options: LoadOptions = LoadOptions()): Later<List<Funder>>

    fun load(uid: String): Later<Funder>

    fun update(funder: Funder): Later<Funder>

    fun remove(uid: String): Later<Funder>
}