package funding

class FundersReference(
    val create: () -> String,
    val load: (uid: String) -> String,
    val list: () -> String,
    val update: () -> String,
) {
    companion object {
        fun messages() = FundersReference(
            create = { "Creating a new funder" },
            load = { uid -> "Loading funder with uid=$uid" },
            list = { "Fetching a list of funders" },
            update = { "Updating a funder" },
        )

        fun endpoint(base: String) = FundersReference(
            create = { "$base/funders" },
            load = { uid -> "$base/funders/$uid" },
            list = { "$base/funders" },
            update = { "$base/funders" },
        )
    }
}