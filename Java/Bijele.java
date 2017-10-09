import java.util.Scanner;
public class Bijele{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Create an array and store the values for the beginning set
    int[] beginningPieces = {1, 1, 2, 2, 2, 8};

    //Create an array and input the values
    int[] chessPiece = new int[6];
    for(int i = 0; i < chessPiece.length; i++){
      chessPiece[i] = input.nextInt();
    }

    //Create an array and input the values again
    //Subtract the new pieces from the original set to determine if Mirko needs
    //to add or remove pieces and print the results
    int[] myOutput = new int[6];
    for(int i = 0; i < myOutput.length; i++){
      myOutput[i] = beginningPieces[i] - chessPiece[i];
      System.out.print(myOutput[i] + " ");
    }
    System.out.println();
  }
}
