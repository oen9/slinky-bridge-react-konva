package com.github.oen9.slinky.bridge.reactkonva

import com.github.oen9.slinky.bridge.konva.Konva
import com.github.oen9.slinky.bridge.reactkonva.ReactKonvaDOM.Context
import Konva.Vector2d
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.WheelEvent
import scala.scalajs.js.|
import scalajs.js
import slinky.core.annotations.react
import slinky.core.ExternalComponentWithRefType

@react object Wedge extends ExternalComponentWithRefType[Operations.ShapeRef] {
  case class Props(
    // Wedge
    angle: Int,
    radius: Double,
    clockwise: js.UndefOr[Boolean] = js.undefined,

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

    onMouseOver: js.UndefOr[Konva.KonvaEventObject[MouseEvent] => Unit] = js.undefined,
    onMouseMove: js.UndefOr[Konva.KonvaEventObject[MouseEvent] => Unit] = js.undefined,
    onMouseOut: js.UndefOr[Konva.KonvaEventObject[MouseEvent] => Unit] = js.undefined,
    onMouseEnter: js.UndefOr[Konva.KonvaEventObject[MouseEvent] => Unit] = js.undefined,
    onMouseLeave: js.UndefOr[Konva.KonvaEventObject[MouseEvent] => Unit] = js.undefined,
    onMouseDown: js.UndefOr[Konva.KonvaEventObject[MouseEvent] => Unit] = js.undefined,
    onMouseUp: js.UndefOr[Konva.KonvaEventObject[MouseEvent] => Unit] = js.undefined,
    onWheel: js.UndefOr[Konva.KonvaEventObject[WheelEvent] => Unit] = js.undefined,
    onClick: js.UndefOr[Konva.KonvaEventObject[MouseEvent] => Unit] = js.undefined,
    onDblClick: js.UndefOr[Konva.KonvaEventObject[MouseEvent] => Unit] = js.undefined,
    onTouchStart: js.UndefOr[Konva.KonvaEventObject[TouchEvent] => Unit] = js.undefined,
    onTouchMove: js.UndefOr[Konva.KonvaEventObject[TouchEvent] => Unit] = js.undefined,
    onTouchEnd: js.UndefOr[Konva.KonvaEventObject[TouchEvent] => Unit] = js.undefined,
    onTap: js.UndefOr[Konva.KonvaEventObject[Event] => Unit] = js.undefined,
    onDblTap: js.UndefOr[Konva.KonvaEventObject[Event] => Unit] = js.undefined,
    onDragStart: js.UndefOr[Konva.KonvaEventObject[DragEvent] => Unit] = js.undefined,
    onDragMove: js.UndefOr[Konva.KonvaEventObject[DragEvent] => Unit] = js.undefined,
    onDragEnd: js.UndefOr[Konva.KonvaEventObject[DragEvent] => Unit] = js.undefined,
    onTransform: js.UndefOr[Konva.KonvaEventObject[Event] => Unit] = js.undefined,
    onTransformStart: js.UndefOr[Konva.KonvaEventObject[Event] => Unit] = js.undefined,
    onTransformEnd: js.UndefOr[Konva.KonvaEventObject[Event] => Unit] = js.undefined,
    onContextMenu: js.UndefOr[Konva.KonvaEventObject[PointerEvent] => Unit] = js.undefined,
  )
  override val component = ReactKonvaDOM.Wedge
}
