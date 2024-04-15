package funding

class FundingReference(
    val create: () -> String,
    val load: (uid: String) -> String,
    val remove: (uid: String) -> String,
    val list: () -> String,
    val update: () -> String,
) {
    internal companion object {
        fun messages(entity: String) = FundingReference(
            create = { "Creating a new $entity" },
            load = { uid -> "Loading $entity with uid=$uid" },
            list = { "Fetching $entity list" },
            remove = { "Removing $entity with uid=$it" },
            update = { "Updating $entity" },
        )

        fun endpoint(base: String, entity: String) = FundingReference(
            create = { "$base/$entity" },
            load = { uid -> "$base/$entity/$uid" },
            remove = { uid -> "$base/$entity/$uid" },
            list = { "$base/$entity" },
            update = { "$base/$entity" },
        )
    }
}