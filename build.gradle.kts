plugins {
  `java-library`
  idea
  application
}

application {
  mainClassName = "xx.xx.xx.ApplicationInitializer"
  description = "This is a Algorithm Application."
  version = "2019.38.0"
}

repositories {
  mavenLocal()
  mavenCentral()
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<JavaCompile> {
  options.apply {
    encoding = "UTF-8"
    compilerArgs = listOf("-Xlint:all", "-Xlint:-processing")
  }
}

tasks.withType<Wrapper> {
  gradleVersion = "5.6.2"
  distributionType = Wrapper.DistributionType.BIN
}

apply {
  from("gradle/module/main/all-deps.gradle.kts")
  from("gradle/module/test/all-deps.gradle.kts")
}
