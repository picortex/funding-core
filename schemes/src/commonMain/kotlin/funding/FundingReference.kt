package funding

class FundingReference(
    val create: () -> String,
    val load: (uid: String) -> String,
    val remove: (uid: String) -> String,
    val list: () -> String,
    val listByFunder: (uid: String) -> String,
    val update: () -> String,
    val accept: (uid: String) -> String,
    val reject: (uid: String) -> String,
    val requireAction: (uid: String) -> String,
    val review: (uid: String) -> String,
    val upload: (name: String) -> String,
    val letter: (name: String) -> String,
    val dashboard: () -> String,
) {
    companion object {
        fun messages(entity: String) = FundingReference(
            create = { "Creating a new $entity" },
            load = { uid -> "Loading $entity with uid=$uid" },
            list = { "Fetching $entity list" },
            listByFunder = { uid ->  "Fetching $entity list by funder $entity" },
            remove = { "Removing $entity with uid=$it" },
            update = { "Updating $entity" },
            accept = { "Accepting $entity" },
            reject = { "Rejecting $entity" },
            requireAction = { "Requiring action $entity" },
            review = { "Reviewing $entity" },
            upload = { "Uploading $entity" },
            letter = { "Uploading letter $entity" },
            dashboard = { "Loading dashboard" },
        )

        // api/v1/applications
        fun endpoint(base: String, entity: String) = FundingReference(
            create = { "$base/$entity" },
            load = { uid -> "$base/$entity/$uid" },
            remove = { uid -> "$base/$entity/$uid" },
            list = { "$base/$entity" },
            listByFunder = { uid -> "$base/$entity/by/funder/$uid" },
            update = { "$base/$entity" },

            accept = { uid -> "$base/$entity/accept/$uid" },
            reject = { uid -> "$base/$entity/reject/$uid" },
            requireAction = { uid -> "$base/$entity/requireAction/$uid" },
            review = { uid -> "$base/$entity/review/$uid" },
            upload = { "$base/sme/document/$it" },
            letter = { "$base/$entity/letter/$it" },
            dashboard = { "$base/dashboard" },
        )
    }
}