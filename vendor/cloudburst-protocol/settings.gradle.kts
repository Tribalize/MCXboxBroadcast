@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        maven("https://repo.opencollab.dev/maven-releases")
        maven("https://repo.opencollab.dev/maven-snapshots")
    }
}

plugins {
    // Foojay 0.x directly references JvmVendorSpec.IBM_SEMERU, which Gradle 9
    // removed. 1.0.0 supports Gradle 9 and is run by this build's JDK 17.
    id("org.gradle.toolchains.foojay-resolver-convention") version ("1.0.0")
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "protocol"

include("adventure", "bedrock-codec", "bedrock-connection", "common")
