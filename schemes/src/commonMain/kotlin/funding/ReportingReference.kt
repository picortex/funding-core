package funding

object ReportingReference {
    fun messages() = FundingReference.messages("reporting")
    fun endpoint(base: String) = FundingReference.endpoint(base, "reporting")
}