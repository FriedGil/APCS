public class Strings {
    public static void main(String[] args) {
        char[] contents = {'h','e','l','l','o'};
        char[] contents2 = {'h','e','l','l','o'};

        GilString s1 = new GilString(contents);
        GilString s2 = new GilString(contents2);
        System.out.println(s1.equals(s2));

    }
}

class GilString {
    private final char[] value;
    public GilString(char[] val) {
        value = val;
    }
    public GilString(String val) {
        value = val.toCharArray();
    }
    public char[] read(){
        return this.value;
    }
    public boolean equals(GilString otherString){
        return this.read() == otherString.read();
    }

}
