package funding.emails

import funding.ApplicationDto
import funding.params.RequireActionApplicationParams
import kotlinx.coroutines.CoroutineScope
import krono.Clock
import raven.MultiEmailSender
import raven.TemplatedEmailOptions

class ApplicationTemplatedEmailOptions(
//    val submitted: TemplatedEmailOptions<Any?>,
    val submitted: Submitted,
    val inReview: TemplatedEmailOptions<Any?>,
    val requireAction: TemplatedEmailOptions<RequireActionApplicationParams>,
    val accepted: TemplatedEmailOptions<Any?>,
    val rejected: TemplatedEmailOptions<Any?>,
) {
    class Submitted(
        val applicant: TemplatedEmailOptions<Any?>,
        val reviewer: TemplatedEmailOptions<ApplicationDto>,
    )
}