//CS572, Homework1E, Ariel Smith
// PROGRAM TO CALCULATE THE AREA
//OF A TRIANGLE
import java.util.*;
public class Homework1E {
  public static final Scanner in = new Scanner(System.in);
  public static void main(String[] arg) {
    System.out.print("Base: ");
    double base = in.nextDouble();
    System.out.print("Height: ");
    double height = in.nextDouble();
    double area = (base * height) / 2;
    System.out.println("Area is " + area);
  }
}
