//CS572, Homework1G, Ariel Smith
// PROGRAM THAT DOES A BUNCH OF UNRELATED,
// INCONSEQUENTIAL THINGS
import java.util.*;
public class Homework1G {
  public static final Scanner in = new Scanner(System.in);
  public static void main(String[] arg) {
    System.out.println("TRIANGLE");
    System.out.print("Int: ");
    int tri = triangle(in.nextInt());
    System.out.println("Triangle function returns: " + tri);
    System.out.println();

    System.out.println("MULTIPLY");
    System.out.print("Int A: ");
    int multiplicand = in.nextInt();
    System.out.print("Int B: ");
    int multiplier = in.nextInt();
    int finalProduct = multiply(multiplicand, multiplier);
    System.out.println(multiplicand + " * " + multiplier + " = " + finalProduct);
    System.out.println();

    System.out.println("SQUARE");
    System.out.print("Int: ");
    int squareSize = in.nextInt();
    square(squareSize);
    System.out.println();

    System.out.println("HOLLOWSQUARE");
    System.out.print("Int: ");
    int secondSquareSize = in.nextInt();
    hollowSquare(secondSquareSize);
    System.out.println();

    System.out.println("FACTORIAL");
    System.out.print("Int: ");
    long factorialLong = in.nextLong();
    long factorialOfLong = factorial(factorialLong);
    System.out.println("Factorial of above number: " + factorialOfLong);
    System.out.println();

    System.out.println("FIBONACCI");
    System.out.print("Int: ");
    int fibInt = in.nextInt();
    long fibonacciSequence = fibonacci(fibInt);
    System.out.println("Fibonacci of above int: " + fibonacciSequence);
    System.out.println();

    System.out.println("PRIME");
    System.out.print("Int: ");
    long isPrimeLong = in.nextLong();
    boolean isPrimeBool = prime(isPrimeLong);
    if (isPrimeBool == true) {
      System.out.println(isPrimeLong + " is a prime number.");
    }
    else {
      System.out.println(isPrimeLong + " is NOT a prime number.");
    }
    System.out.println();
  }




  public static int triangle (int n) {
    int sum = n;
    if (n >= 0) {
      for (int i = 1; i < n; i++) {
        sum = sum + i;
      }
    }
    else {
      for (int j = -1; j > n; j--) {
        sum = sum + j;
      }
    }
    return sum;
  }

  public static int multiply (int a, int b) {
    int product = 0;
    if (b >= 0){
      for (int i = 0; i < b; i++) {
        product = product + a;
      }
    }
    else {
      for (int j = 0; j > b; j--) {
        product = product + a;
      }
      product = -product;
    }
    return product;
  }

  public static void square (int size) {
    while (size < 0) {
      System.out.println("square function only takes positive ints.");
      System.out.print("Please enter a positive int: ");
      size = in.nextInt();
    }
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void hollowSquare(int size) {
    while (size < 0) {
      System.out.println("hollowSquare function only takes positive ints.");
      System.out.print("Please enter a positive int: ");
      size = in.nextInt();
    }
    for (int i = 0; i < size; i++) {
      if ((i == 0) || (i == (size - 1))){
        for (int j = 0; j < size; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
      else {
        for (int k = 0; k < size; k++) {
          if ((k == 0) || (k == (size - 1))){
            System.out.print("*");
          }
          else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  }

  public static long factorial (long n) {
    while (n < 0) {
      System.out.println("factorial function only takes positive ints.");
      System.out.println("Converting to a positive int...");
      n = -n;
    }
    long product = n;
    for (long i = 1; i < n; i++) {
      product = product * i;
    }
    return product;
  }

  public static long fibonacci (int n) {
    long sum = 0;
    long num1 = 0;
    long num2 = 1;
    if (n < 0) {
      System.out.println("fibonacci function only takes positive ints.");
      System.out.println("Converting to a positive int...");
      n = -n;
    }
    if (n == 0) {
      return sum;
    }
    else if (n == 1) {
      return sum + 1;
    }
    else {
      for (int i = 2; i <= n; i++) {
        sum = num1 + num2;
        num1 = num2;
        num2 = sum;
      }
      return sum;
    }
  }

  public static boolean prime(long n) {
    boolean isPrime = false;
    if ((n < 4) && (n > 1)) {
      isPrime = true;
    }
    else if (!(n % 2 == 0)) {
      for (long f = 3; f <= n; f += 2){
        if (f > (n/f)){
          isPrime = true;
          break;
        }
        else if((n % f) == 0) {
          break;
        }
      }
    }
    return isPrime;
  }
}
