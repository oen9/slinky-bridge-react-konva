package com.github.oen9.slinky.bridge.reactkonva

import slinky.core.ExternalComponentNoPropsWithRefType

object Layer extends ExternalComponentNoPropsWithRefType[Operations.Ref] {
  override val component = ReactKonvaDOM.Layer
}
