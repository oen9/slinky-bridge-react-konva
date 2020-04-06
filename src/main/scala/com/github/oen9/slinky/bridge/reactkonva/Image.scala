package com.github.oen9.slinky.bridge.reactkonva

import org.scalajs.dom.raw.HTMLImageElement
import scalajs.js
import slinky.core.annotations.react
import slinky.core.ExternalComponentWithRefType

@react object Image extends ExternalComponentWithRefType[Operations.Ref] {
  case class Props(
    height: js.UndefOr[Int] = js.undefined,
    image: js.UndefOr[HTMLImageElement] = js.undefined,
    offsetX: js.UndefOr[Int] = js.undefined,
    offsetY: js.UndefOr[Int] = js.undefined,
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Int] = js.undefined,
    x: js.UndefOr[Int] = js.undefined,
    y: js.UndefOr[Int] = js.undefined,

    _useStrictMode: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onClick: js.UndefOr[() => Unit] = js.undefined,
    onTap: js.UndefOr[() => Unit] = js.undefined,
    onDragEnd: js.UndefOr[() => Unit] = js.undefined
  )
  override val component = ReactKonvaDOM.Image
}
