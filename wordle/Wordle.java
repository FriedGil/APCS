import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wordle {
    public static int run(){
        File f = null;
        Scanner fileScanner = null;
        ArrayList<String> a = new ArrayList<String>();
        String guess;
        String answer;
        String filter;
        int attempts = 0;
        try{
            f = new File("sgb-words.txt");

            fileScanner = new Scanner(f);

        }
        catch(Exception e){
            System.out.println("error");
        }
        while(fileScanner.hasNextLine()){
            a.add(fileScanner.nextLine());
          }
          fileScanner.close();
        answer = a.get((int) (Math.random()*a.size()));
        while (attempts < 100) {
            guess = a.get(0);
            if (attempts == 0) guess = "adieu";
            filter = "";
            String letters = "";
            if (guess.equals(answer)){
                return attempts;
            }
            a.remove(0);
            for (int i = 0; i < 5; i++){
                if (guess.charAt(i) == answer.charAt(i)) {
                    letters += guess.charAt(i);
                    filter += guess.charAt(i);
                }
                else if (answer.indexOf(guess.charAt(i)) >= 0) {
                    letters += guess.charAt(i);
                    filter+= ".";
                }
                else{
                    filter+= ".";
                }
            }
            Pattern pattern = Pattern.compile(filter, Pattern.CASE_INSENSITIVE);
            for (int i = a.size()-1; i>=0; i--){
                if (!pattern.matcher(a.get(i)).matches()) a.remove(i);
                else if (letters.length()!= 0 && !a.get(i).matches(".*[" + letters + "].*")) a.remove(i);
            }
            attempts++;
        }
        return attempts;
    }

}