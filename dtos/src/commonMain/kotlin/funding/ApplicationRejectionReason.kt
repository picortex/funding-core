@file:JsExport
package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
enum class ApplicationRejectionReason(val title: String, val description: String) {
    IncompleteApplication(
        "Incomplete Application",
        "Missing or incomplete documentation, forms, or information."
    ),
    LackOfEligibility(
        "Lack of Eligibility",
        "The applicant does not meet the basic eligibility criteria set by the funding organization."
    ),
    PoorFinancialHealth(
        "Poor Financial Health",
        "The financial statements of the applicant show poor financial health, high debt levels, or a lack of financial stability."
    ),
    WeakBusinessPlan(
        "Weak Business Plan",
        "The business plan or project proposal is not convincing, lacks detail, or does not clearly articulate the goals, strategies, and potential for success."
    ),
    InsufficientMarketResearch(
        "Insufficient Market Research",
        "Lack of thorough market research, demonstrating a poor understanding of the market demand, competition, and potential risks."
    ),
    LackOfTrackRecord(
        "Lack of Track Record",
        "The applicant or team has no proven track record or experience in the relevant field or industry."
    ),
    UnclearUseOfFunds(
        "Unclear Use of Funds",
        "The application does not clearly specify how the funds will be used or the proposed use of funds does not align with the funding organization’s priorities."
    ),
    HighRisk(
        "High Risk",
        "The project or business is deemed too risky, with a high chance of failure or insufficient risk mitigation strategies."
    ),
    NonComplianceWithGuidelines(
        "Non-Compliance with Guidelines",
        "The application does not adhere to the guidelines or requirements set by the funding organization, such as formatting, word count, or specific submission criteria."
    ),
    LowPotentialForImpact(
        "Low Potential for Impact",
        "The proposed project or business has low potential for significant impact, innovation, or scalability."
    ),
    LimitedBudget(
        "Limited Budget",
        "The funding organization has a limited budget and higher quality applications may have exhausted available funds."
    ),
    DuplicateApplications(
        "Duplicate Applications",
        "Multiple applications from the same organization or similar projects that have already been funded by the organization."
    ),
    TimingIssues(
        "Timing Issues",
        "The application was submitted after the deadline or the proposed project timeline does not align with the funding organization's schedule."
    ),
    NegativeReferencesOrReputation(
        "Negative References or Reputation",
        "Negative feedback from references or a poor reputation in the industry or community."
    ),
    OverSubscription(
        "Over-Subscription",
        "The funding call received more applications than can be funded, leading to more stringent selection criteria."
    )
}