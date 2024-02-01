plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("tz.co.asoft.library")
}

kotlin {
    jvm { library() }
    js(IR) { library() }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(projects.fundingDtos)
                api(libs.koncurrent.later.core)
            }
        }

        val commonTest by getting {
            dependencies {
                api(libs.kommander.coroutines)
            }
        }
    }
}