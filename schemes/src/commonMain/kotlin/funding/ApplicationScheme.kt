@file:JsExport
package funding

import koncurrent.Later
import kotlinx.JsExport

interface ApplicationScheme {
    fun remove(uid: String): Later<Application>
}