import java.util.Random;



public class Sort {
    public static void main(String[] args){
        int[] arr = {5,2,3,7,1,9,5,34,6,4,7,8,2,5,19};
        long startTime = System.nanoTime();
        for (int i = 0; i<100000; i++) {
            arr = bubbleSort(arr);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        double elapsedTimeInSecond = (double) duration / 1000000000;
        for (int element:arr) {
            System.out.print(element + " ");
        }
        System.out.println(String.format(("Bubble Sort Duration: %f"),elapsedTimeInSecond));
        startTime = System.nanoTime();
        for (int i = 0; i<100000; i++) {
            arr = bogoSort(arr);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        elapsedTimeInSecond = (double) duration / 1000000000;
        for (int element:arr) {
            System.out.print(element + " ");
        }
        System.out.println(String.format(("Quick Sort Duration: %f"),elapsedTimeInSecond));



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
    private static int[] bogoSort(int[] inarr) {
		Random rand = new Random();
        boolean sorted = false;

        while (!sorted) {
            for (int i = 0; i < inarr.length; i++) {
                int randomIndexToSwap = rand.nextInt(inarr.length);
                int temp = inarr[randomIndexToSwap];
                inarr[randomIndexToSwap] = inarr[i];
                inarr[i] = temp;

            for (int a = 0; a < inarr.length; a++) {
                if (inarr[0] < inarr[1]) {
                    sorted = true;
                }
                else {
                    sorted = false;
                    continue;
                }
        }}
        }

        return inarr;
    }
}