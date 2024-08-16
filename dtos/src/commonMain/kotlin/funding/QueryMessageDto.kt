@file:JsExport

package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable
import krono.Instant

@Serializable
data class QueryMessageDto(
    val uid:String,
    val content:String,
    val date: Instant,
    val from: From,
    val sender: PersonalAccountDto
) {
    enum class From {
        capital,monitor;

        val isCapital get() = this == capital;
        val isMonitor get() = this == monitor;
    }
}


