package com.github.oen9.slinky.bridge.reactkonva

import scalajs.js
import slinky.core.annotations.react
import slinky.core.ExternalComponentWithRefType
import com.github.oen9.slinky.bridge.reactkonva.ReactKonvaDOM.Context
import com.github.oen9.slinky.bridge.reactkonva.ReactKonvaDOM.ContextShape

@react object Shape extends ExternalComponentWithRefType[Operations.Ref] {
  case class Props(
    fill: js.UndefOr[String] = js.undefined,
    height: js.UndefOr[Int] = js.undefined,
    shadowBlur: js.UndefOr[Int] = js.undefined,
    shadowColor: js.UndefOr[String] = js.undefined,
    shadowOffsetX: js.UndefOr[Int] = js.undefined,
    shadowOffsetY: js.UndefOr[Int] = js.undefined,
    shadowOpacity: js.UndefOr[Double] = js.undefined,
    stroke: js.UndefOr[String] = js.undefined,
    strokeWidth: js.UndefOr[Int] = js.undefined,
    width: js.UndefOr[Int] = js.undefined,
    x: js.UndefOr[Int] = js.undefined,
    y: js.UndefOr[Int] = js.undefined,

    sceneFunc: js.UndefOr[(Context, ContextShape) => Unit] = js.undefined,

    _useStrictMode: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onClick: js.UndefOr[() => Unit] = js.undefined,
    onDragEnd: js.UndefOr[() => Unit] = js.undefined
  )
  override val component = ReactKonvaDOM.Shape
}
