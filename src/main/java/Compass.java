public class Compass {
    public enum Point{
        NORTH,
        EAST,
        SOUTH,
        WEST
    }

    public enum Direction{
        LEFT,
        RIGHT
    }

    private Point point;

    public static Point rotate(Point point, Direction direction) {
        if (direction == Direction.RIGHT) {
            switch (point) {
                case NORTH -> {
                    return Point.EAST;
                }
                case EAST -> {
                    return Point.SOUTH;
                }
                case SOUTH -> {
                    return Point.WEST;
                }
                case WEST -> {
                    return Point.NORTH;
                }
                default -> {
                    return null;
                }
            }
        }
        else{
            switch (point) {
                case NORTH -> {
                    return Point.WEST;
                }
                case EAST -> {
                    return Point.NORTH;
                }
                case SOUTH -> {
                    return Point.EAST;
                }
                case WEST -> {
                    return Point.SOUTH;
                }
                default -> {
                    return null;
                }
            }
        }
    }
}
