package Algorithms;

import java.util.ArrayList;

public class OrderedArith {

    public static void main(String[] args){
        ArrayList<Integer> n = new ArrayList<>();
        n.add(0);
        n.add(1);
        n.add(2);
        n.add(4);
        n.add(5);
        if (solve(20,n)){
            System.out.println("Solved");
        }
        else{
            System.out.println("Not possible");
        }
    }


    public static boolean solve(int result, ArrayList<Integer> nums){       
        
        return solveHelper(0,result, 0, "initial", nums);
        
    }

    public static boolean solveHelper(int currentval, int target, int currentnum, String opp, ArrayList<Integer> nums){    
        if (currentval == target && currentnum == nums.size()){
            System.out.println(opp);
            return true;
        }
        if (currentnum == nums.size()) return false;
        try {
            if( solveHelper(currentval+nums.get(currentnum), target,currentnum+1, "add", nums) || solveHelper(currentval-nums.get(currentnum), target, currentnum+1, "sub",nums) || solveHelper(currentval*nums.get(currentnum), target, currentnum+1, "mult", nums) || solveHelper(currentval/nums.get(currentnum), target, currentnum+1, "div", nums) ||  solveHelper((int)Math.pow(currentval,nums.get(currentnum)), target, currentnum+1, "pow", nums)){
                System.out.println(opp);
                return true;
            }
        }
        catch (ArithmeticException e){
            return false;            
        }
        return false;
             
    }



}
