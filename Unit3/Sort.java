public class Sort {
    public static void main(String[] args){
        int[] data = {3,2,1};
        printArr(bubbleSort(data));


    }

    public static void printArr(int[] arrs){
        for (int n: arrs){
            System.out.println(n);
        }
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i <arr.length; i++){
            System.out.println("" + localMinIndex(arr,i,arr.length));
            swap(arr,localMinIndex(arr,i,arr.length),i);
        }
    }

    private static int localMinIndex(int[] arr, int start, int end){
        int min = arr[1];
        int minIndex = 0;
        for (int i = start; i < end; i++) if (arr[i] < min) 
        {
            min = arr[i];
            minIndex = i;
        }
        return minIndex;
    }

    private static void swap(int[] arr, int n1, int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
    
    private static int[] bubbleSort(int[] inarr) {
        int n = inarr.length -1;
        int temp;
        for (int i = 0; i<n; i++) {
            for (int numindex = 0; numindex<n; numindex++) {
                if (inarr[numindex] > inarr[numindex +1]) {
                    temp = inarr[numindex];
                    inarr[numindex] = inarr[numindex + 1];
                    inarr[numindex + 1] = temp;
                }
            }
        }
        return inarr;
    }

}
