public class Circuit {
    public static void main(String[] args){
    try {
        boolean result = 3==3 && 3/0 == 0;
        System.out.println(result);


    } catch (Exception e) {
        System.out.println(e);
    }
    }
}
