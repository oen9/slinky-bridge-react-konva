package com.github.oen9.slinky.bridge.reactkonva

import com.github.oen9.slinky.bridge.konva.Konva
import Konva.Vector2d
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.WheelEvent
import scalajs.js
import slinky.core.ExternalComponentNoPropsWithRefType

object Layer extends ExternalComponentNoPropsWithRefType[Operations.ShapeRef] {
  case class Props(
    // Layer
    // clearBeforeDraw: js.UndefOr[Boolean] = js.undefined, // this is redundant in Konva
    hitGraphEnabled: js.UndefOr[Boolean] = js.undefined,
    imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined,

    // Container
    clearBeforeDraw: js.UndefOr[Boolean] = js.undefined,
    clipFunc: js.UndefOr[js.Dynamic => Unit] = js.undefined,
    clipX: js.UndefOr[Double] = js.undefined,
    clipY: js.UndefOr[Double] = js.undefined,
    clipWidth: js.UndefOr[Double] = js.undefined,
    clipHeight: js.UndefOr[Double] = js.undefined,

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
  override val component = ReactKonvaDOM.Layer
}
