package Algorithms;


public class GridWalk
{
  public static int[][] grid = {{0,1,0,0,0,0},
                                {0,0,1,0,0,1},
                                {0,0,0,1,1,0},
                                {0,0,0,0,1,0},
                                {1,0,1,5,0,0},
                                {0,0,0,1,0,0}};
  
  public static void main(String[] args)
  {  
    if(checkPath(0,0)){
      System.out.println("Path Found, Printed in reversed order.");
      for (int[] g: grid) {
        for (int i: g){
            System.out.print(i + " ");
        }
        System.out.println();
      }
    }else{
      System.out.println("No Path Exist");
    }
  }
  
  public static boolean checkPath(int row, int col)
  { 
    if (row > grid.length-1 || row > grid[0].length-1) return false;
    if (grid[row][col] == 5) return true;
    if (grid[row][col] == 1) return false;
    if (row == grid.length-1) return false;
    grid[row][col] = 2;
    return checkPath(row+1, col) || checkPath(row, col+1);
  }
}
