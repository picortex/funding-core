package funding

object InviteReference {
    fun messages() = FundingReference.messages("invite")
    fun endpoint(base: String) = FundingReference.endpoint(base, "invites")
}