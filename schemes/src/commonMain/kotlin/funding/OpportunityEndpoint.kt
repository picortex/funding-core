package funding

class OpportunityEndpoint(base: String) {
    private val root = "$base/opportunities"

    fun list() = "$root/list"

    fun load(uid: String) = "$root/$uid"

    fun expire(uid: String) = "$root/expire/$uid"
}