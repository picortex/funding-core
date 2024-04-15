@file:JsExport
package funding

import kotlinx.JsExport

data class Application(
    val uid: String,
    val opportunity: Opportunity,
)