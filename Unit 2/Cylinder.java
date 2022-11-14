public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(){
        base = new Circle(0,0,1);
        height = 1;
    }
    public Cylinder(int x, int y, double r, double h){
        base = new Circle(x,y,r);
        height = h;
    }

    public int getX(){
        return this.base.getX();
    }
    public int getY(){
        return this.base.getY();
    }
    
    public double getRadius(){
        return this.base.getRadius();
    }

    public double getHeight(){
        return this.height;
    }

    public void setX(int x){
        this.base.setX(x);
    }

    public void setY(int y){
        this.base.setY(y);
    }

    public void setCenter(int x, int y){
        this.base.setX(x);
        this.base.setY(y);
    }

    public void setRadius(double r) {
        this.base.setRadius(r);
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getVolume(){
        double result = Math.PI * (Math.pow(base.getRadius(), 2)) * this.height;

        result *= 100;
        result += .5;
        result = (int) result;
        result /= 100;
        return result;
    }

    public String toString() {
        return "Cylinder:Center=(" + this.getX()+ "," + this.getY() + ");Radius=" + this.getRadius() + ";height=" + this.getHeight();
        //"Cylinder:Center=(5,7);Radius=5.0;height=3.0" // no space
    }

    public boolean equals(Cylinder other){
        return (this.getX() == other.getX() && this.getRadius() == other.getRadius() && this.getHeight() == other.getHeight());
    }

    public double compareTo(Cylinder other){
        return this.getVolume() - other.getVolume();
    }


}
