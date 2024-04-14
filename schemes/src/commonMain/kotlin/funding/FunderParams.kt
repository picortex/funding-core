package funding

import kotlinx.serialization.Serializable

@Serializable
data class FunderParams(
    val name: String,
    val email: String
)