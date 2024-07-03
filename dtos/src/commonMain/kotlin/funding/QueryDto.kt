@file:JsExport

package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable
import krono.Instant

@Serializable
data class QueryDto(
    val uid: String,
    val title: String,
    val section: QuerySection,
    val status: QueryStatus,
    val date: Instant,
)