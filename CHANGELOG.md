# Changelog

## [Unreleased]

### Added

## [0.1.1] - 2020-04-9

### Added

- KonvaEventObject
- all missing events
- all missing params to Tag

### Changed

- onClick from () => Unit to KonvaEventObject[MouseEvent] => Unit
- onDragEng from () => Unit to KonvaEventObject[DragEvent] => Unit
- onTap from () => Unit to KonvaEventObject[Event] => Unit
- cornerRadius in Rect from Int to Double

## [0.1.0] - 2020-04-7

### Added

- KonvaHelper (for Vector2d, ClientRect)
- Node
- Container
- IRect
- RGBA
- all missing params to Arc
- all missing params to Arrow
- all missing params to Circle
- all missing params to Ellipse
- all missing params to Group
- all missing params to Image
- all missing params to Label
- all missing params to Layer
- all missing params to Line
- all missing params to Path
- all missing params to Rect
- all missing params to RegularPolygon
- all missing params to Ring
- all missing params to Shape
- all missing params to Sprite
- all missing params to Stage
- all missing params to Star
- all missing params to Text
- all missing params to TextPath
- all missing params to Wedge

### Changed

- Point -> Vector2d
- Ref -> NodeRef
- Frame -> IFrame
- ClientRect -> IRect
- Konva.Util.RGB -> Konva.RGB


## [0.0.5] - 2020-04-6

### Added

- Konva.Animation
- Group
- `rotation` to Operations.Ref
- few other fields to existing shapes

## [0.0.4] - 2020-04-3

### Added

- Arc
- Arrow
- Image
- Label
- Path
- RegularPolygon
- Ring
- Shape
- Sprite
- Star
- Tag
- TextPath
- use-image (useImage hook)  integration
- few fields to existing shapes

## [0.0.3] - 2020-04-1

### Added

- scalajs-1 support

## [0.0.2] - 2020-01-27

### Added

- Konva.Util

## [0.0.1] - 2019-11-28

### Added

- Circle
- Ellipse
- Layer
- Line
- Rect
- Stage
- Text
- Wedge
