/*
*  Author: Alex Antaki
*  Date: October 12, 2017
*  This program will test which values are in the negatives and count the amount of days that are below 0
*/
import java.util.Scanner;
public class ColdPuterScience{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Initialize counter
    int counter = 0;

    //Have user input the amount of temperatures they wish to input
    int numOfTemps = input.nextInt();
    
    //Create an array that is the size of the value the user input
    int[] recordedTemps = new int[numOfTemps];

    //Use a for loop to populate the array that was created above and test if the values are below 0
    for(int i = 0; i < recordedTemps.length; i++){
      recordedTemps[i] = input.nextInt();
      if(recordedTemps[i] < 0)
        counter++;
    }
    //Display the counter
    System.out.println(counter);
  }
}
