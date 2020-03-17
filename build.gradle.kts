import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    java
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("org.junit.jupiter", "junit-jupiter-api", properties["version.junit.jupiter"].toString())
    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", properties["version.junit.jupiter"].toString())

    testImplementation("junit", "junit", properties["version.junit.vintage"].toString())
    testRuntimeOnly("org.junit.vintage", "junit-vintage-engine", properties["version.junit.jupiter"].toString())
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        events = setOf(
            TestLogEvent.PASSED,
            TestLogEvent.FAILED,
            TestLogEvent.SKIPPED
        )
    }
}