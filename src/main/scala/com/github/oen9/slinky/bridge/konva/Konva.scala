package com.github.oen9.slinky.bridge.konva

import scalajs.js.annotation.JSImport
import scalajs.js

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
      def x: Int
      def y: Int
      def width: Int
      def height: Int
    }
    def getRandomColor(): String = js.native
    def getRGB(color: String): RGB = js.native
    def haveIntersection(r1: ClientRect, r2: ClientRect): Boolean = js.native
  }
}
