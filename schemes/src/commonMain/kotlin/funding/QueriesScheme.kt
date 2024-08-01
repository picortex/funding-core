package funding

import funding.params.QueryMessageParams
import funding.params.QueryParams
import kollections.List
import koncurrent.Later
import kronecker.LoadOptions

interface QueriesScheme {
    fun create(applicationId:String, params: QueryParams): Later<QueryDto>

    fun list(uid:String, options: LoadOptions = LoadOptions()): Later<List<QueryDto>>

    fun load(uid:String): Later<QueryDto>

    fun close(uid:String): Later<QueryDto>

    fun sendMessage(uid:String, params: QueryMessageParams): Later<QueryMessageDto>
}