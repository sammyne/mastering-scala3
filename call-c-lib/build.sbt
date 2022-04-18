val scala2Version = "2.12.15"

lazy val root = project
  .in(file("."))
  .settings(
    name := "import-local-jar",
    version := "0.1.0",
    scalaVersion := scala2Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
