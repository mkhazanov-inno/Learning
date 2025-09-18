public class Point {
    private int coordX, coordY;

    public Point(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public String toString() {
        return "{" + coordX + ", " + coordY + '}';
    }

    public void changeCoordinates() {

    }

}
