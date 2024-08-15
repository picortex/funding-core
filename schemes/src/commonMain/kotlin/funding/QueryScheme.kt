package funding

import funding.params.QueryMessageParams
import funding.params.QueryParams
import kollections.List
import koncurrent.Later
import kronecker.LoadOptions

interface QueryScheme {
    fun list(options: LoadOptions = LoadOptions()): Later<List<QueryDto>>

    fun listByApplication(applicationId: String, options: LoadOptions = LoadOptions()): Later<List<QueryDto>>

    fun load(uid:String): Later<QueryDto>

    fun sendMessage(uid:String, params: QueryMessageParams): Later<QueryMessageDto>

    fun messages(uid: String, options: LoadOptions = LoadOptions()): Later<List<QueryMessageDto>>
}