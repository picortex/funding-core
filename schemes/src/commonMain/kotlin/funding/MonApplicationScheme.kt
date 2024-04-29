@file:JsExport

package funding

import koncurrent.Later
import kotlinx.JsExport

interface MonApplicationScheme : ApplicationScheme {
    fun reject(uid: String): Later<ApplicationDto>
}