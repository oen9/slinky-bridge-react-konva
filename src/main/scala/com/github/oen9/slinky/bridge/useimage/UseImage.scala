package com.github.oen9.slinky.bridge.useimage

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import org.scalajs.dom.raw.HTMLImageElement

object UseImage {
  def useImage(url: String, crossOrigin: js.UndefOr[String] = js.undefined): (HTMLImageElement, String) = {
    val res = useImageRaw(url, crossOrigin)
    (res._1, res._2)
  }

  @js.native
  @JSImport("use-image", JSImport.Default)
  private object useImageRaw extends js.Function2[String, js.UndefOr[String], js.Tuple2[HTMLImageElement , String]] {
    def apply(url: String, crossOrigin: js.UndefOr[String] = js.undefined): js.Tuple2[HTMLImageElement, String] = js.native
  }
}
