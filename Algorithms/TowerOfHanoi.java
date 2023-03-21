package Algorithms;

import java.util.ArrayList;

public class TowerOfHanoi
{
  public static void main(String[] args)
  {
    ArrayList<Integer> moves = new ArrayList<>();
    solveToH(moves,8, 1, 3, 2);
    System.out.println(moves.size());
  }
  
  public static void solveToH(ArrayList<Integer> moves, int n, int fromPlace, int toPlace, int otherPlace)
  {
    moves.add(fromPlace);
    if (n==1){
        System.out.println("move from " + fromPlace + "to " + toPlace);
    }
    else{
      solveToH(moves,n-1, fromPlace, otherPlace, toPlace);
      solveToH(moves,n-1, otherPlace, toPlace,fromPlace);
    }
  }
}

