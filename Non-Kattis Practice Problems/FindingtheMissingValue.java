/*
*  Author: Alex Antaki
*  Date: October 12, 2017
*  This program will take the values from two arrays and pick out the missing value
*/
import java.util.Scanner;
public class FindingtheMissingValue{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Create two arrays and make one one value greater
    int[] myFirstArray = new int[5];
    int[] mySecondArray = new int[4];
    
    //Initialize the sums to 0
    int sumOfArrayOne = 0;
    int sumOfArrayTwo = 0;

    //Use a for loop to input the values and take the sums simulataneously
    //The values in the arrays MUST be the same, but the first one has an extra value
    for(int i = 0; i < myFirstArray.length; i++){
      myFirstArray[i] = input.nextInt();
      sumOfArrayOne += myFirstArray[i];
    }

    //Use a for loop to input the values and take the sums simulataneously
    //The values in the second array MUST match the first four in the first array
    for(int j = 0; j < mySecondArray.length; j++){
      mySecondArray[j] = input.nextInt();
      sumOfArrayTwo += mySecondArray[j];
    }

    //Display the results of the difference between the arrays
    System.out.println(sumOfArrayOne - sumOfArrayTwo);
  }
}
