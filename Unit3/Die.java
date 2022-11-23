public class Die {
    private static int numOfDice = 0;
    public static int getNumofDice(){
        return Die.numOfDice;
    }

    private int sideUp;
    private final int numSides;
    public Die(){
        numOfDice ++;
        sideUp = 0;
        numSides = 6;
    }
    public Die(int sideUp, int numSides){
        numOfDice ++;
        this.sideUp = sideUp;
        this.numSides = numSides;
        
    }
    public int getSide(){
        return sideUp;
    }
    public void setSide(int s){
        sideUp = s;
    }

    public int getNumSides(){
        return numSides;
    }




}
