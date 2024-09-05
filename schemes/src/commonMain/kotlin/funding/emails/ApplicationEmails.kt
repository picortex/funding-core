package funding.emails

import funding.params.RequireActionApplicationParams
import identifier.Brand
import raven.bodyMarkup
import raven.css
import sentinel.emails.*
import sentinel.emails.approvedMeatContent
import sentinel.emails.rejectedMeatContent
import sentinel.emails.requiresActionMeatContent
import sentinel.emails.submittedMeatContent

object ApplicationEmails {
    fun submitted(
        brand: Brand,
        greeting: String,
        label: String,
        receptionist: String?,
        link: String,
        year: String,
    ) = bodyMarkup(css().font(family = "Inter,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Helvetica Neue,Ubuntu,sans-serif;")) {
        Barner(brand, label)
        this.submittedMeatContent(brand, greeting)
        Footer(brand, "registered", year)
    }

    fun inReview(
        brand: Brand,
        greeting: String,
        label: String,
        receptionist: String?,
        link: String,
        year: String,
    ) = bodyMarkup(css().font(family = "Inter,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Helvetica Neue,Ubuntu,sans-serif;")) {
        Barner(brand, label)
        this.inReviewMeatContent(brand, greeting)
        Footer(brand, "registered", year)
    }

    fun requiresAction(
        brand: Brand,
        greeting: String,
        label: String,
        receptionist: String?,
        link: String,
        year: String,
        params:RequireActionApplicationParams
    ) = bodyMarkup(css().font(family = "Inter,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Helvetica Neue,Ubuntu,sans-serif;")) {
        Barner(brand, label)
        this.requiresActionMeatContent(brand, greeting, params)
        Footer(brand, "registered", year)
    }

    fun approved(
        brand: Brand,
        greeting: String,
        label: String,
        receptionist: String?,
        link: String,
        year: String,
    ) = bodyMarkup(css().font(family = "Inter,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Helvetica Neue,Ubuntu,sans-serif;")) {
        Barner(brand, label)
        this.approvedMeatContent(brand, greeting)
        Footer(brand, "registered", year)
    }

    fun rejected(
        brand: Brand,
        greeting: String,
        label: String,
        receptionist: String?,
        link: String,
        year: String,
    ) = bodyMarkup(css().font(family = "Inter,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Helvetica Neue,Ubuntu,sans-serif;")) {
        Barner(brand, label)
        this.rejectedMeatContent(brand, greeting)
        Footer(brand, "registered", year)
    }
}