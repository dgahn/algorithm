object Versions {
  const val commonsCodec = "1.13"
  const val commonsDbcp2 = "2.7.0"
  const val commonsLang3 = "3.9"
  const val commonsPool2 = "2.7"
}

object Dependencies {
  const val commonsCodec = "commons-codec:commons-codec:${Versions.commonsCodec}"
  const val commonsDbcp2 = "org.apache.commons:commons-dbcp2:${Versions.commonsDbcp2}"
  const val commonsLang3 = "org.apache.commons:commons-lang3:${Versions.commonsLang3}"
  const val commonsPool2 = "org.apache.commons:commons-pool2:${Versions.commonsPool2}"
}


val implementation by configurations
dependencies {
  implementation(Dependencies.commonsCodec)
  implementation(Dependencies.commonsDbcp2)
  implementation(Dependencies.commonsLang3)
  implementation(Dependencies.commonsPool2)
}

