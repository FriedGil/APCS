public class WordleTester {
    public static void main(String[] args){
        Wordle n = new Wordle();
        int sum = 0;
        for (int i = 0; i < 1000; i++){
            sum += n.run();
        }
        System.out.println(sum/1000);
    }
}
