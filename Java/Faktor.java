import java.util.Scanner;
public class Faktor{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Create an array of size 2 and input the values
    int[] myValues = new int[2];
    for(int i = 0; i < 2; i++){
      myValues[i] = input.nextInt();
    }

    //Decrement impact factor by one and multiply
    myValues[1] -= 1;
    int formula = myValues[1] * myValues[0];

    //Take the answer and round up
    formula += 1;

    System.out.println(formula);
  }
}
