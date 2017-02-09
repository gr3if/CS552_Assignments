// PROGRAM TO CALCULATE THE VOLUME OF A CIRCLE
import java.util.*;
public class Homework1B {
  public static final Scanner in = new Scanner(System.in);
  public static void main(String[] arg) {
    double final pi = 3.14159265358979323846;
    System.out.print("Radius: ");
    double radius = in.nextDouble();
    double volume = Math.pow(((4 / 3) * pi * radius), 3);
    System.out.print("Volume is " + volume);
  }
}
