# slinky-bridge-react-konva

[![Build Status](https://travis-ci.org/oen9/slinky-bridge-react-konva.svg?branch=master)](https://travis-ci.org/oen9/slinky-bridge-react-konva)

react-konva bridge for slinky

## chunk of example `build.sbt`

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

## tested with

```scala
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.31")
scalaVersion := "2.12.10
```

## how to use

```scala
import com.github.oen9.slinky.bridge.reactkonva._

div(className := "card-body",
  Stage(800, 600)(
    Layer(
      Text("Hello world!"),
      Text("try drag and drop --> ", x = 50, y = 260, fontSize = 18),
      Circle(290, 290, radius = 50, stroke = "blue", strokeWidth = 5, draggable = true)
    )
  )
)
```

```scala
import slinky.core.FunctionalComponent
import slinky.web.html._
import slinky.core.facade.Hooks._
import com.github.oen9.slinky.bridge.reactkonva.Rect
import com.github.oen9.slinky.bridge.konva.Konva
import slinky.core.annotations.react

@react object ColoredRect {
  type Props = Unit
  val component = FunctionalComponent[Props] { _ =>
    val (color, setColor) = useState("navy")

    def handleClick() = {
      setColor(Konva.Util.getRandomColor())
    }

    Rect(
      x = 20,
      y = 20,
      width = 50,
      height = 50,
      fill = color,
      shadowBlur = 5,
      onClick = handleClick _
    )
  }
}
```
