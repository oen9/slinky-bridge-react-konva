package com.github.oen9.slinky.bridge.reactkonva

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import scalajs.js

@react object Wedge extends ExternalComponent {
  case class Props(
    x: Int,
    y: Int,
    radius: Int,
    angle: Int,
    fill: String = "red",
    rotation: js.UndefOr[Int] = js.undefined,
    stroke: js.UndefOr[String] = js.undefined,
    strokeWidth: js.UndefOr[Int] = js.undefined,
    onClick: js.UndefOr[() => Unit] = js.undefined,
    _useStrictMode: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onDragEnd: js.UndefOr[() => Unit] = js.undefined
  )
  override val component = ReactKonvaDOM.Wedge
}
