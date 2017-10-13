/*
*  Author: Alex Antaki
*  Date: October 12, 2017
*  This program will take in the letters TCG and based off of the amount of each letter 
*  and pairs available the score will be displayed.
*/
import java.util.Scanner;
public class SevenWonders{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Initialize all variables
    int tCounter = 0;
    int gCounter = 0;
    int cCounter = 0;
    int specialAddition = 0;
    int myPlaceHolder = 0;

    //Create string to hold user input
    String cards = input.nextLine();

    //Use a for loop to count the number of letter "T"s "G"s and "C"
    for(int i = 0; i < cards.length(); i++){
      if(cards.charAt(i) == 'T')
        tCounter++;
      else if(cards.charAt(i) == 'G')
        gCounter++;
      else if(cards.charAt(i) == 'C')
        cCounter++;
    }

    //Create two ints to store the minimum number between the three counters
    int myInt = (int)Math.min(tCounter, cCounter);
    int myNextInt = (int)Math.min(cCounter, gCounter);

    //Use if statement to determine which of the new two ints is the smallest
    if(myInt < myNextInt)
      myPlaceHolder = myInt;
    else
      myPlaceHolder = myNextInt;

    //Take the smallest counter value and multiply it by seven
    specialAddition = myPlaceHolder * 7;

    //Print the answer
    System.out.println((int)(Math.pow(tCounter,2) + Math.pow(gCounter,2) + Math.pow(cCounter,2)) + specialAddition);
  }
}
