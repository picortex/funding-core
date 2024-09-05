@file:JsExport

package funding

import kollections.List
import kotlinx.JsExport
import kotlinx.serialization.Serializable
import krono.Instant

@Serializable
data class InviteServiceParams(
    val email: String,
    val name: String,
    val funder: Funder? = null,
    val link: String,
    val meta: String
)