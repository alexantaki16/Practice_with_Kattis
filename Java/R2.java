/*
*  Author: Alex Antaki
*  Date: October 12, 2017
*  This program is the solution to the R2 problem on Kattis.com
*/
import java.util.Scanner;

public class R2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    //Create an array of ints
    int[] values = new int[2];
    
    //Populate the array by having the user input values through a for loop
    for(int i = 0; i < values.length; i++){
      values[i] = input.nextInt();
    }
    
    //Rewrite the formula so R2 is isolated and put in the values to get R2
    int R2 = (2*values[1]) - (values[0]);
    
    //Display results
    System.out.println(R2);
  }
}
