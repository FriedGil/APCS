package Unit4.FractionLab;

public class WholeNum extends Fraction {
    public WholeNum(){
        super();
    }
    public WholeNum(int i){
        super(i,1);
    }

    public void setValue(int i){
        this.setValue(i, 1);
    }
    public Fraction toFrac(){
        return new Fraction(this.getNum(),this.getDen());
    }

    public String toString(){
        return "" + this.getNum();
    }

}
