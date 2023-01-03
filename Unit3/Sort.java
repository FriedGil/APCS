public class Sort {
    public static void main(String[] args){
        int[] data = {3,2,1};
        selectionSort(data);
        printArr(data);


    }

    public static void printArr(int[] arrs){
        for (int n: arrs){
            Gil.print(n);
        }
    }

    public static void selectionSort(int[] arr){
        int localMin;
        int index;
        for (int i = 0; i <arr.length; i++){
            localMin = arr[i];
            for (int j = i; j <arr.length-1; j++){
                if (arr[j] < localMin) {
                    localMin = j;
                    index = i;
                }
            }
            swap(arr, localMin, i);
        }
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
