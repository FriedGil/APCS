public class Sort {
    public static void main(String[] args){
        int[] arr = {5,2,3,7,1,9,5,34,6,4,7,8,2};
        arr = bubbleSort(arr);
        long startTime = System.nanoTime();
        for (int element:arr) {
            System.out.println(element);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        double elapsedTimeInSecond = (double) duration / 1_000_000_000;
        System.out.println(String.format(("Duration: %f"),elapsedTimeInSecond));


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
    // private static int[] merge_sort(int[] inarr) {

    // }
}