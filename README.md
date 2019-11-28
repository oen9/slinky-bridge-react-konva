# slinky-bridge-react-konva

react-konva bridge for slinky

chunk of example `build.sbt`

```scala
lazy val jsSettings = Seq(
  libraryDependencies ++= Seq(
    "me.shadaj" %%% "slinky-web" % "0.6.3",
    "com.github.oen9" %%% "slinky-bridge-react-konva" % "0.0.1"
  ),
  npmDependencies in Compile ++= Seq(
    "react" -> "16.12.0",
    "react-dom" -> "16.12.0",
    "konva" -> "4.0.18",
    "react-konva" -> "16.10.1-0"
  ),
  scalaJSUseMainModuleInitializer := true,
  addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full),
  version.in(webpack) := "4.41.2",
  webpackBundlingMode := BundlingMode.LibraryAndApplication(),
  webpackBundlingMode.in(fastOptJS) := BundlingMode.LibraryOnly(),
  scalacOptions += "-P:scalajs:sjsDefinedByDefault"
)
```

Tested with:

```scala
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.31")
scalaVersion := "2.12.10
```
