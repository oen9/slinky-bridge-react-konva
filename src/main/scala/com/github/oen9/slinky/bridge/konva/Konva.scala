package com.github.oen9.slinky.bridge.konva

import com.github.oen9.slinky.bridge.reactkonva.Operations
import scalajs.js
import scalajs.js.annotation.JSImport

@JSImport("konva", JSImport.Default)
@js.native
object Konva extends js.Object {
  @js.native
  object Util extends js.Object {
    @js.native
    trait RGB extends js.Object {
      def r: Int
      def g: Int
      def b: Int
    }
    @js.native
    trait ClientRect extends js.Object {
      def x: Double
      def y: Double
      def width: Double
      def height: Double
    }
    def getRandomColor(): String = js.native
    def getRGB(color: String): RGB = js.native
    def haveIntersection(r1: ClientRect, r2: ClientRect): Boolean = js.native
  }

  @js.native
  class Animation(func: js.Function1[Frame, Unit], layers: Seq[Operations.Ref]) extends js.Object {
    def start(): Unit = js.native
    def stop(): Unit = js.native
    def isRunning(): Boolean = js.native
  }

  @js.native
  trait Frame extends js.Object {
    def timeDiff: Double
    def lastTime: Double
    def time: Double
    def frameRate : Double
  }
}
