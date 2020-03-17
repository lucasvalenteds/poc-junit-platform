# JUnit Platform Sample

It demonstrates how to run tests written for both JUnit 4 and JUnit 5 in the same project.

## How to run

![java::jdk]

| Description | Command |
| :--- | :--- |
| Run tests | `./gradlew test` |

## Notes

* The function `useJUnitPlatform()` configure JUnit to run all engines found instead of the first one only.
* The function `testLogging` is optional. It's there just to make sure both tests run as expected.
* The function `configure<JavaPluginConvention>` is optional. It's there because JUnit 5 requires at least JDK 1.8.

[java::jdk]: https://img.shields.io/badge/jdk-11-5481A0.svg?style=for-the-badge "JDK 11"
