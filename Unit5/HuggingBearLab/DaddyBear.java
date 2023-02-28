package HuggingBearLab;

public class DaddyBear extends Bear {
    private int hugs;
    public DaddyBear(){
        hugs = 0;
    }
    public String getType(){
        return "Daddy Bear";
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
        return "Daddy Bear has " + hugs + " hugs.";
    }

    public boolean equals(Bear other){
        return getType() == other.getType();
    }


}
