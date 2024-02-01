@file:JsExport

package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable
import kotlin.random.Random

@Serializable
data class Range(
    val minimum: Int,
    val maximum: Int,
) {
    companion object {
        fun random(min: Int, max: Int): Range {
            val mn = Random.nextInt(min, max)
            val mx = Random.nextInt(mn, max)
            return Range(mn, mx)
        }
    }
}