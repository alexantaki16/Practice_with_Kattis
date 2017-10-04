import java.util.Scanner;

public class MyClass{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int spellCount = input.nextInt();
    for(int i = 1; i < spellCount + 1; i++){
      System.out.println(i + " Abracadabra");
    }
  }
}
