//CS572, Homework2, Ariel Smith
import java.util.*;
public class Homework2 {
  public static final Scanner in = new Scanner(System.in);
  public static void main(String[] arg) {
    System.out.println("SHOW");
    show(new int[]{1, 2, 3});
    show(new int[]{});
    show(new int[]{1, 2, 3, 4, 5, 6});
    System.out.println();

    System.out.println("REVERSE");
    show(reverse(new int[]{1, 2, 3}));
	show(reverse(new int[]{}));
	show(reverse(new int[]{1, 2, 3, 4, 5, 6}));
   	System.out.println();

    System.out.println("MAX");
    show(max(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4, 5, 6}));
 	show(max(new int[]{}, new int[]{}));
 	show(max(new int[]{1, 2, 3}, new int[]{}));
 	show(max(new int[]{}, new int[]{1, 2, 3}));
 	show(max(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3}));
   	System.out.println();

    System.out.println("ALLSAME");
	System.out.println(allSame(new int[]{1})); //true
	System.out.println(allSame(new int[]{1, 2, 3, 4, 5, 6})); //false
	System.out.println(allSame(new int[]{1, 1, 1, 1, 1})); //true
	System.out.println(allSame(new int[]{1, 1})); //true
	System.out.println(allSame(new int[]{1, 2})); //false
	System.out.println(allSame(new int[]{1, 2, 1, 1, 1})); //false
	System.out.println(allSame(new int[]{1, 1, 1, 1, 2})); //false
	System.out.println(allSame(new int[]{2, 1, 1, 1, 1})); //false
   	System.out.println();
  }



  public static void show(int[] a) {
    System.out.print("{");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      if (i < a.length - 1)
        System.out.print(", ");
    }
    System.out.println("}");
  }

  public static int[] reverse(int[] a) {
	  int[] b = new int[a.length];
	  for(int i = 0; i < a.length; i++) {
		  b[i] = a[((a.length - 1) - i)];
	  }
	  return b;
  }

  public static int[] max(int[] a, int[] b) {
	  if (a.length >= b.length) {
	  	int[] c = new int[a.length];
	  	for (int i = 0; i < a.length; i++)
			c[i] = a[i];
		return c;
	  }
	  else {
		  int[] c = new int[b.length];
		  for (int j = 0; j < b.length; j++)
		  	c[j] = b[j];
		  return c;
	  }
  }

  public static boolean allSame(int[] a) {
	  boolean allValsSame = false;
	  if (a.length <= 1){
	  	allValsSame = true;
	  	return allValsSame;
	  }
	  for (int i = 0; i < a.length; i++) {
		  if (i < (a.length -1)) {
		  	int currentVal = a[i];
		  	if (currentVal == a[i+1])
		  		allValsSame = true;
		  	else {
				  allValsSame = false;
				  return allValsSame;
		  	}
	  	  }
	  }
	  return allValsSame;
  }

  public static boolean allDifferent (int[] a) {
	  	  boolean allValsDiff = false;
	  	  if (a.length <= 1){
	  	  	allValsDiff = true;
	  	  	return allValsDiff;
	  	  }
	  	  // --------note TO SELF: Might have to sort the array
	  	  // --------so that {10, 3, 10} becomes {3, 10, 10}, THEN
	  	  // --------Check as in allSame
	  	  /*
	  	  for (int i = 0; i < a.length; i++) {
	  		  if (i < (a.length -1)) {
	  		  	int currentVal = a[i];
	  		  	if (currentVal != a[i+1])
	  		  		allValsDiff = true;
	  		  	else {
	  				  allValsDiff = false;
	  				  return allValsDiff;
	  		  	}
	  	  	  }
	  	  }*/
	  return allValsDiff;
  }

}
