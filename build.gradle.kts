plugins {
    kotlin("jvm") version "1.9.0"
    id("io.qameta.allure") version "2.11.2"
    application
}

group = "com.otusqa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.20")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testImplementation ("io.qameta.allure:allure-junit5:2.24.0")
    implementation("org.slf4j:slf4j-simple:2.0.9")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}