//Build by Huo Chen 
//Last Update 12/7/2022

import java.util.Arrays;
import java.util.Scanner;
public class ArrayRemoveAndInsertTest {
    public static void removeAtIndex(String[] strs, int index){
        for (int i = index; i <strs.length-1; i++){
            strs[i] = strs[i+1];
        }
        strs[strs.length-1] = null;
    }    
    public static void insertAtIndex (String[] strs, int index, String elem)
    {
        for (int i = strs.length-1; i > index; i--){
            strs[i] = strs[i-1];
        }
        strs[index] = elem;
       
    }
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int choice = -1;
        
        while(choice != 4){
            System.out.println("1) Test removeAtIndex only");
            System.out.println("2) Test insertAtIndex only");
            System.out.println("3) Test both only");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            
            if(choice == 1){
              testRemove();
            }else if(choice == 2){ 
              testInsert();
            }else if(choice == 3){
              testRemove();
              testInsert();
            }else if(choice == 4){
              System.out.println("Good bye!");
            }
        }
    }
    
    public static void testRemove(){
        String[] arr = {"A","B","C","D","E","F","G"};
        System.out.println("Testing using array " + Arrays.toString(arr));
        
        System.out.print("Test 1: Removing element at index 2...");
        removeAtIndex(arr,2);
        if(arr[0].equals("A") && arr[1].equals("B") && arr[2].equals("D") && arr[3].equals("E") && arr[4].equals("F") && arr[5].equals("G") && arr[6]==null){
            System.out.println("Pass!");
        }else{
            System.out.println("Failed!");
            System.out.println("Expecting\t[A, B, D, E, F, G, null]");
            System.out.println("Your answer\t" + Arrays.toString(arr));
        }
        
        System.out.print("Test 2: Removing element at index 4...");
        removeAtIndex(arr,4);
        if(arr[0].equals("A") && arr[1].equals("B") && arr[2].equals("D") && arr[3].equals("E") && arr[4].equals("G") && arr[5]==null && arr[6]==null){
            System.out.println("Pass!");
        }else{
            System.out.println("Failed!");
            System.out.println("Expecting\t[A, B, D, E, G, null, null]");
            System.out.println("Your answer\t" + Arrays.toString(arr));
        }
        
        System.out.print("Test 3: Removing element at index 0...");
        removeAtIndex(arr,0);
        if(arr[0].equals("B") && arr[1].equals("D") && arr[2].equals("E") && arr[3].equals("G") && arr[4]==null && arr[5]==null && arr[6]==null){
            System.out.println("Pass!");
        }else{
            System.out.println("Failed!");
            System.out.println("Expecting\t[B, D, E, G, null, null, null]");
            System.out.println("Your answer\t" + Arrays.toString(arr));
        }
    }
    
    public static void testInsert(){
        String[] arr = {"A","B","C","D","E",null,null};
        System.out.println("Testing using array " + Arrays.toString(arr));
        
        System.out.print("Test 1: Inserting element \"Q\" at index 1...");
        insertAtIndex(arr,1,"Q");
        if(arr[0].equals("A") && arr[1].equals("Q") && arr[2].equals("B") && arr[3].equals("C") && arr[4].equals("D") && arr[5].equals("E") && arr[6]==null){
            System.out.println("Pass!");
        }else{
            System.out.println("Failed!");
            System.out.println("Expecting\t[A, Q, B, C, D, E, null]");
            System.out.println("Your answer\t" + Arrays.toString(arr));
        }
        
        System.out.print("Test 2: Inserting element \"T\" at index 0...");
        insertAtIndex(arr,0,"T");
        if(arr[0].equals("T") && arr[1].equals("A") && arr[2].equals("Q") && arr[3].equals("B") && arr[4].equals("C") && arr[5].equals("D") && arr[6].equals("E")){
            System.out.println("Pass!");
        }else{
            System.out.println("Failed!");
            System.out.println("Expecting\t[T, A, Q, B, C, D, E]");
            System.out.println("Your answer\t" + Arrays.toString(arr));
        }
        
        System.out.print("Test 3: Inserting element \"W\" at index 4...");
        insertAtIndex(arr,4,"W");
        if(arr[0].equals("T") && arr[1].equals("A") && arr[2].equals("Q") && arr[3].equals("B") && arr[4].equals("W") && arr[5].equals("C") && arr[6].equals("D")){
            System.out.println("Pass!");
        }else{
            System.out.println("Failed!");
            System.out.println("Expecting\t[T, A, Q, B, W, C, D]");
            System.out.println("Your answer\t" + Arrays.toString(arr));
        }
    }
    
}

