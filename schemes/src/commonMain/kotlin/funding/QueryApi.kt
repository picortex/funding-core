package funding

import funding.params.QueryMessageParams
import funding.params.QueryParams
import kollections.List
import koncurrent.Later
import kronecker.LoadOptions

interface QueryApi:QueryScheme {

    fun sendMessage(uid:String, params: QueryMessageParams): Later<QueryMessageDto>

}