/*
*  Author: Alex Antaki
*  Date: October 12, 2017
*  This program will display the time the user needs to input in their alarm clock if they
*  want to wake up 45 minutes earlier.
*/
import java.util.Scanner;
public class Spavanac{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

      //Create an array of ints
      int[] time = new int[2];
    
      //Use for loop to input the time values
      for(int i = 0; i < 2; i++){
        time[i] = input.nextInt();
      }

      //Create the time change of 45 minutes and use nested ifs to test the values
      int convertedTime= time[1] - 45;
      if(convertedTime < 0){
        convertedTime += 60;
        time[0] -= 1;
        if(time[0] < 0){
          time[0] = 24 - 1;
        }
      }

       //Print each value
       System.out.print(time[0] + " " + convertedTime);
      
       //Use this for spacing purposes
       System.out.println();
   }
}
