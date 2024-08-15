@file:JsExport

package funding

import kotlinx.JsExport
import kotlinx.serialization.Serializable
import kotlin.random.Random

@Serializable
data class Range(
    val minimum: Double,
    val maximum: Double,
) {
    companion object {
        fun random(min: Double, max: Double): Range {
            val mn = Random.nextDouble(min, max)
            val mx = Random.nextDouble(mn, max)
            return Range(mn, mx)
        }
    }
}