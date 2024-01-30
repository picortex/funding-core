import java.io.File

pluginManagement {
    includeBuild("../build-logic")
}

plugins {
    id("multimodule")
}

fun includeSubs(base: String, path: String = base, vararg subs: String) {
    subs.forEach {
        include(":$base-$it")
        project(":$base-$it").projectDir = File("$path/$it")
    }
}

listOf(
    "cinematic", "keep", "lexi", "captain", "neat",
    "kash-api", "geo-api", "geo-client",
    "kronecker", "epsilon-api", "krono-core", "identifier-api",
    "kollections", "koncurrent", "kommander",
).forEach { includeBuild("../$it") }

rootProject.name = "funding-core"

includeSubs("funding", ".", "schemes", "dtos")
