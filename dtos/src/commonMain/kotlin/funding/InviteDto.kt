@file:JsExport

package funding

import kollections.List
import kotlinx.JsExport
import kotlinx.serialization.Serializable
import krono.Instant

@Serializable
data class InviteDto(
    val uid: String,
    val name: String,
    val email: String,
    val funder: Funder?,
    val date: Instant,
)