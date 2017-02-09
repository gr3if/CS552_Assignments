// PROGRAM TO CALCULATE HOW MANY CARTONS ARE NEEDED
// FOR X NUMBER OF EGGS
import java.util.*;
public class Homework1A {
  public static final Scanner in = new Scanner(System.in);
  public static void main(String[] arg) {
    System.out.print("Eggs: ");
    int eggs = in.nextInt();
    int cartons = eggs / 12;
    System.out.print(cartons + " cartons");
  }
}
