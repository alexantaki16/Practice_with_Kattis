import java.util.Scanner;

public class TakeTwoStones{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int myInt = input.nextInt();
    if(myInt % 2 == 0)
      System.out.println("Bob");
    else
      System.out.println("Alice");  
  }
}
