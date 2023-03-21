package Unit5.HuggingBearLab;

public abstract class Bear implements Comparable<Bear>{

    private static int bearCount;
    private static int hugCount;
    private int hugs;

    public Bear(){
        bearCount++;
    }

    public abstract String getType();

    public abstract void receieveHug();
    static int getTotalHugCount(){
        return hugCount;
    }

    public int getHugCount(){
        return hugs;
    }

    static int getBearCount(){
        return bearCount;
    }

    static void addTotalHug(){
        hugCount +=1;
    }

    static void addTotalBear(){
        bearCount += 1;
    }
    
    static boolean CheckGroup(Bear b1, Bear b2, Bear b3){
        return !b1.getType().equals(b2.getType()) && !b1.getType().equals(b3.getType()) && !b2.getType().equals(b3.getType()); 
    }

    public String showLove(Bear other){
        return this.getType() + " loves " + other.getType();
    }

    public int compareTo(Bear other){
        return this.getHugCount()-other.getHugCount();
    }
}