@file:JsExport
package funding

import kollections.List
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class Section(
    val title: String,
    val description: String,
    val bullets: List<String>,
    val notes: String
)