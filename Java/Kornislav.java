/*
*  Author: Alex Antaki
*  Date: October 12, 2017
*  This program will is the solution to the Kornislav the turtle problem on Kattis.com
*/
import java.util.*;
public class Kornislav {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Create an array to store the input
    int[] directions = new int[4];
    
    //Use a for loop to populate the array
    for(int i = 0; i < directions.length; i++){
      directions[i] = input.nextInt();
    }
    //Sort the array to easily locate the smallest and penultimate values
    Arrays.sort(directions);

    //Store the rectangle and display it
    int rectangle = directions[0] * directions[2];
    System.out.println(rectangle);
  }
}
