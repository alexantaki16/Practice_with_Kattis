import java.util.Scanner;

public class R2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int[] values = new int[2];
    for(int i = 0; i < values.length; i++){
      values[i] = input.nextInt();
    }
    int R2 = (2*values[1]) - (values[0]);
    System.out.println(R2);
  }
}
