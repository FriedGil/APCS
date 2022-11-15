package Unit3;

public class Bin2DecTest{
    public static void main(String[] args){
        int test,answer,yourAnswer;

        test = 1100;
        answer = 12;
        System.out.println("Converting [" + test + "]_2 to decimal");
        yourAnswer = bin2Dec(test);

        if(yourAnswer == answer){
            System.out.println("Pass");
        }else{
            System.out.println("Failed; expected: " + answer + " ;Your answer: " + yourAnswer);
        }

        test = 100100;
        answer = 36;
        System.out.println("Converting [" + test + "]_2 to decimal");
        yourAnswer = bin2Dec(test);

        if(yourAnswer == answer){
            System.out.println("Pass");
        }else{
            System.out.println("Failed; expected: " + answer + " ;Your answer: " + yourAnswer);
        }

        test = 1010111;
        answer = 87;
        System.out.println("Converting [" + test + "]_2 to decimal");
        yourAnswer = bin2Dec(test);

        if(yourAnswer == answer){
            System.out.println("Pass");
        }else{
            System.out.println("Failed; expected: " + answer + " ;Your answer: " + yourAnswer);
        }

        test = 10011110;
        answer = 158;
        System.out.println("Converting [" + test + "]_2 to decimal");
        yourAnswer = bin2Dec(test);

        if(yourAnswer == answer){
            System.out.println("Pass");
        }else{
            System.out.println("Failed; expected: " + answer + " ;Your answer: " + yourAnswer);
        }

        test = 1010101111;
        answer = 687;
        System.out.println("Converting [" + test + "]_2 to decimal");
        yourAnswer = bin2Dec(test);

        if(yourAnswer == answer){
            System.out.println("Pass");
        }else{
            System.out.println("Failed; expected: " + answer + " ;Your answer: " + yourAnswer);
        }
    }

    static int bin2Dec(int bin){
        int result = 0;
        String bString = "" + bin;
        int n = bString.length();
        int i = 0;
        int num = 1;
        while (n>i){
            if (bString.substring(n-i,n-i) == "0")result+=num;
            num *=2;
        }

        return result;

    }
}


