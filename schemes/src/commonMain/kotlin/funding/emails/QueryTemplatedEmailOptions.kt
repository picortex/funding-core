package funding.emails

import funding.params.QueryMessageParams
import kotlinx.coroutines.CoroutineScope
import krono.Clock
import raven.MultiEmailSender
import raven.TemplatedEmailOptions

class QueryTemplatedEmailOptions(
    val message: TemplatedEmailOptions<QueryMessageParams>,
)