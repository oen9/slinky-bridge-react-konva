package com.github.oen9.slinky.bridge.reactkonva

import scalajs.js
import slinky.core.annotations.react
import slinky.core.ExternalComponent

@react object Stage extends ExternalComponent {
  case class Props(
    width: Int,
    height: Int,
    onClick: js.UndefOr[() => Unit] = js.undefined,
    onTap: js.UndefOr[() => Unit] = js.undefined,
  )

  override val component = ReactKonvaDOM.Stage
}
