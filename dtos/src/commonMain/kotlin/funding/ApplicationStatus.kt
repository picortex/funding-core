@file:JsExport
package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
sealed class ApplicationStatus {
    abstract val label:String

    @Serializable
    object Submitted:ApplicationStatus() {
        override val label: String get() = "Submitted"
    }

    @Serializable
    object InReview:ApplicationStatus(){
        override val label: String get() = "In Review"
    }

    @Serializable
    data class ActionRequired(
        val comments:String
    ):ApplicationStatus() {
        override val label: String get() = "Action Required"
    }

    @Serializable
    data class Rejected(
        val reason: ApplicationRejectionReason,
        val comments:String
    ):ApplicationStatus(){
        override val label: String get() = "Rejected"
    }

    @Serializable
    object Accepted:ApplicationStatus(){
        override val label: String get() = "Accepted"
    }

    val submitted get() = this as? Submitted
    val inReview get() = this as? InReview
    val actionRequired get() = this as? ActionRequired
    val rejected get() = this as? Rejected
    val accepted get() = this as? Accepted
}

