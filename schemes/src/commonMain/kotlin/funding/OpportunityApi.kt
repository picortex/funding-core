@file:JsExport

package funding

import cabinet.Attachment
import cabinet.FileUploadParam
import epsilon.MemorySize
import flame.documents.SMEDocumentUploadParam
import koncurrent.Later
import kotlinx.JsExport
import status.SilentStagedProgressPublisher
import status.StagedProgressPublisher

interface OpportunityApi : OpportunityScheme {

    fun upload(uid: String, params: FileUploadParam, progress: StagedProgressPublisher<MemorySize> = SilentStagedProgressPublisher()): Later<Opportunity>

}