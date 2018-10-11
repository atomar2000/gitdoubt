
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atoma
 */
public class ghfnh {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author atoma
 */

    
    public static void main(String args[])
    {
      int grid[][][] =
      {
          {
              {1, 2, 3},
              {2, 3, 4},
              {3, 4, 5}
          },      
          {
              {8, 9 ,10},
              {18,19,20},
              {22, 21, 14}
          }   
          };
      Scanner value1 = new Scanner(System.in);
      System.out.println("enter value of the matrix ");
      int i = value1.nextInt();
      i--;
      Scanner value2 = new Scanner(System.in);
      System.out.println("enter the value of the row");
      int j = value2.nextInt();
      j--;
      Scanner value3 = new Scanner(System.in);
      System.out.println("enter the value of the column");
      int k = value3.nextInt();
      k--;
      System.out.println("the value from the grid is = " + grid[i][j][k]);
      
      
}
}

