import java.util.*;
public class Kornislav {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Create an array to store the input and use a for loop to populate it
    int[] directions = new int[4];
    for(int i = 0; i < directions.length; i++){
      directions[i] = input.nextInt();
    }
    //Sort the array to easily locate the smalles and second to lagerst values
    Arrays.sort(directions);

    //Store the rectangle and display it
    int rectangle = directions[0] * directions[2];
    System.out.println(rectangle);
  }
}
