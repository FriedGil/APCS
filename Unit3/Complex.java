public class Complex {
    private static int numOfComplex;
    private double real;
    private double img;
    public Complex(){
        real = 0;
        img = 0;
        numOfComplex ++;
    }
    public Complex(double r, double i){
        real = r;
        img = i;
        numOfComplex++;
    }
    public static int getNumOfComplex(){
        return numOfComplex;
    }
    public double getReal(){
        return real;
    }
    public double getImg(){
        return img;
    }
    public void setReal(double r){
        real = r;
    }
    public void setImg(double i){
        img = i;
    }
    public void add (Complex c){
        this.real += c.getReal();
        this.img += c.getImg();
    }
    public void subtract (Complex c){
        this.real -= c.getReal();
        this.img -= c.getImg();
    }
    public void multiply (Complex c){
        this.real *= c.getReal();
        this.img -= c.getImg();
    }
    public boolean equals(Complex c){
        return (this.real == c.getReal() && this.img == c.getImg());
    }
    public String toString(){
        if (img == 0 && real == 0) return "" + 0.0;
        if (img == 0)return "" + real;
        if (real == 0){
            if (img == 1) return "i";
            return "" + img + "i";
        }
        double absImg = Math.abs(img);
        if (img > 0){
            if (absImg == 1) return "" + real + " + " + "i";
            return "" + real + " + " + absImg + "i";
        }
        if (absImg == 1) return "" + real + " - " + "i";
            return "" + real + " - " + absImg + "i";

    }



}
