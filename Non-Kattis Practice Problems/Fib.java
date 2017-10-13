/*
*  Author: Alex Antaki
*  Date: October 12, 2017
*  This program will have the user input the nth iteration they wish to be displayed in the Fibonacci sequence
*/
import java.util.Scanner;
public class Fib{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    //Have user input which iteration in the Fibonacci sequence they wish to see displayed
    int fibIterations = input.nextInt();
    
    //Initialize all variables and use meaningful names for later
    int prevValue = 0;
    int currentValue = 1;
    int nextNum = 0;

    //Run through a loop to update the values and store the nth iteration the user desires
    for(int i = 0; i < fibIterations; i++){
      nextNum = prevValue + currentValue;
      prevValue = currentValue;
      currentValue = nextNum;
    }
    
    //Display the value the user wants
    System.out.println(currentValue);
  }
}
