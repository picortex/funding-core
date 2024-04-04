package funding

class FundersReference(
    val create: () -> String,
    val load: (uid: String) -> String,
    val remove: (uid: String) -> String,
    val list: () -> String,
    val update: () -> String,
) {
    companion object {
        fun messages() = FundersReference(
            create = { "Creating a new funder" },
            load = { uid -> "Loading funder with uid=$uid" },
            list = { "Fetching a list of funders" },
            remove = { "Removing funder with uid=$it" },
            update = { "Updating a funder" },
        )

        fun endpoint(base: String) = FundersReference(
            create = { "$base/funders" },
            load = { uid -> "$base/funders/$uid" },
            remove = { uid -> "$base/funders/$uid" },
            list = { "$base/funders" },
            update = { "$base/funders" },
        )
    }
}