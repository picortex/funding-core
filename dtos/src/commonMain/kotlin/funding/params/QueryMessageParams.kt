package funding.params

import kotlinx.serialization.Serializable
import krono.Instant

@Serializable
data class QueryMessageParams(
    val content:String
) 