plugins {
    kotlin("jvm") version "1.6.10"
    kotlin("plugin.serialization") version "1.6.10"
    `maven-publish`
    application
}

group = "ru.kpfu"
version = "0.1"

repositories { mavenCentral() }

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
}

tasks.test { useJUnitPlatform() }

application { mainClass.set("MainKt") }

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "ru.kpfu"
            artifactId = "test-it-export-module"
            version = "0.1"
            from(components["java"])
        }
    }
}