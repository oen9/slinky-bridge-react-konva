package com.github.oen9.slinky.bridge.reactkonva

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import scalajs.js

@react object Ellipse extends ExternalComponent {
  case class Props(
    x: Int,
    y: Int,
    radiusX: Int,
    radiusY: Int,
    fill: String = "red",
    stroke: js.UndefOr[String] = js.undefined,
    strokeWidth: js.UndefOr[Int] = js.undefined,
    onClick: js.UndefOr[() => Unit] = js.undefined,
    _useStrictMode: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onDragEnd: js.UndefOr[() => Unit] = js.undefined
  )
  override val component = ReactKonvaDOM.Ellipse
}
