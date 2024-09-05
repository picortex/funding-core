package funding

object UserReference {
    fun messages() = FundingReference.messages("user")
    fun endpoint(base: String) = FundingReference.endpoint(base, "users")
}