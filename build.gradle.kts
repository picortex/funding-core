plugins {
    alias(kotlinz.plugins.multiplatform) apply false
    alias(kotlinz.plugins.serialization) apply false
    alias(asoft.plugins.library) apply false
    alias(kotlinz.plugins.dokka)
}

repositories {
    publicRepos()
}

val v = libs.versions.pitwo.get()

group = "com.picortex"
version = v

allprojects {
    group = "com.picortex"
    version = v
}