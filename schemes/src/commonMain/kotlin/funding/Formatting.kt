package funding

import krono.Instant
import krono.PresenterPattern
import krono.TimeZone
import krono.toDateTimePresenter

fun Instant.zaDateTimePresenter() = toDateTimePresenter(
    tz = TimeZone(kotlinx.datetime.TimeZone.of("UTC+02:00").id),
    pattern = PresenterPattern(
        date = "{DD} {MMM} {YYYY}",
        time = "{HH}:{mm}:{ss}",
        dateTime = "{YYYY}-{MM}-{DD} {HH}:{mm}:{ss}"
    )
)

