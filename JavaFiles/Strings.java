public class Strings {
    public static void main(String[] args) {
        String s1 = "crab";
        String s2 = new String("crab");
        String s3 = s1;
        System.out.println(s3.equals(s2)); //true
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //false
    }
}

