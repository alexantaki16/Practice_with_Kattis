import java.util.Scanner;
public class NastyHacks{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Create and store all in values
    int cases = input.nextInt();
    int revWithoutAds = input.nextInt();
    int revWithAds = input.nextInt();
    int costOfAds = input.nextInt();

    // Use if statements to determine whether to advertise or not
    if(revWithAds - revWithoutAds == costOfAds)
      System.out.println("does not matter");
    else if(revWithoutAds < costOfAds && revWithAds < costOfAds)
      System.out.println("do not advertise");
    else if (revWithAds > costOfAds)
      System.out.println("advertise");
  }
}
