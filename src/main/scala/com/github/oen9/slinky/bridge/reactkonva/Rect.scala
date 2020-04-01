package com.github.oen9.slinky.bridge.reactkonva

import slinky.core.annotations.react
import scalajs.js
import slinky.core.ExternalComponentWithRefType

@react object Rect extends ExternalComponentWithRefType[Operations.RefOperations] {
  case class Props(
    x: Int,
    y: Int,
    width: Int,
    height: Int,
    fill: String = "red",
    shadowBlur: js.UndefOr[Int] = js.undefined,
    onClick: js.UndefOr[() => Unit] = js.undefined,
    _useStrictMode: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onDragEnd: js.UndefOr[() => Unit] = js.undefined
  )
  override val component = ReactKonvaDOM.Rect
}
