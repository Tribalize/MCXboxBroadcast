include(":core")
include(":bootstrap-standalone")
include(":bootstrap-geyser")
project(":bootstrap-standalone").projectDir = file("bootstrap/standalone")
project(":bootstrap-geyser").projectDir = file("bootstrap/geyser")

includeBuild("vendor/cloudburst-protocol") {
    dependencySubstitution {
        substitute(module("org.cloudburstmc.protocol:common")).using(project(":common"))
        substitute(module("org.cloudburstmc.protocol:bedrock-codec")).using(project(":bedrock-codec"))
        substitute(module("org.cloudburstmc.protocol:bedrock-connection")).using(project(":bedrock-connection"))
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    includeBuild("build-logic")
}
