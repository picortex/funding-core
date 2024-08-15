@file:JsExport

package funding

import funding.params.ApplicationParams
import koncurrent.Later
import kotlinx.JsExport

interface OwnApplicationService : OwnApplicationScheme {
    fun update(params: ApplicationDto): Later<ApplicationDto>
}