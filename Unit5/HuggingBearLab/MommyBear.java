package Unit5.HuggingBearLab;

public class MommyBear extends Bear {
    private int hugs;
    public MommyBear(){
        hugs = 0;
    }
    public String getType(){
        return "Mommy Bear";
    }
    public int getHugCount(){
        return hugs;
    }
    public void hug(Bear other){
        hugs ++;
        addTotalHug();
        other.receieveHug();
    }

    public void receieveHug(){
        hugs ++;
        addTotalHug();
    }



    public String toString(){
        return "Mommy Bear has " + hugs + " hugs.";
    }

    public boolean equals(Bear other){
        return getType() == other.getType();
    }

}
