package funding.emails

import funding.params.RequireActionApplicationParams
import kotlinx.coroutines.CoroutineScope
import krono.Clock
import raven.MultiEmailSender
import raven.TemplatedEmailOptions

class ApplicationTemplatedEmailOptions(
    val submitted: TemplatedEmailOptions<Any?>,
    val inReview: TemplatedEmailOptions<Any?>,
    val requireAction: TemplatedEmailOptions<RequireActionApplicationParams>,
    val accepted: TemplatedEmailOptions<Any?>,
    val rejected: TemplatedEmailOptions<Any?>,
)