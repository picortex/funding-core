@file:JsExport

package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable
import krono.Instant

@Serializable
data class QueryMessageDto(
    val content:String,
    val date: Instant
)
