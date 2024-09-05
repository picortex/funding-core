@file:JsExport

package funding

import koncurrent.Later
import kotlinx.JsExport

interface InviteApi : InviteScheme {
    fun create(params: InviteApiParams): Later<InviteDto>
}