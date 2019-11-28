package com.github.oen9.slinky.bridge.konva

import scalajs.js.annotation.JSImport
import scalajs.js

@JSImport("konva", JSImport.Default)
@js.native
object Konva extends js.Object {
  @js.native
  object Util extends js.Object {
    def getRandomColor(): String = js.native
  }
}
