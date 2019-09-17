tasks.withType<Test> {
  useJUnitPlatform {
    includeEngines("junit-jupiter", "junit-vintage")
    excludeTags("slow")
  }

  failFast = true
}

object Versions {
  const val junitJupiter = "5.5.2"
  const val junitPlatform = "1.5.2"
}

object Dependencies {
  const val junitPlatformRunner = "org.junit.platform:junit-platform-runner:${Versions.junitPlatform}"
  const val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junitJupiter}"
  const val junitJupiterParams = "org.junit.jupiter:junit-jupiter-params:${Versions.junitJupiter}"
  const val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junitJupiter}"
}

val testImplementation by configurations
val testRuntimeOnly by configurations
dependencies {
  testImplementation(Dependencies.junitPlatformRunner)  {
    exclude("junit", "junit")
  }

  testImplementation(Dependencies.junitJupiterApi)
  testImplementation(Dependencies.junitJupiterParams)

  testRuntimeOnly(Dependencies.junitJupiterEngine)
}
