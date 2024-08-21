package funding.params

import cabinet.Attachment
import cabinet.FileUploadParam
import kotlinx.serialization.Serializable
import krono.Instant

//@Serializable
data class QueryMessageParams(
    val content:String,
    val attachments: List<FileUploadParam>
) 