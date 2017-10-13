import java.util.Scanner;
public class FindingtheMissingValue{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int[] myFirstArray = new int[5];
    int[] mySecondArray = new int[4];
    int sumOfArrayOne = 0;
    int sumOfArrayTwo = 0;

    for(int i = 0; i < myFirstArray.length; i++){
      myFirstArray[i] = input.nextInt();
      sumOfArrayOne += myFirstArray[i];
    }

    for(int j = 0; j < mySecondArray.length; j++){
      mySecondArray[j] = input.nextInt();
      sumOfArrayTwo += mySecondArray[j];
    }

    System.out.println(sumOfArrayOne - sumOfArrayTwo);
  }
}
