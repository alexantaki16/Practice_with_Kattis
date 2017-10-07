import java.util.Scanner;
public class Spavanac{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

      //Create an array of ints and store values in it
      int[] time = new int[2];
      for(int i = 0; i < 2; i++){
        time[i] = input.nextInt();
      }

      //Create the time change of 45 minutes and use nested ifs to test the values
      int convertedTime= time[1] - 45;
      if(convertedTime < 0){
        convertedTime += 60;
        time[0] -= 1;
        if(time[0] < 0){
          time[0] = 24 - 1;
        }
      }

       //Print each value
       System.out.print(time[0] + " " + convertedTime);
       System.out.println();
   }
}
