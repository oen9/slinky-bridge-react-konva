package com.github.oen9.slinky.bridge.reactkonva

import scalajs.js
import com.github.oen9.slinky.bridge.konva.Konva

object Operations {
  @js.native
  trait Ref extends js.Object {
    def getClientRect(): Konva.Util.ClientRect
    def move(p: Point): Unit
    def width(): Int
    def height(): Int
  }

  @js.native
  trait SpriteRef extends Ref {
    def animation(name: String): Unit
    def frameRate(): Int
    def frameIndex(): Int
    def off(s: String): Unit
    def on(e: String, f: js.Function0[Unit]): Unit
    def start(): Unit
    def stop(): Unit
  }

  @js.native
  trait Point extends js.Object {
    def x: Int
    def y: Int
  }
  object Point {
    def apply(x: Int, y: Int) = js.Dynamic.literal(
      x = x,
      y = y
    ).asInstanceOf[Point]
  }
}
