ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.1-SNAPSHOT"
ThisBuild / organization     := "com.github.oen9"
ThisBuild / organizationName := "oen9"
ThisBuild / organizationHomepage := Some(url("https://github.com/oen9"))

ThisBuild / description := "react-konva bridge for slinky"
ThisBuild / licenses := List("MIT" -> url("http://opensource.org/licenses/mit"))
ThisBuild / homepage := Some(url("https://github.com/oen9/slinky-bridge-react-konva"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/oen9/slinky-bridge-react-konva"),
    "scm:git@github.com:oen9/slinky-bridge-react-konva.git"
  )
)

ThisBuild / developers := List(
  Developer(
    id = "oen",
    name = "oen",
    email = "oen.ult@gmail.com",
    url = url("https://github.com/oen9")
  )
)

ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true

lazy val root = (project in file("."))
  .settings(
    name := "slinky-bridge-react-konva",
    libraryDependencies += "me.shadaj" %%% "slinky-core" % "0.6.4",
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0",
    credentials += Credentials(Path.userHome / ".sbt" / "sonatype_credential"),
    scalacOptions ++= Seq(
      "-Xlint",
      "-unchecked",
      "-deprecation",
      "-feature",
      "-language:higherKinds",
      "-Ymacro-annotations"
    )
  )
  .enablePlugins(ScalaJSPlugin)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
