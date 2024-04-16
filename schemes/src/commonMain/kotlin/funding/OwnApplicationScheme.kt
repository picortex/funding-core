@file:JsExport

package funding

import funding.params.ApplicationParams
import kollections.List
import koncurrent.Later
import kotlinx.JsExport
import kronecker.LoadOptions

interface OwnApplicationScheme : ApplicationScheme {
    fun create(params: ApplicationParams): Later<Application>
    fun list(options: LoadOptions = LoadOptions()): Later<List<Application>>
}