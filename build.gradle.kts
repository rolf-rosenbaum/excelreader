plugins {
    kotlin("jvm") version "1.9.23"
}

group = "de.rolf-rosenbaum"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.poi:poi:5.2.5")
    implementation("org.apache.poi:poi-ooxml:5.2.5")
    implementation("org.apache.logging.log4j:log4j-core:3.0.0-beta2")    
    testImplementation(kotlin("test"))
    
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}