public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int xIn, int yIn) {
        this.x = xIn;
        this.y = yIn;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return ("(" + x + "," + y + ")");
    }
}
