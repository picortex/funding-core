@file:JsExport

package funding

import kollections.List
import koncurrent.Later
import kotlinx.JsExport
import kronecker.LoadOptions

interface ApplicationScheme {
    fun list(options: LoadOptions = LoadOptions()): Later<List<Application>>
    fun load(uid: String): Later<Application>
    fun remove(uid: String): Later<Application>
}