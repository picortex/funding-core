package funding

import kronecker.LoadOptions
import kronecker.toQueryParams

class OpportunityEndpoint(base: String) {
    private val root = "$base/opportunities"

    fun list(options: LoadOptions?) = "$root/list${options.toQueryParams("?")}"

    fun load(uid: String) = "$root/$uid"

    fun expire(uid: String) = "$root/expire/$uid"
}