// This class is a better* implementation of a string with some extra methods
// *: May or may not actually be better.


public class GilsBetterString {
    private char[] contents;
    private int length;
    
    public GilsBetterString(){
        this.contents = new char[0];
        this.length = contents.length;
    }
    public GilsBetterString(char contents[]){
        this.contents = contents;
        this.length = contents.length;
    }
    public GilsBetterString(char contents[],Object... args){
        this.contents = contents;
        this.length = contents.length;
        for (int i = 0; i < contents.length; i++ ){}

    }

    public GilsBetterString reverse(){
        GilsBetterString returnString = new GilsBetterString();
        for (int i = 0; i < this.length; i++){
            returnString.contents[i] = this.contents[this.length-i];
        }
        return returnString;
    }
}
