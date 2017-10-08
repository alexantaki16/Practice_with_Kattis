import java.util.Scanner;
public class JudgingMoose{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int tinesOnLeft = input.nextInt();
    int tinesOnRight = input.nextInt();

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
