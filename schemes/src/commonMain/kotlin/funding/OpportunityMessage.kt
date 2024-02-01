package funding

class OpportunityMessage {
    fun list() = "Fetching a list of opportunities"

    fun load(uid: String) = "Loading opportunity with uid=$uid"

    fun expire(uid: String) = "Marking opportunity with $uid=$uid as expired"
}