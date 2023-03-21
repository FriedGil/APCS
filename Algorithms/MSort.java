package Algorithms;
import java.util.Arrays;

public class MSort {
    
    public static void main(String[] args)
    {
      int[] arr = {6,8,4,2,7,5,3,8,9,1,4,7,8};
      System.out.println("Original array: " + Arrays.toString(arr));
      mSort(arr);
      System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void mSort(int[] arr){
        int min = arr[0];
        int max = arr[0];
        int startbound = 0;
        int endbound = 0;
        int n = arr.length;
        int[] newArr = new int[n*2];
        newArr[n] = arr[0];
        for (int i = 1; i < arr.length; i++){
          
        }
    }
  

}