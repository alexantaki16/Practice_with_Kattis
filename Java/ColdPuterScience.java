import java.util.Scanner;
public class ColdPuterScience{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int counter = 0;

    int numOfTemps = input.nextInt();
    int[] recordedTemps = new int[numOfTemps];

    for(int i = 0; i < recordedTemps.length; i++){
      recordedTemps[i] = input.nextInt();
      if(recordedTemps[i] < 0)
        counter++;
    }
    System.out.println(counter);
  }
}
