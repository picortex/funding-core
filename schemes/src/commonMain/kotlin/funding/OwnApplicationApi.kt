package funding

import cabinet.FileUploadParam
import epsilon.MemorySize
import koncurrent.Later
import status.SilentStagedProgressPublisher
import status.StagedProgressPublisher

interface OwnApplicationApi:OwnApplicationScheme {

    fun letter(uid: String, params: FileUploadParam, progress: StagedProgressPublisher<MemorySize> = SilentStagedProgressPublisher()): Later<ApplicationDto>

}