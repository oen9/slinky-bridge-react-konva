package com.github.oen9.slinky.bridge.reactkonva

import scalajs.js
import com.github.oen9.slinky.bridge.konva.Konva

object Operations {
  @js.native
  trait RefOperations extends js.Object {
    def getClientRect(): Konva.Util.ClientRect
  }
}
