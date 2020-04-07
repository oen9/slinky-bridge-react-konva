package com.github.oen9.slinky.bridge.reactkonva

import scalajs.js
import com.github.oen9.slinky.bridge.konva.Konva

object Operations {
  @js.native
  trait NodeRef extends js.Object {
    def getClientRect(): Konva.IRect
    def move(p: Konva.Vector2d): Unit
    def width(): Int
    def height(): Int
    def rotation(): Int
    def rotation(angle: Int): Unit
    def getAttr(attr: String): js.Any
  }

  @js.native
  trait ShapeRef extends NodeRef {
  }

  @js.native
  trait SpriteRef extends NodeRef {
    def animation(name: String): Unit
    def frameRate(): Int
    def frameIndex(): Int
    def off(s: String): Unit
    def on(e: String, f: js.Function0[Unit]): Unit
    def start(): Unit
    def stop(): Unit
  }
}
