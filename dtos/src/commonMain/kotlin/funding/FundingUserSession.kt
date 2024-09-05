@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package funding

import identifier.CorporateDto
import identifier.IndividualDto
import kash.Currency
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
class FundingUserSession(
    val user: PersonalAccountDto,
    val secret: String,
    val company: CorporateDto,
    val currency: Currency,
    val timezone: String,
    val salesTax: Int
)