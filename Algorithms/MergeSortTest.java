package Algorithms;
import java.util.Arrays;
public class MergeSortTest
{
  public static void main(String[] args)
  {
    int[] arr = {6,8,4,2,7,5,3,8,9,1,4,7,8,6,8,4,2,7,5,3,8,9,1,4,7,8,6,8,4,2,7,5,3,8,9,1,4,7,8,6,8,4,2,7,5,3,8,9,1,4,7,8,6,8,4,2,7,5,3,8,9,1,4,7,8};
    System.out.println("Original array: " + Arrays.toString(arr));
    long a = System.nanoTime();
    mergeSort(arr);
    long b = System.nanoTime();
    System.out.println(b-a);
    System.out.println("Sorted array: " + Arrays.toString(arr));
  }

  public static long timeit(Runnable r){
      long a = System.nanoTime();
      r.run();
      long b = System.nanoTime();
      return b-a;
  }
  
  ///////////////////////////////////////////////
  public static void mergeSort(int[] arr)
  {
    mergeSortHelper(arr, 0, arr.length-1, new int[arr.length]);
  }
  
  private static void mergeSortHelper(int[] arr, int start, int end, int[] temp)
  {
    if (start == end) return;
    int middle = (start + end) / 2;
    mergeSortHelper(arr, start, middle, temp);
    mergeSortHelper(arr, middle + 1, end, temp);
    merge(arr, start, middle, end, temp);
  }
  
  private static void merge(int[] arr, int start, int middle, int end, int[] temp)
  {
    int index1 = start;
    int index2 = middle + 1;
    int indexTemp = start;
    while(index1 <= middle && index2 <= end)
    {
      if(arr[index1] < arr[index2]){
        temp[indexTemp] = arr[index1];
        index1++;
      }
      else{
        temp[indexTemp] = arr[index2];
        index2++;
      }
      indexTemp++;
    }
    while(index1 <= middle)
    {
      temp[indexTemp] = arr[index1];
      index1++;
      indexTemp++;
    }
    while(index2 <= end)
    {
      temp[indexTemp] = arr[index2];
      index2++;
      indexTemp++;
     }
    for(int i = start; i <= end; i++) arr[i] = temp[i];  
  }
}