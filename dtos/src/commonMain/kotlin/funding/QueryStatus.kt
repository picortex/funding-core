@file:JsExport
package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class QueryStatus {
    Ongoing, Closed
}