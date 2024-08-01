package funding

class OwnQueryReference(
    val create: (applicationId: String) -> String,
    val load: (uid: String) -> String,
    val listByApplication: (applicationId: String) -> String,
    val list:() -> String,
    val update: () -> String,
    val accept: (uid: String) -> String,
    val reject: (uid: String) -> String,
    val requireAction: (uid: String) -> String,
    val review: (uid: String) -> String,
) {
    companion object {
        fun messages(entity: String) = OwnQueryReference(
            create = { "Creating a new $entity" },
            load = { uid -> "Loading $entity with uid=$uid" },
            list = { "Fetching $entity list" },
            listByApplication = { applicationId ->  "Fetching $entity list by uid=$applicationId"},
            update = { "Updating $entity" },
            accept = { "Accepting $entity" },
            reject = { "Rejecting $entity" },
            requireAction = { "Requiring action $entity" },
            review = { "Reviewing $entity" },
        )

        // api/v1/queries
        fun endpoint(base: String, entity: String) = OwnQueryReference(
            create = { "$base/$entity" },
            load = { uid -> "$base/$entity/$uid" },
            list = { "$base/$entity" },
            listByApplication = {applicationId -> "$base/$entity/$applicationId"  },
            update = { "$base/$entity" },
            accept = { uid -> "$base/$entity/accept/$uid" },
            reject = { uid -> "$base/$entity/reject/$uid" },
            requireAction = { uid -> "$base/$entity/requireAction/$uid" },
            review = { uid -> "$base/$entity/review/$uid" },
        )
    }
}