/*
*  Author: Alex Antaki
*  Date: October 12, 2017
*  This program will determine, based off of the user's input, whether Bob or Alice should be displayed
*/
import java.util.Scanner;

public class TakeTwoStones{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Have user input value
    int myInt = input.nextInt();
    
    //Based off of the input, determine who would win: Alice or Bob
    if(myInt % 2 == 0)
      System.out.println("Bob");
    else
      System.out.println("Alice");  
  }
}
