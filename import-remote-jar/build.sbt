val scala3Version = "3.1.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "import-remote-jar",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    // libraryDependencies += "commons-io" % "commons-io" % "2.11.0"
    libraryDependencies += "com.squareup.okhttp3" % "okhttp" % "4.9.3"
  )
