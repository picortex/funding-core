package sentinel.emails

import funding.ApplicationDto
import funding.params.RequireActionApplicationParams
import identifier.Brand
import raven.Body
import raven.ComponentScope
import raven.Container

internal fun ComponentScope<Body>.submittedMeatContent(brand: Brand, link: String) {
    p {
        text(
            """
                Your application has been submitted.
            """.trimIndent()
        )
    }
    p {
        text("Thanks!")
        br()
        text("~ The ${brand.name} team")
    }
}

internal fun ComponentScope<Body>.submittedToReviewerMeatContent(brand: Brand, link: String, application: ApplicationDto) {
    p {
        text(
            """
                ${application.business.admin?.business?.name} has submitted a funding request. Login to review application.
            """.trimIndent()
        )
    }
    p {
        text("Thanks!")
        br()
        text("~ The ${brand.name} team")
    }
}

internal fun ComponentScope<Body>.inReviewMeatContent(brand: Brand, link: String) {
    p {
        text(
            """
                Your application is in review.
            """.trimIndent()
        )
    }
//    container(center.padding(v = "1.5em")) {
//        button(css.background(brand.color.background), href = link) {
//            label(css.color(brand.color.foreground), "Verify Email")
//        }
//    }
    p {
        text("Thanks!")
        br()
        text("~ The ${brand.name} team")
    }
}

internal fun ComponentScope<Body>.requiresActionMeatContent(brand: Brand, link: String, params:RequireActionApplicationParams) {
    p {
        text(
            """
                Your application requires action.
            """.trimIndent()
        )
    }
    p {
        text(
            """
                Section:${params.section.label}
            """.trimIndent()
        )
    }
    p {
        text(
            """
                ${params.comments}
            """.trimIndent()
        )
    }

//    container(center.padding(v = "1.5em")) {
//        button(css.background(brand.color.background), href = link) {
//            label(css.color(brand.color.foreground), "Verify Email")
//        }
//    }
    p {
        text("Thanks!")
        br()
        text("~ The ${brand.name} team")
    }
}


internal fun ComponentScope<Body>.approvedMeatContent(brand: Brand, link: String) {
    p {
        text(
            """
                Congratulations. Your application has been accepted.
            """.trimIndent()
        )
    }
//    container(center.padding(v = "1.5em")) {
//        button(css.background(brand.color.background), href = link) {
//            label(css.color(brand.color.foreground), "Verify Email")
//        }
//    }
    p {
        text("Thanks!")
        br()
        text("~ The ${brand.name} team")
    }
}

internal fun ComponentScope<Body>.rejectedMeatContent(brand: Brand, link: String) {
    p {
        text(
            """
                Unfortunately. Your application was not approved.
            """.trimIndent()
        )
    }
//    container(center.padding(v = "1.5em")) {
//        button(css.background(brand.color.background), href = link) {
//            label(css.color(brand.color.foreground), "Verify Email")
//        }
//    }
    p {
        text("Thanks!")
        br()
        text("~ The ${brand.name} team")
    }
}



internal fun ComponentScope<Container>.bak(brand: Brand, link: String) {
    p { text("We are thrilled to have you join us") }
    p {
        text(
            """
                Your application has been submitted.
            """.trimIndent()
        )
    }
//    container(center.padding(v = "1.5em")) {
//        button(css.background(brand.color.background), href = link) {
//            label(css.color(brand.color.foreground), "Verify Email")
//        }
//    }
    p {
        text("Thanks!")
        br()
        text("~ The ${brand.name} team")
    }
}