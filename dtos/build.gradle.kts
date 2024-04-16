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
                api(libs.krono.api)
                api(libs.kronecker.core)
                api(libs.flame.dtos.smes)
            }
        }

        val commonTest by getting {
            dependencies {
                api(libs.kommander.coroutines)
            }
        }
    }
}