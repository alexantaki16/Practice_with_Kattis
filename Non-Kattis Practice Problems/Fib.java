import java.util.Scanner;
public class Fib{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int fibIterations = input.nextInt();
    int prevValue = 0;
    int currentValue = 1;
    int nextNum = 0;

    for(int i = 0; i < fibIterations; i++){
      nextNum = prevValue + currentValue;
      prevValue = currentValue;
      currentValue = nextNum;
    }
    System.out.println(currentValue);
  }
}
