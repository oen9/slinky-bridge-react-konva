package com.github.oen9.slinky.bridge.reactkonva

import slinky.core.ExternalComponent
import slinky.core.annotations.react

@react object Stage extends ExternalComponent {
  case class Props(width: Int, height: Int)
  override val component = ReactKonvaDOM.Stage
}
