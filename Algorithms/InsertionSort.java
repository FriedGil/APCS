package Algorithms;

public class InsertionSort {
   public static void main(String[] args){

    int[] arr = {5,4,3,2,1};
    recursiveISort(arr);

    for (int i: arr){
        System.out.println(i);
    }

   }
   
   public static void insertionSort(int[] arr)

   {
   
     int temp;
   
     int insertionPoint;
   
     for(int i = 1; i < arr.length; i++)
   
     {
       temp = arr[i];
       insertionPoint = i;
       while(insertionPoint > 0 && temp < arr[insertionPoint-1]){
         arr[insertionPoint] = arr[insertionPoint-1];
         insertionPoint--;
       }
       arr[insertionPoint] = temp;
     }   
   }

   public static int[] recursiveISort(int[] arr){
        return recursiveISortHelper(arr,1);
   }

   public static int[] recursiveISortHelper(int[] arr, int initial){
        if (initial >= arr.length) return arr;
        int temp = arr[initial];
        int insertionPoint = initial;
        while(insertionPoint > 0 && temp < arr[insertionPoint-1]){
          arr[insertionPoint] = arr[insertionPoint-1];
          insertionPoint--;
        }
        arr[insertionPoint] = temp;
        return recursiveISortHelper(arr, initial+1);
   }
}
