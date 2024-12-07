import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    kotlin("jvm") version "2.0.10"
    id("com.saveourtool.diktat") version "2.0.0"
    id("org.jetbrains.dokka") version "1.9.20"
}

group = "eu.moonvale"
version = "1.0.1-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://jitpack.io")
    maven("https://repo.flyte.gg/releases")
    maven("https://repo.codemc.io/repository/maven-public/")
}

dependencies {
    val paperVersion = findProperty("paper") as String
    compileOnly("io.papermc.paper:paper-api:$paperVersion")

    val twilightVersion = findProperty("twilight") as String
    compileOnly("gg.flyte:twilight:$twilightVersion")

    val acfVersion = findProperty("acf") as String
    compileOnly("co.aikar:acf-paper:$acfVersion")

    val saduVersion = findProperty("sadu") as String
    compileOnly("de.chojo.sadu:sadu-mariadb:$saduVersion")
    compileOnly("de.chojo.sadu:sadu-queries:$saduVersion")
    compileOnly("de.chojo.sadu:sadu-datasource:$saduVersion")
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

tasks.withType<DokkaTask>().configureEach {
    outputDirectory.set(buildDir.resolve("dokka"))
}