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

    public int getxCoor() {
        return x;
    }

    public int getyCoor() {
        return y;
    }

    public void setxCoor(int x){
        this.x = x;

    }

    public void setyCoor(int y){
        this.y = y;
    }

    public void setCoor(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void goHome(){
        this.x = 0;
        this.y = 0;
    }

    public void move(int x, int y){
        this.x += x;
        this.y += y;

    }

    public double distance(Point other){
        return Math.sqrt(Math.pow(this.x-other.x,2) + Math.pow(this.y-other.y,2));
    }

    public boolean equals(Point other){
        return (this.x == other.x && this.y == other.y); 
    }


    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
