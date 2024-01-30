plugins {
    alias(kotlinz.plugins.multiplatform) apply false
    alias(kotlinz.plugins.serialization) apply false
    alias(asoft.plugins.library) apply false
    alias(kotlinz.plugins.dokka)
}

repositories {
    publicRepos()
}

val v = libs.versions.asoft.get()

group = "com.picortex"
version = v

allprojects {
    group = "tz.co.asoft"
    version = v
}