package funding.params

import funding.QuerySection
import funding.QueryStatus
import kotlinx.serialization.Serializable
import krono.Instant

@Serializable
data class QueryParams (
    val title: String,
    val section: QuerySection,
    val status: QueryStatus,
    val date: Instant,
)
