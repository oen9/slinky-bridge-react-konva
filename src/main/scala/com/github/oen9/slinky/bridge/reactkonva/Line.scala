package com.github.oen9.slinky.bridge.reactkonva

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import scalajs.js

@react object Line extends ExternalComponent {
  case class Props(
    points: IndexedSeq[Int],
    tension: Double = 1,
    strokeWidth: Int = 2,
    stroke: String = "orange",
    x: js.UndefOr[Int] = js.undefined,
    y: js.UndefOr[Int] = js.undefined,
    onClick: js.UndefOr[() => Unit] = js.undefined,
    _useStrictMode: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onDragEnd: js.UndefOr[() => Unit] = js.undefined
  )
  override val component = ReactKonvaDOM.Line
}
