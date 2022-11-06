// This class is a better* implementation of a string with some extra methods
// *: May or may not actually be better.
import java.util.Arrays;
import java.util.Vector;

public class DeluxeString {
    private final char[] contents;
    private final int length;
    
    public DeluxeString(){
        this.contents = new char[0];
        this.length = contents.length;
    }

    public DeluxeString(int length){
        this.contents = new char[length];
        this.length = length;
    }

    public DeluxeString(char[] contents){
        this.contents = contents;
        this.length = contents.length;
    }
    public DeluxeString(String other){
        this.contents = other.toCharArray();
        this.length = contents.length;
    }

    public DeluxeString(char[] contents, Object[] args){

        Vector<CharSequence> v = new Vector<CharSequence>();
        int x = 0;
        int lengthSum = 0;
        for (char c : contents){
            if (c == '*'){
                v.add(args[x].toString());
                lengthSum += args[x].toString().length();
                x++;

            } 
            else {
                v.add("" + c);
                lengthSum ++;
            }            
        }
        this.contents = new char[lengthSum];
        int i = 0;
        for (CharSequence s : v){
            char[] cArray = s.toString().toCharArray();
            for (char c : cArray){
                this.contents[i] = c;
                i++;
            }
        }
        this.length = lengthSum;
    }

    public char[] getContents(){
        return this.contents;
    }

    public int getLength(){
        return this.length;
    }

    public boolean equals(String other){
        return Arrays.equals(this.contents, other.toCharArray());
    }

    public boolean equals(DeluxeString other){
        return Arrays.equals(other.getContents(), this.contents);
    }

    public boolean equals(char[] other){
        return Arrays.equals(other, this.contents);

    }

    public String toString(){
        return String.valueOf(this.contents);
    }

    public DeluxeString reverse(){
        char[] reversed = new char[this.length];
        for (int i = 0; i < this.length; i++)
        {
            reversed[i] = this.contents[this.length - i - 1];
        }
        return new DeluxeString(reversed);
    }

    public DeluxeString toLowerCase(){
        char[] lower = new char[this.length];
        for (int i = 0; i < this.length; i++)
        {
            lower[i] = Character.toLowerCase(this.contents[i]);
        }
        return new DeluxeString(lower);
    }

    public DeluxeString toUpperCase(){
        char[] upper = new char[this.length];
        for (int i = 0; i < this.length; i++)
        {
            upper[i] = Character.toUpperCase(this.contents[i]);
            
        }
        return new DeluxeString(upper);
    }

}

