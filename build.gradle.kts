plugins {
    val kotlinPluginVersion = "2.0.21"
    kotlin("jvm") version kotlinPluginVersion
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

kotlin {
    jvmToolchain {
        this.languageVersion.set(JavaLanguageVersion.of("21"))
        vendor.set(JvmVendorSpec.ADOPTIUM)
    }
}
