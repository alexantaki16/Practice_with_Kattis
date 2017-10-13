/*
*  Author: Alex Antaki
*  Date: October 12, 2017
*  This program will calculate which type of moose you see based off of the antler count and
*  how many are on each side.
*/
import java.util.Scanner;
public class JudgingMoose{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Have the user input the tines on the left and right sides
    int tinesOnLeft = input.nextInt();
    int tinesOnRight = input.nextInt();

    //Use lengthy if statement to check which moose we have
    if(tinesOnLeft == 0 && tinesOnRight == 0)
     System.out.println("Not a moose");
    else if(tinesOnLeft > tinesOnRight){
      tinesOnLeft *= 2;
      System.out.println("Odd " + tinesOnLeft);
    }else if(tinesOnRight > tinesOnLeft){
      tinesOnRight *= 2;
      System.out.println("Odd " + tinesOnRight);
    }else if((tinesOnLeft + tinesOnRight) % 2 == 0)
      System.out.println("Even " + (tinesOnLeft + tinesOnRight));
  }
}
