package com.github.oen9.slinky.bridge.reactkonva

import com.github.oen9.slinky.bridge.konva.Konva
import com.github.oen9.slinky.bridge.reactkonva.ReactKonvaDOM.Context
import Konva.Vector2d
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js.|
import scalajs.js
import slinky.core.annotations.react
import slinky.core.ExternalComponentWithRefType

@react object Label extends ExternalComponentWithRefType[Operations.ShapeRef] {
  case class Props(
    // Shape
    fill: js.UndefOr[String] = js.undefined,
    fillPatternImage: js.UndefOr[HTMLImageElement] = js.undefined,
    fillPatternX: js.UndefOr[Double] = js.undefined,
    fillPatternY: js.UndefOr[Double] = js.undefined,
    fillPatternOffset: js.UndefOr[Vector2d] = js.undefined,
    fillPatternOffsetX: js.UndefOr[Double] = js.undefined,
    fillPatternOffsetY: js.UndefOr[Double] = js.undefined,
    fillPatternScale: js.UndefOr[Vector2d] = js.undefined,
    fillPatternScaleX: js.UndefOr[Double] = js.undefined,
    fillPatternScaleY: js.UndefOr[Double] = js.undefined,
    fillPatternRotation: js.UndefOr[Double] = js.undefined,
    fillPatternRepeat: js.UndefOr[String] = js.undefined,
    fillLinearGradientStartPoint: js.UndefOr[Vector2d] = js.undefined,
    fillLinearGradientStartPointX: js.UndefOr[Double] = js.undefined,
    fillLinearGradientStartPointY: js.UndefOr[Double] = js.undefined,
    fillLinearGradientEndPoint: js.UndefOr[Vector2d] = js.undefined,
    fillLinearGradientEndPointX: js.UndefOr[Double] = js.undefined,
    fillLinearGradientEndPointY: js.UndefOr[Double] = js.undefined,
    fillLinearGradientColorStops: js.UndefOr[Seq[js.Any]] = js.undefined, // TODO : Array<number | string>;
    fillRadialGradientStartPoint: js.UndefOr[Vector2d] = js.undefined,
    fillRadialGradientStartPointX: js.UndefOr[Double] = js.undefined,
    fillRadialGradientStartPointY: js.UndefOr[Double] = js.undefined,
    fillRadialGradientEndPoint: js.UndefOr[Vector2d] = js.undefined,
    fillRadialGradientEndPointX: js.UndefOr[Double] = js.undefined,
    fillRadialGradientEndPointY: js.UndefOr[Double] = js.undefined,
    fillRadialGradientStartRadius: js.UndefOr[Double] = js.undefined,
    fillRadialGradientEndRadius: js.UndefOr[Double] = js.undefined,
    fillRadialGradientColorStops: js.UndefOr[Seq[js.Any]] = js.undefined, // TODO : Array<number | string>;
    fillEnabled: js.UndefOr[Boolean] = js.undefined,
    fillPriority: js.UndefOr[String] = js.undefined,
    stroke: js.UndefOr[String] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    hitStrokeWidth: js.UndefOr[Double | String] = js.undefined,
    strokeScaleEnabled: js.UndefOr[Boolean] = js.undefined,
    strokeHitEnabled: js.UndefOr[Boolean] = js.undefined,
    strokeEnabled: js.UndefOr[Boolean] = js.undefined,
    lineJoin: js.UndefOr[String] = js.undefined,
    lineCap: js.UndefOr[String] = js.undefined,
    sceneFunc: js.UndefOr[(Context, Operations.ShapeRef) => Unit] = js.undefined,
    hitFunc: js.UndefOr[(Context, Operations.ShapeRef) => Unit] = js.undefined,
    shadowColor: js.UndefOr[String] = js.undefined,
    shadowBlur: js.UndefOr[Double] = js.undefined,
    shadowOffset: js.UndefOr[Vector2d] = js.undefined,
    shadowOffsetX: js.UndefOr[Double] = js.undefined,
    shadowOffsetY: js.UndefOr[Double] = js.undefined,
    shadowOpacity: js.UndefOr[Double] = js.undefined,
    shadowEnabled: js.UndefOr[Boolean] = js.undefined,
    shadowForStrokeEnabled: js.UndefOr[Boolean] = js.undefined,
    dash: js.UndefOr[Seq[Double]] = js.undefined,
    dashOffset: js.UndefOr[Double] = js.undefined,
    dashEnabled: js.UndefOr[Boolean] = js.undefined,
    perfectDrawEnabled: js.UndefOr[Boolean] = js.undefined,

    // Node
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    listening: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[String] = js.undefined,
    name: js.UndefOr[String] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Vector2d] = js.undefined,
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Int] = js.undefined,
    offset: js.UndefOr[Vector2d] = js.undefined,
    offsetX: js.UndefOr[Int] = js.undefined,
    offsetY: js.UndefOr[Int] = js.undefined,

    _useStrictMode: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    onClick: js.UndefOr[() => Unit] = js.undefined,
    onDragEnd: js.UndefOr[() => Unit] = js.undefined,
    onTap: js.UndefOr[() => Unit] = js.undefined,
  )
  override val component = ReactKonvaDOM.Label
}
