package com.github.oen9.slinky.bridge.reactkonva

import com.github.oen9.slinky.bridge.konva.Konva
import Konva.Vector2d
import scalajs.js
import slinky.core.annotations.react
import slinky.core.ExternalComponentWithRefType

@react object Node extends ExternalComponentWithRefType[Operations.NodeRef] {
  case class Props(
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    listening: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[String] = js.undefined,
    name: js.UndefOr[String] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Vector2d] = js.undefined,
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Int] = js.undefined,
    offset: js.UndefOr[Vector2d] = js.undefined,
    offsetX: js.UndefOr[Int] = js.undefined,
    offsetY: js.UndefOr[Int] = js.undefined,

    _useStrictMode: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onClick: js.UndefOr[() => Unit] = js.undefined,
    onDragEnd: js.UndefOr[() => Unit] = js.undefined,
    onTap: js.UndefOr[() => Unit] = js.undefined,
  )
  override val component = ReactKonvaDOM.Rect
}
