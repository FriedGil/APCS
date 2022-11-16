public class Dec2BinTest{
    public static void main(String[] args){
        int test,answer,yourAnswer;

        test = 12;
        answer = 1100;
        System.out.println("Converting [" + test + "]_10 to binary");
        yourAnswer = dec2Bin(test);

        if(yourAnswer == answer){
            System.out.println("Pass");
        }else{
            System.out.println("Failed; expected: " + answer + " ;Your answer: " + yourAnswer);
        }

        test = 36;
        answer = 100100;
        System.out.println("Converting [" + test + "]_10 to binary");
        yourAnswer = dec2Bin(test);

        if(yourAnswer == answer){
            System.out.println("Pass");
        }else{
            System.out.println("Failed; expected: " + answer + " ;Your answer: " + yourAnswer);
        }

        test = 87;
        answer = 1010111;
        System.out.println("Converting [" + test + "]_10 to binary");
        yourAnswer = dec2Bin(test);

        if(yourAnswer == answer){
            System.out.println("Pass");
        }else{
            System.out.println("Failed; expected: " + answer + " ;Your answer: " + yourAnswer);
        }

        test = 158;
        answer = 10011110;
        System.out.println("Converting [" + test + "]_10 to binary");
        yourAnswer = dec2Bin(test);

        if(yourAnswer == answer){
            System.out.println("Pass");
        }else{
            System.out.println("Failed; expected: " + answer + " ;Your answer: " + yourAnswer);
        }

        test = 687;
        answer = 1010101111;
        System.out.println("Converting [" + test + "]_10 to binary");
        yourAnswer = dec2Bin(test);

        if(yourAnswer == answer){
            System.out.println("Pass");
        }else{
            System.out.println("Failed; expected: " + answer + " ;Your answer: " + yourAnswer);
        }
    }


    static int dec2Bin(int dec){
        String result = "";
        while (dec > 0){
            result = dec % 2 + result;
            dec /= 2;
        }
        return Integer.parseInt(result);
    }
}