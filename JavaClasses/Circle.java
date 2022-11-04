public class Circle {
    private Point center = new Point();
    private double radius;

    public Circle(){
        center.setCoor(0,0);
        radius = 1;
    }
    public Circle(int x, int y, double r){
        center.setCoor(x,y);
        radius = r;
    }

    public int getX(){
        return center.getxCoor();
    }
    
    public int getY(){
        return center.getyCoor();
    }

    public double getRadius(){
        return radius;
    }

    public void setX(int x){
        this.center.setxCoor(x);
    }

    public void setY(int y){
        this.center.setyCoor(y);
    }
    
    public void setCenter(int x, int y){
        center.setCoor(x,y);
    }
    public void setRadius(double r){
        radius = r;
    }
    public double getCircumference(){
        double result = Math.PI * radius * 2; 
        result *= 100;
        result += .5;
        result = (int) result;
        result /= 100;
        return result;
    }
    public double getArea(){
        double result = Math.PI * Math.pow(radius, 2);
        result *= 100;
        result += .5;
        result = (int) result;
        result /= 100;
        return result;


    }
    public String toString() {
        return "Circle:Center=(" + center.getxCoor() + "," + center.getyCoor() + ");Radius=" + this.getRadius();
        //Circle:Center=(5,7);Radius=5.0
    }
    public boolean equals(Circle other){
        return (other.center.getxCoor() == this.center.getxCoor() && other.center.getyCoor() == this.center.getyCoor() && other.getRadius() == this.getRadius());
    }

    public int compareTo(Circle other){
        return (int)( this.getArea() - other.getArea());

    }
}
