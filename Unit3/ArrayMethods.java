public class ArrayMethods {
    public static void main(String[] args){
        System.out.println("Pre Removal:");
        for (String arg:args){
            System.out.println(arg);
        }

        removeAtIndex(args, 1);

        System.out.println("Post Removal:");
        for (String arg:args){
            System.out.println(arg);
        }

    }

    public static void removeAtIndex(String[] strs, int index){
        for (int i = index; i <strs.length-1; i++){
            strs[i] = strs[i+1];
        }
        strs[strs.length-1] = null;
    }


}