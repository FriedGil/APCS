public class DeluxeStringTester {
    public static void main(String[] args){
        DeluxeString s1 = new DeluxeString("hello *".toCharArray(), new Object[]{"world"});
        System.out.println(s1);
    }
}
