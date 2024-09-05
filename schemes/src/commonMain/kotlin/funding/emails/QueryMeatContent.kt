package sentinel.emails

import funding.params.QueryMessageParams
import funding.params.RequireActionApplicationParams
import identifier.Brand
import raven.Body
import raven.ComponentScope
import raven.Container

internal fun ComponentScope<Body>.messageMeatContent(brand: Brand, link: String, params:QueryMessageParams) {
    p {
        text(
            """
                You've received a new query message.
            """.trimIndent()
        )
    }

    p {
        text(
            """
                ${params.content}
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
