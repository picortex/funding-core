@file:JsExport

package funding

import koncurrent.Later
import kotlinx.JsExport

interface ApplicationScheme {
    fun load(uid: String): Later<Application>
    fun remove(uid: String): Later<Application>
}