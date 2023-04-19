public class QuickSortTest
{
  public static void main(String[] args)
  {
    int[] arr = {6,8,4,2,7,5,3,8,9,1,4,7,8};
    System.out.println("Original array: ");
    printArr(arr);
    quickSort(arr);
    System.out.println("Sorted array: ");
    printArr(arr);
  }

  public static void printArr(int[] arr)
  {
    for(int i=0; i<arr.length-1;i++)
    {
      System.out.print(arr[i] + ",");
    }
    System.out.println(arr[arr.length-1]);
  }
  
  ///////////////////////////////////////////////
  public static void quickSort(int[] arr)
  {
    quickSortHelper(arr, 0, arr.length);
  }
  
  private static void quickSortHelper(int[] arr, int left, int right)
  {
    if (left >= right) return;
        int point  = partition(arr, left, right);
        quickSortHelper(arr, left, point-1);
        quickSortHelper(arr, point+1, right);
           

  }
  
  public static int partition(int[] arr, int left, int right)
  {
    int temp;
    int i = left -1;
    for (int j = left; arr[j] < right; j++){
        i++;
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    i++;
    temp = arr[right];
    arr[right] = arr[i];
    arr[i] = temp;
    return i;


  }

}