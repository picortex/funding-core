package funding

object OpportunityReference {
    fun messages() = FundingReference.messages("opportunity")
    fun endpoint(base: String) = FundingReference.endpoint(base, "opportunities")
}