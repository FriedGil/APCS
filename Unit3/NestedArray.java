public class NestedArray {
    public static void main(String[] args){
       printNestedArray(get2DStr( new String[] {"A","B","C","D"}, new String[] {"a","b","c"}));
    }

    public static void printNestedArray( String[][] arrArr){
        for (String[] arr: arrArr){
            for (String item:arr){
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

    public static void printNestedArray2(int[][] arrArr){
        for (int i = 0; i < arrArr.length; i++){
            for (int j = 0; i < arrArr[i].length; j++){
                System.out.println(arrArr[i][j]);
            }
        }
    }

    public static double get2DAverage(int[][] arrArr){
        double sum = 0;
        double num = 0;
        for (int[] arr: arrArr){
            for (int item:arr){
                sum += item;
                num += 1;
            }
        }
        return sum /num;

    }

    public static String[][] get2DStr(String[] s1,String[] s2){
        String[][] output = new String[s1.length][s2.length];
        for (int i = 0; i <s1.length; i++){
            for (int j = 0; j <s2.length; j++){
                output[i][j] =s1[i] + s2[j];
            }
            
        }
        return output;
    }
}
