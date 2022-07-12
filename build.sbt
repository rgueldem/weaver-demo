val scala3Version = "3.1.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Project Template",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "com.disneystreaming" %% "weaver-monix" % "0.6.13" % Test,
    libraryDependencies += "com.dimafeng" %% "testcontainers-scala-mysql" % "0.40.8" % Test,
    libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.29" % Test,

    testFrameworks += new TestFramework("weaver.framework.Monix")
  )
