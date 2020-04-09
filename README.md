# slinky-bridge-react-konva

[![Build Status](https://travis-ci.org/oen9/slinky-bridge-react-konva.svg?branch=master)](https://travis-ci.org/oen9/slinky-bridge-react-konva)
[![CircleCI](https://circleci.com/gh/oen9/slinky-bridge-react-konva.svg?style=svg)](https://circleci.com/gh/oen9/slinky-bridge-react-konva)

react-konva bridge for slinky

This bridge is developed for my own purpose.
There is a lot of missing but I'm doing my best.
If you need something special contact me.

## Showcase / demo

See the showcase here: [react-konva-showcase](https://github.com/oen9/react-konva-showcase) (live app on heroku)

## chunk of example `build.sbt`

```scala
lazy val jsSettings = Seq(
  libraryDependencies ++= Seq(
    "me.shadaj" %%% "slinky-web" % "0.6.4",
    "com.github.oen9" %%% "slinky-bridge-react-konva" % "0.1.1"
  ),
  npmDependencies in Compile ++= Seq(
    "react" -> "16.13.0",
    "react-dom" -> "16.13.0",
    "konva" -> "4.2.2",
    "react-konva" -> "16.12.0-0"
  ),
  scalaJSUseMainModuleInitializer := true,
  version.in(webpack) := "4.42.1",
  webpackBundlingMode := BundlingMode.Application,
  webpackBundlingMode.in(fastOptJS) := BundlingMode.LibraryOnly(),
)
```

## tested with

```scala
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.0.1")
scalaVersion := "2.13.1
```

## how to use

```scala
import com.github.oen9.slinky.bridge.reactkonva._

div(className := "card-body",
  Stage(width = 800, height = 600)(
    Layer(
      Text(text = "Hello world!"),
      Text(text = "try drag and drop --> ", x = 50, y = 260, fontSize = 18),
      Circle(x = 290, y = 290, radius = 50, stroke = "blue", strokeWidth = 5, draggable = true)
    )
  )
)
```

```scala
import com.github.oen9.slinky.bridge.konva.Konva
import com.github.oen9.slinky.bridge.konva.Konva.KonvaEventObject
import com.github.oen9.slinky.bridge.reactkonva.Rect
import org.scalajs.dom.raw.MouseEvent
import slinky.core.annotations.react
import slinky.core.facade.Hooks._
import slinky.core.FunctionalComponent
import slinky.web.html._

@react object ColoredRect {
  type Props = Unit
  val component = FunctionalComponent[Props] { _ =>
    val (color, setColor) = useState("navy")

    def handleClick(e: KonvaEventObject[MouseEvent]): Unit = {
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
