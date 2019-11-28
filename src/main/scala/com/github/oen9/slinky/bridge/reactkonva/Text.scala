package com.github.oen9.slinky.bridge.reactkonva

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import scalajs.js

@react object Text extends ExternalComponent {
  case class Props(
    text: String,
    x: js.UndefOr[Int] = js.undefined,
    y: js.UndefOr[Int] = js.undefined,
    fontSize: js.UndefOr[Int] = js.undefined
  )
  override val component = ReactKonvaDOM.Text
}
