package funding

import funding.params.QueryMessageParams
import funding.params.QueryParams
import kollections.List
import koncurrent.Later
import kronecker.LoadOptions

interface MonQueryScheme:QueryScheme {
    fun create(applicationId:String, params: QueryParams): Later<QueryDto>
    fun close(uid:String): Later<QueryDto>
}