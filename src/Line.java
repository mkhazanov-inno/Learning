public class Line {
    Point point1, point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line(int coordX1, int coordY1, int coordX2, int coordY2) {
        this.point1 = new Point(coordX1, coordY1);
        this.point2 = new Point(coordX2, coordY2);

    }

    public double getLength() {
        return Math.sqrt(Math.pow(Math.abs(point1.coordX - point2.coordX), 2) + Math.pow(Math.abs(point1.coordY - point2.coordY), 2));
    }

    public String toString() {
        return "Линия от " + point1 + " до " + point2;
    }
}
