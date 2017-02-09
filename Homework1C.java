// PROGRAM TO CALCULATE THE SQUARE AND THE
// "MIDDLE" OF AN INT, X
import java.util.*;
public class Homework1C {
  public static final Scanner in = new Scanner(System.in);
  public static void main(String[] arg) {
    System.out.print("#: ");
    int num = in.nextInt();
    int square = num * num;
    String numStr = Integer.toString(num);
    String middle = numStr.substring(1, 3);
    System.out.println("Square is " + square + ", middle is " + middle);
  }
}
