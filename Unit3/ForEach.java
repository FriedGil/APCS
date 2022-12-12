public class ForEach {
    public static void main(String[] args){
       
        int[] array = {1,2,3};
        Gil.print(maxVal(new int[] {1,2,3}));
        Gil.print(Gil.randint(0, 4));
    }  
    public static int maxVal(int[] arr){
        int max = arr[0];
        for (int i:arr) if (i>max) max = i;
        return max; 
        
    }

}
