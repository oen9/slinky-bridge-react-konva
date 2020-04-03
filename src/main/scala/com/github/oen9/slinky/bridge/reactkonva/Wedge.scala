package com.github.oen9.slinky.bridge.reactkonva

import slinky.core.ExternalComponentWithRefType
import slinky.core.annotations.react
import scalajs.js

@react object Wedge extends ExternalComponentWithRefType[Operations.Ref] {
  case class Props(
    angle: js.UndefOr[Int] = js.undefined,
    fill: js.UndefOr[String] = js.undefined,
    radius: js.UndefOr[Int] = js.undefined,
    rotation: js.UndefOr[Int] = js.undefined,
    stroke: js.UndefOr[String] = js.undefined,
    strokeWidth: js.UndefOr[Int] = js.undefined,
    x: js.UndefOr[Int] = js.undefined,
    y: js.UndefOr[Int] = js.undefined,

    _useStrictMode: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onClick: js.UndefOr[() => Unit] = js.undefined,
    onDragEnd: js.UndefOr[() => Unit] = js.undefined
  )
  override val component = ReactKonvaDOM.Wedge
}
