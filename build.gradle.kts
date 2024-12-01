plugins {
    kotlin("jvm") version "2.0.10"
    id("com.saveourtool.diktat") version "2.0.0"
}

group = "eu.moonvale"
version = "1.0.1-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://jitpack.io")
    maven("https://repo.flyte.gg/releases")
}

dependencies {
    val paperVersion = findProperty("paper") as String
    compileOnly("io.papermc.paper:paper-api:$paperVersion")

    val twilightVersion = findProperty("twilight") as String
    implementation("gg.flyte:twilight:$twilightVersion")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

diktat {
    inputs { include("src/**/*.kt") }
    debug = true  // turn on debug logging
}