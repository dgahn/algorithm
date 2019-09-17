object Versions {
  const val typesafeConfig = "1.3.4"
}

object Dependencies {
  const val typesafeConfig = "com.typesafe:config:${Versions.typesafeConfig}"
}


val implementation by configurations
dependencies {
  implementation(Dependencies.typesafeConfig)
}
