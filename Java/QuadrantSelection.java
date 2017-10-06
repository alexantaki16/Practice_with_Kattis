import java.util.Scanner;

public class QuadrantSelection{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int[] coordinates = new int[2];
    for(int i = 0; i < 2; i++){
      coordinates[i] = input.nextInt();
    }

    if(coordinates[0] >= 0 && coordinates[1] >= 0)
      System.out.println("1");
    else if(coordinates[0] < 0 && coordinates[1] >= 0)
      System.out.println("2");
    else if(coordinates[0] < 0 && coordinates[1] <= 0)
      System.out.println("3");
    else
      System.out.println("4");  
  }
}
