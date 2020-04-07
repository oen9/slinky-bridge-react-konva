package com.github.oen9.slinky.bridge.konva

import Konva.IRect
import Konva.Vector2d
import scalajs.js

object KonvaHelper {
  object IRect {
    def apply(): IRect = apply(0, 0, 0, 0)
    def apply(x: Double, y: Double, width: Double, height: Double): IRect = js.Dynamic.literal(
      x = x,
      y = y,
      width = width,
      height = height,
    ).asInstanceOf[IRect]
  }

  object Vector2d {
    def apply(x: Int, y: Int) = js.Dynamic.literal(
      x = x,
      y = y
    ).asInstanceOf[Vector2d]
  }
}
