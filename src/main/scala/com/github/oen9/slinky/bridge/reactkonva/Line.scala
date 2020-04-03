package com.github.oen9.slinky.bridge.reactkonva

import slinky.core.ExternalComponentWithRefType
import slinky.core.annotations.react
import scalajs.js

@react object Line extends ExternalComponentWithRefType[Operations.Ref] {
  case class Props(
    closed: js.UndefOr[Boolean] = js.undefined,
    dash: js.UndefOr[List[Double]] = js.undefined,
    fill: js.UndefOr[String] = js.undefined,
    lineCap: js.UndefOr[String] = js.undefined,
    lineJoin: js.UndefOr[String] = js.undefined,
    points: js.UndefOr[Seq[Int]] = js.undefined,
    stroke: js.UndefOr[String] = js.undefined,
    strokeWidth: js.UndefOr[Int] = js.undefined,
    tension: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Int] = js.undefined,
    y: js.UndefOr[Int] = js.undefined,

    _useStrictMode: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onClick: js.UndefOr[() => Unit] = js.undefined,
    onDragEnd: js.UndefOr[() => Unit] = js.undefined
  )
  override val component = ReactKonvaDOM.Line
}
