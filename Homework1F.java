//CS572, Homework1F, Ariel Smith
// PROGRAM TO CALCULATE THE NUMBER OF
// QUARTERS, DIMES, NICKELS, AND PENNIES
// NEEDED TO GET X AMOUNT OF MONEY
import java.util.*;
public class Homework1F {
  public static final Scanner in = new Scanner(System.in);
  public static void main(String[] arg) {
    System.out.print("Cents: ");
    int cents = in.nextInt();
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    int pennies = 0;
    if (cents >= 25) {
      quarters = cents / 25;
      cents = cents % 25;
    }
    if (cents >= 10) {
      dimes = cents / 10;
      cents = cents % 10;
    }
    if (cents >= 5) {
      nickels = cents / 5;
      cents = cents % 5;
    }
    if (cents >= 1) {
      pennies = cents;
    }
    System.out.println(quarters + " quarters");
    System.out.println(dimes + " dimes");
    System.out.println(nickels + " nickels");
    System.out.println(pennies + " pennies");
  }
}
