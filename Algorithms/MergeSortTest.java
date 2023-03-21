package Algorithms;
import java.util.Arrays;
public class MergeSortTest
{
  public static void main(String[] args)
  {
    int[] arr = {6,8,4,2,7,5,3,8,9,1,4,7,8};
    System.out.println("Original array: " + Arrays.toString(arr));
    mergeSort(arr);
    System.out.println("Sorted array: " + Arrays.toString(arr));
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
  
  public static void merge(int[] arr, int start, int middle, int end, int[] temp)
  {
    
  }

}

