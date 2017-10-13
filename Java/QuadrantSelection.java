/*
*  Author: Alex Antaki
*  Date: October 12, 2017
*  This program will take in the cordinates on a plane and determine which quadrant
*  the x and y values place you in
*/
import java.util.Scanner;

public class QuadrantSelection{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Create an array that take in two values to be used as the point on the plane
    int[] coordinates = new int[2];
    
    //Populate the plane by having the user input the values the want
    for(int i = 0; i < 2; i++){
      coordinates[i] = input.nextInt();
    }

    //Use and if/else if statement to determine the quadrant location and display the result
    if(coordinates[0] >= 0 && coordinates[1] >= 0)
      System.out.println("1");
    else if(coordinates[0] < 0 && coordinates[1] >= 0)
      System.out.println("2");
    else if(coordinates[0] < 0 && coordinates[1] <= 0)
      System.out.println("3");
    else
      System.out.println("4");  
  }
}
