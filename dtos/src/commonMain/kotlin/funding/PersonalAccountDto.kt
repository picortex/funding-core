package funding

import kotlinx.serialization.Serializable

@Serializable
data class PersonalAccountDto(
    val name: String,
    val photo: String?,
    val email: String,
    val uid: String,
    val funder: Funder?
) {
    val isFunderUser get() = funder != null
    
}