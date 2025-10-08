public abstract class Shape {
    protected Point centerPoint;

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public abstract String toString();
}
