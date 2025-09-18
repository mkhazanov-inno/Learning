import java.util.ArrayList;
import java.util.List;

public class PolyLine {

    private List<Point> points = new ArrayList<>();

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public PolyLine(Point... pts) {
        if (pts == null) throw new IllegalArgumentException("Incorrect input");
        this.points = List.of(pts);
    }

    public PolyLine(int... pts) {
        if (pts.length % 2 != 0) throw new IllegalArgumentException("Incorrect input");
        for (int i = 0; i < pts.length; i++) {
            this.points.add(new Point(pts[i], pts[i+1]));
        }
    }

    public Line[] getLines() {
        ArrayList<Line> out = new ArrayList<>();
        for (int i = 0; i < points.size()-1; i++) {
            out.add(new Line(points.get(i), points.get(i + 1)));
        }
        return out.toArray(new Line[0]);
    }

    public double getLength() {
        Line[] tempLines = getLines();
        double out = 0;
        for (int i = 0; i < getLines().length; i++) {
            out += tempLines[i].getLength();
        }
        return out;
    }

    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("Линия [");
        for (Point point : points) {
            out.append(point.toString());
            out.append(", ");
        }
        out.replace(out.length() - 2, out.length(), "]");
        return out.toString();
    }
}
 