package funding

class FundingReference(
    val create: () -> String,
    val load: (uid: String) -> String,
    val remove: (uid: String) -> String,
    val list: () -> String,
    val update: () -> String,
    val accept: (uid: String) -> String,
    val reject: (uid: String) -> String,
    val requireAction: (uid: String) -> String,
    val review: (uid: String) -> String,
) {
    companion object {
        fun messages(entity: String) = FundingReference(
            create = { "Creating a new $entity" },
            load = { uid -> "Loading $entity with uid=$uid" },
            list = { "Fetching $entity list" },
            remove = { "Removing $entity with uid=$it" },
            update = { "Updating $entity" },
            accept = { "Accepting $entity" },
            reject = { "Rejecting $entity" },
            requireAction = { "Requiring action $entity" },
            review = { "Reviewing $entity" },
        )

        // api/v1/applications
        fun endpoint(base: String, entity: String) = FundingReference(
            create = { "$base/$entity" },
            load = { uid -> "$base/$entity/$uid" },
            remove = { uid -> "$base/$entity/$uid" },
            list = { "$base/$entity" },
            update = { "$base/$entity" },

            accept = { uid -> "$base/$entity/accept/$uid" },
            reject = { uid -> "$base/$entity/reject/$uid" },
            requireAction = { uid -> "$base/$entity/requireAction/$uid" },
            review = { uid -> "$base/$entity/review/$uid" },
        )
    }
}