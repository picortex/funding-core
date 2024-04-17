@file:JsExport

package funding

import funding.params.ApplicationParams
import koncurrent.Later
import kotlinx.JsExport

interface OwnApplicationScheme : ApplicationScheme {
    fun create(params: ApplicationParams): Later<Application>
}