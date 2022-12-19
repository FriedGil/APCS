public class Sorts {
    public static void main(String[] args){
        int[] arr = {5,2,3,7,1,9,5,34,6,4,7,8,2,5,19};    
        long startTime = System.nanoTime(); 
        for (int i = 0; i<1000000; i++)  { // 1 million loops
            arr = bubbleSort(arr);
        } 
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        double elapsedTimeInSecond = (double) duration / 1000000000;
        for (int element:arr) {
            System.out.print(element + " ");
        }
        System.out.println(String.format(("Bubble Sort Duration: %f Seconds"),elapsedTimeInSecond));
        startTime = System.nanoTime(); 
        for (int i = 0; i<1000000; i++)  { // 1 million loops
            arr = minSort(arr);
        } 
        endTime = System.nanoTime();
        duration = endTime - startTime;
        elapsedTimeInSecond = (double) duration / 1000000000;
        for (int element:arr) {
            System.out.print(element + " ");
        }
        System.out.println(String.format(("Min Sort Duration: %f Seconds"),elapsedTimeInSecond));



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
    private static int[] minSort(int[] inarr) {
        int n = inarr.length;
        int[] outarr = new int[n];
        for (int i=0; i<n; i++){
        }
        return outarr;
        
    }
        
}