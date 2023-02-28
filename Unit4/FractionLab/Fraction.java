package FractionLab;

public class Fraction {
    private int num;
    private int den;

    public Fraction(){
        num = 0;
        den = 1;
    }

    public Fraction(int n, int d){
        num = n;
        den = d;
    }

    public int getNum(){
        return num;
    }

    public int getDen(){
        return den;
    }

    public double getValue(){
        return num/den;
    }

    public Fraction getReciprocal(){
        return new Fraction(den,num);
    }

    public void setValue(int n, int d){
            this.num = n;
            this.den = d;
    }

    public void reciprocal(){
        int temp = num;
        num = den;
        den = temp;
    }

    public void multiply(Fraction other){
        this.num *= other.num;
        this.den *= other.den;
    }

    public void divide(Fraction other){
        this.num *= other.den;
        this.den *= other.num;
    }

    public void add(Fraction other){
        int lcd = this.den * other.den;
        num = (num * lcd / den) + (other.num * lcd / other.den);
        den = lcd;
    }
    public void subtract(Fraction other){
        add(new Fraction(-1 * other.num, other.den));
    }

    public void simplify(){
        boolean r = true;
        while (r)
            for (int i = 2; i < num/2+2; i++){
                if (this.num % i == 0 && this.den % i == 0){
                    this.num /= i;
                    this.den/= i;
                    r = false;
                    break;
                }
                r = false;
            }
        }
        
   
    public double compareTo(Fraction other){
        return this.getValue()-other.getValue();
    }

    public Boolean equals(Fraction other){
        return this.getValue() == other.getValue();
    }

    public String toString(){
        if (this.getValue() < 0){
            return "-" + Math.abs(num) + "/" + Math.abs(den);
        }
        return "" + num + "/" + den;
    }



}
