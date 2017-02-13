//CS572, Homework1D, Ariel Smith
// PROGRAM TO TAKE THREE DOUBLES
// AND OUTPUT THE LARGEST
import java.util.*;
public class Homework1D {
  public static final Scanner in = new Scanner(System.in);
  public static void main(String[] arg) {
    System.out.print("First #: ");
    double num1 = in.nextDouble();
    System.out.print("Second #: ");
    double num2 = in.nextDouble();
    System.out.print("Third #: ");
    double num3 = in.nextDouble();
    if ((num1 >= num2) && (num1 >= num3)) {
      System.out.println(num1 + " is the largest");
    }
    else if ((num2 >= num1) && (num2 >= num3)) {
      System.out.println(num2 + " is the largest");
    }
    else {
      System.out.println(num3 + " is the largest");
    }
  }
}
