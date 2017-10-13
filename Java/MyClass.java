/*
*  Author: Alex Antaki
*  Date: October 12, 2017
*  This program will have the user input how many times they want to display the spell
*/
import java.util.Scanner;

public class MyClass{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    //Have user input the amount of spells they want to display
    int spellCount = input.nextInt();
    
    //Use for loop to show how many time the spell will be displayed
    for(int i = 1; i < spellCount + 1; i++){
      System.out.println(i + " Abracadabra");
    }
  }
}
