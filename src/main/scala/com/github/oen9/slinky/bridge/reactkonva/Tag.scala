package com.github.oen9.slinky.bridge.reactkonva

import slinky.core.ExternalComponentWithRefType
import slinky.core.annotations.react
import scalajs.js

@react object Tag extends ExternalComponentWithRefType[Operations.Ref] {
  case class Props(
    fill: js.UndefOr[String] = js.undefined,
    lineJoin: js.UndefOr[String] = js.undefined,
    pointerDirection: js.UndefOr[String] = js.undefined,
    pointerHeight: js.UndefOr[Int] = js.undefined,
    pointerWidth: js.UndefOr[Int] = js.undefined,
    shadowBlur: js.UndefOr[Int] = js.undefined,
    shadowColor: js.UndefOr[String] = js.undefined,
    shadowOffsetX: js.UndefOr[Int] = js.undefined,
    shadowOffsetY: js.UndefOr[Int] = js.undefined,
    shadowOpacity: js.UndefOr[Double] = js.undefined,
  )
  override val component = ReactKonvaDOM.Tag
}
