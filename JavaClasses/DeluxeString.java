// This class is a better* implementation of a string with some extra methods
// *: May or may not actually be better.
import java.util.Arrays;

public class DeluxeString {
    private final char[] contents;
    private final int length;
    
    public DeluxeString(){
        this.contents = new char[0];
        this.length = contents.length;
    }
    public DeluxeString(char contents[]){
        this.contents = contents;
        this.length = contents.length;
    }
    public DeluxeString(char contents[],Object... args){
        this.contents = contents;
        this.length = contents.length;
        for (int i = 0; i < contents.length; i++ ){}

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

    }

