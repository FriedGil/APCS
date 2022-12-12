import java.util.Scanner;


public class ArrayTest {
    public static void main(String[] args){
        String[] names = new String[4];
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        int emptyIndex = 0;
        while (running){
            System.out.println("1: Add Name \t"  +"1!: Force Add Name \t" + "2: Show all persons \t" + "3: Exit Program");
            switch (scan.next()){
                case "1": {
                    if (emptyIndex < names.length){
                        System.out.println("Enter Name:");
                        names[emptyIndex] = scan.next();
                        emptyIndex++;
                    }
                    else System.out.println("Full. Try 1! to force enter.");
                    break;
                }
                case "1!": {
                    System.out.println("Enter Name:");
                    if (emptyIndex <= names.length-1){
                        names[emptyIndex] = scan.next();
                        emptyIndex++;
                    }
                    else {                 
                        String[] copyArr = new String[names.length +1];
                        for (int i = 0; i < names.length; i++){
                            copyArr[i] = names[i];
                        }
                        copyArr[copyArr.length-1] = scan.next();
                        names = copyArr;
                        emptyIndex++;
                    }
                    break;
                }
                case "2": {
                    for(String name:names){
                        System.out.println(name);
                    }
                    break;
                }
                case "3":{
                    running = false;
                    break;
                }

                default: System.out.println("Invalid Operation");

            }
        }
    }

}
