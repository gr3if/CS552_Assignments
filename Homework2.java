//CS572, Homework2, Ariel Smith
import java.util.*;
public class Homework2 {
  public static final Scanner in = new Scanner(System.in);
  public static void main(String[] arg) {
    System.out.println("SHOW==========================");
    show(new int[]{1, 2, 3});
    show(new int[]{});
    show(new int[]{1, 2, 3, 4, 5, 6});
    System.out.println("==============================");
    System.out.println();

    System.out.println("REVERSE=======================");
    show(reverse(new int[]{1, 2, 3}));
	show(reverse(new int[]{}));
	show(reverse(new int[]{1, 2, 3, 4, 5, 6}));
	System.out.println("==============================");
   	System.out.println();

    System.out.println("MAX===========================");
    show(max(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4, 5, 6}));
 	show(max(new int[]{}, new int[]{}));
 	show(max(new int[]{1, 2, 3}, new int[]{}));
 	show(max(new int[]{}, new int[]{1, 2, 3}));
 	show(max(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3}));
 	System.out.println("==============================");
   	System.out.println();

    System.out.println("ALLSAME=======================");
	System.out.println(allSame(new int[]{1})); //true
	System.out.println(allSame(new int[]{1, 2, 3, 4, 5, 6})); //false
	System.out.println(allSame(new int[]{1, 1, 1, 1, 1})); //true
	System.out.println(allSame(new int[]{1, 1})); //true
	System.out.println(allSame(new int[]{1, 2})); //false
	System.out.println(allSame(new int[]{1, 2, 1, 1, 1})); //false
	System.out.println(allSame(new int[]{1, 1, 1, 1, 2})); //false
	System.out.println(allSame(new int[]{2, 1, 1, 1, 1})); //false
	System.out.println("==============================");
   	System.out.println();

   	System.out.println("ALLDIFFERENT==================");
   	System.out.println(allDifferent(new int[]{}));
   	System.out.println(allDifferent(new int[]{1}));
   	System.out.println(allDifferent(new int[]{5, 1, 4, 2, 3, 2}));
   	System.out.println(allDifferent(new int[]{1,1,1}));
   	System.out.println(allDifferent(new int[]{2,2,2,1}));
   	System.out.println(allDifferent(new int[]{2,1,1,1,1}));
   	System.out.println("==============================");
   	System.out.println();

   	System.out.println("INCREASING====================");
   	System.out.println(increasing(new int[]{}));
   	System.out.println(increasing(new int[]{1}));
   	System.out.println(increasing(new int[]{1, 2, 3, 4, 5}));
   	System.out.println(increasing(new int[]{2, 1, 3, 5, 4}));
   	System.out.println(increasing(new int[]{1, 2, 3, 5, 4}));
   	System.out.println(increasing(new int[]{2, 1, 3, 4, 5}));
   	System.out.println("==============================");
   	System.out.println();

   	System.out.println("NONZERO=======================");
	show(nonzero(new int[]{}));
	show(nonzero(new int[]{0}));
	show(nonzero(new int[]{0, 1}));
	show(nonzero(new int[]{1, 0, 2, 0, 3, 0}));
	show(nonzero(new int[]{1, 0, -2, 4, 0, 6, 5, 0}));
	System.out.println("==============================");
   	System.out.println();

   	System.out.println("WITHOUTREPEATS================");
   	show(withoutRepeats(new int[]{}));
   	show(withoutRepeats(new int[]{1}));
   	show(withoutRepeats(new int[]{1, 1}));
   	show(withoutRepeats(new int[]{1, 0}));
   	show(withoutRepeats(new int[]{1, 1, 9, 9, 3, 1, 3, 5, 5, 5, 6}));
   	System.out.println("==============================");
   	System.out.println();

   	System.out.println("STATS=========================");
   	ifNull(stats(new double[]{}));
   	show(stats(new double[]{1.0}));
   	show(stats(new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0}));
   	show(stats(new double[]{-1.0, 2.0, -3.0, 4.0, -5.0, 6.0}));
   	System.out.println("==============================");
   	System.out.println();

   	System.out.println("CONCAT========================");
   	System.out.println(concat(new String[]{}));
   	System.out.println(concat(new String[]{"I'm ", "a ", "cucumber "}));
   	System.out.println(concat(new String[]{"I", "sadly", "am", "not", "sorry"}));
   	System.out.println(concat(new String[]{"wat"}));
   	System.out.println(concat(new String[]{"be", "gone"}));
   	System.out.println("==============================");
   	System.out.println();

   	System.out.println("FIND==========================");
   	System.out.println(find("blah", new String[]{"Blah", "blah", "blah"}));
   	System.out.println(find("", new String[]{}));
   	System.out.println(find(" ", new String[]{}));
   	System.out.println(find("", new String[]{" "}));
   	System.out.println(find("love", new String[]{"Hello,", "I", "Love", "you", "won't", "you", "tell", "me", "your", "name"}));
   	System.out.println("==============================");
   	System.out.println();
  }



  // NOTE: bubbleSort function not called for in assignment,
  // added for any functions that might need it.
  public static int[] bubbleSort(int[] a) {
	  boolean flag = true;
	  int temp;

	  while (flag == true) {
		  flag = false;
		  for (int i = 0; i < (a.length -1); i++) {
			  if (a[i] > a[i+1]) {
				  temp = a[i];
				  a[i] = a[i+1];
				  a[i+1] = temp;
				  flag = true;
			  }
		  }
	  }
	  return a;
   }

  // function for null arrays (double)
  public static void ifNull(double[] a) {
	  if (a == null) {
		  System.out.println("null array");
	  }
  }

  // function that prints arrays (ints only)
  public static void show(int[] a) {
    System.out.print("{");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      if (i < a.length - 1)
        System.out.print(", ");
    }
    System.out.println("}");
  }

  // show function for doubles
    public static void show(double[] a) {
      System.out.print("{");
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]);
        if (i < a.length - 1)
          System.out.print(", ");
      }
      System.out.println("}");
  }

  // creates a new array of same length as a
  // and enters a's values in reverse order
  public static int[] reverse(int[] a) {
	  int[] b = new int[a.length];
	  for(int i = 0; i < a.length; i++) {
		  b[i] = a[((a.length - 1) - i)];
	  }
	  return b;
  }

  // creates an array whose length and contents
  // are the same as the longer array
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

  // Checks to see if all the values in the
  // array are the same.
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

  // Checks to see if all the values in the
  // array are different.
  public static boolean allDifferent (int[] a) {
	  	  boolean allValsDiff = false;
	  	  if (a.length <= 1){
	  	  	allValsDiff = true;
	  	  	return allValsDiff;
	  	  }
	  	  int[] b = bubbleSort(a);
	  	  for (int i = 0; i < b.length; i++) {
			  if (i < (b.length - 1)) {
				  int currentVal = b[i];
				  if (currentVal != b[i+1])
				  	allValsDiff = true;
				  else {
					  allValsDiff = false;
					  return allValsDiff;
				  }
			  }
		  }
	  return allValsDiff;
  }

  // Checks to see if the values in the array
  // are in increasing order
  public static boolean increasing(int[] a) {
	  boolean valsIncr = true;
	  if (a.length <= 1) {
		  return valsIncr;
	  }
	  for (int i = 0; i < a.length; i++) {
		  if (i < (a.length - 1)) {
			  if(a[i] > a[i+1]) {
				  valsIncr = false;
				  return valsIncr;
			  }
			  else {
				  valsIncr = true;
			  }
		  }
	  }
	  return valsIncr;
  }

  // Creates a second array that has all
  // the nonzero values of a
  public static int[] nonzero(int[] a) {
	  int aSize = 0;
	  for (int i = 0; i < a.length; i++) {
		  if (a[i] != 0) {
			  aSize += 1;
		  }
	  }
	  int[] b = new int[aSize];
	  int bIndex = 0;
	  for (int j = 0; j < a.length; j++) {
		  if (a[j] != 0) {
			  b[bIndex] = a[j];
			  bIndex += 1;
		  }
	  }
	  return b;
  }

  // Creates an array that has only a's
  // non-consecutively-repeated values
  public static int[] withoutRepeats(int[] a) {
	  int aSize = 0;
	  for (int i = 0; i < a.length; i++) {
		  if (i < (a.length - 1)){
			  if (a[i] != a[i+1])
			  	aSize += 1;
		  }
		  else {
			  aSize += 1;
		  }
	  }
	  int[] b = new int[aSize];
	  int bIndex = 0;
	  for (int j = 0; j < a.length; j++) {
		  if (j < (a.length - 1)) {
			  if (a[j] != a[j+1]) {
				  b[bIndex] = a[j];
				  bIndex += 1;
			  }
		  }
		  else {
			  b[bIndex] = a[j];
		  }
	  }
	  return b;
  }

  // Creates an array that finds the lowest number,
  // average, highest number, sum, and product of
  // all the values in a
  public static double[] stats(double[] a) {
	  if (a.length == 0)
	  	return null;
	  double[] statsArray = new double[5];
	  // find & assign min
	  double min = a[0];
	  for (int i = 1; i < a.length; i++) {
		  if (a[i] < a[i-1])
			  min = a[i];
	  }
	  statsArray[0] = min;
	  // find & assign avg
	  double avg = 0;
	  double sum = 0;
	  for (int j = 0; j < a.length; j++)
		  sum += a[j];
	  avg = sum / a.length;
	  statsArray[1] = avg;
	  // find & assign max
	  double max = a[0];
	  for (int k = 1; k < a.length; k++) {
		  if (a[k] > a[k-1])
		  	max = a[k];
	  }
	  statsArray[2] = max;
	  // sum found above, assign
	  statsArray[3] = sum;
	  // find & assign prod
	  double prod = a[0];
	  for (int m = 1; m < a.length; m++) {
		  prod *= a[m];
	  }
	  statsArray[4] = prod;
	  return statsArray;
  }

  // concatenates all the elements of a
  public static String concat(String[] a) {
	  String concatString = "";
	  for (int i = 0; i < a.length; i++)
		  concatString += a[i];
	  return concatString;
  }

  // Finds the first occurrence of a particular string in an
  // array of strings
  public static int find(String needle, String[] haystack) {
	  for (int i = 0; i < haystack.length; i++) {
		  if (haystack[i] == needle) {
			  return i;
		  }
	  }
	  return -1;
  }
}
