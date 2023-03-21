package Unit5.HuggingBearLab;

public class BabyBear extends Bear {
    private int hugs;
    public BabyBear(){
        hugs = 0;
    }
    public String getType(){
        return "Baby Bear";
    }
    public int getHugCount(){
        return hugs;
    }

    public void receieveHug(){
        hugs ++;
        addTotalHug();
    }



    public String toString(){
        return "Baby bear has " + hugs + " hugs.";
    }

    public boolean equals(Bear other){
        return getType() == other.getType();
    }

}
