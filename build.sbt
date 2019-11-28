ThisBuild / scalaVersion     := "2.12.10"
ThisBuild / version          := "0.0.1"
ThisBuild / organization     := "com.github.oen9"
ThisBuild / organizationName := "oen9"

lazy val root = (project in file("."))
  .settings(
    name := "slinky-bridge-react-konva",
    libraryDependencies += "me.shadaj" %%% "slinky-core" % "0.6.3",
    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full),
  )
  .enablePlugins(ScalaJSPlugin)


// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
