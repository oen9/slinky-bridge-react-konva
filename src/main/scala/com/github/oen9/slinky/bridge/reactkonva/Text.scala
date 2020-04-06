package com.github.oen9.slinky.bridge.reactkonva

import slinky.core.ExternalComponentWithRefType
import slinky.core.annotations.react
import scalajs.js

@react object Text extends ExternalComponentWithRefType[Operations.Ref] {
  case class Props(
    align: js.UndefOr[String] = js.undefined,
    fill: js.UndefOr[String] = js.undefined,
    fontFamily: js.UndefOr[String] = js.undefined,
    fontSize: js.UndefOr[Int] = js.undefined,
    height: js.UndefOr[Int] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Int] = js.undefined,
    shadowBlur: js.UndefOr[Int] = js.undefined,
    shadowColor: js.UndefOr[String] = js.undefined,
    shadowOffsetX: js.UndefOr[Int] = js.undefined,
    shadowOffsetY: js.UndefOr[Int] = js.undefined,
    shadowOpacity: js.UndefOr[Double] = js.undefined,
    text: js.UndefOr[String] = js.undefined,
    verticalAlign: js.UndefOr[String] = js.undefined,
    width: js.UndefOr[Int] = js.undefined,
    x: js.UndefOr[Int] = js.undefined,
    y: js.UndefOr[Int] = js.undefined,

    _useStrictMode: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onClick: js.UndefOr[() => Unit] = js.undefined,
    onDragEnd: js.UndefOr[() => Unit] = js.undefined,
  )
  override val component = ReactKonvaDOM.Text
}
