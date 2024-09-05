package funding.emails

import funding.params.QueryMessageParams
import identifier.Brand
import raven.bodyMarkup
import raven.css
import sentinel.emails.*

object QueryEmails {
    fun message(
        brand: Brand,
        greeting: String,
        label: String,
        receptionist: String?,
        link: String,
        year: String,
        params: QueryMessageParams
    ) = bodyMarkup(css().font(family = "Inter,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Helvetica Neue,Ubuntu,sans-serif;")) {
        Barner(brand, label)
        this.messageMeatContent(brand, greeting, params)
        Footer(brand, "registered", year)
    }


}