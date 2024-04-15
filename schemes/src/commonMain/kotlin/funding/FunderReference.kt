package funding

object FunderReference {
    fun messages() = FundingReference.messages("funder")
    fun endpoint(base: String) = FundingReference.endpoint(base, "funders")
}