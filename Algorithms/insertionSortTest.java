package Algorithms;

public class insertionSortTest
{
  public static void main(String[] args)
  {
    int[] a = {5,4,3,2,1};
    displayArr(a);
    insertionSort(a);
    displayArr(a);
  }
    
  public static void displayArr(int[] arr){
    for(int i = 0; i< arr.length-1; i++){
      System.out.print(arr[i] + ", ");
    }
    System.out.println(arr[arr.length -1]);
  }

  public static void insertionSort(int[] arr){
    recursiveISortHelper(arr,1);
}

public static void recursiveISortHelper(int[] arr, int initial){
    if (initial >= arr.length) return;
    int temp = arr[initial];
    int insertionPoint = initial;
    while(insertionPoint > 0 && temp < arr[insertionPoint-1]){
      arr[insertionPoint] = arr[insertionPoint-1];
      insertionPoint--;
    }
    arr[insertionPoint] = temp;
    recursiveISortHelper(arr, initial+1);
}


}

