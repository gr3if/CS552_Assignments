//CS572, Homework3, Ariel Smith
import java.util.*;
public class Homework3 {
  public static final Scanner in = new Scanner(System.in);
  public static void main(String[] arg) {

	ArrayList<Integer> aA = new ArrayList<Integer>();
		aA.add(1);
		aA.add(2);
		aA.add(3);
	ArrayList<Integer> aB = new ArrayList<Integer>();
	ArrayList<Integer> aC = new ArrayList<Integer>();
		aC.add(1);
		aC.add(2);
		aC.add(3);
		aC.add(4);
		aC.add(5);
		aC.add(6);
	ArrayList<Integer> aD = new ArrayList<Integer>();
		aD.add(1);
	ArrayList<Integer> aE = new ArrayList<Integer>();
		aE.add(1);
		aE.add(1);
		aE.add(1);
		aE.add(1);
		aE.add(1);
	ArrayList<Integer> aF = new ArrayList<Integer>();
		aF.add(1);
		aF.add(1);
	ArrayList<Integer> aG = new ArrayList<Integer>();
		aG.add(1);
		aG.add(2);
	ArrayList<Integer> aH = new ArrayList<Integer>();
		aH.add(1);
		aH.add(2);
		aH.add(1);
		aH.add(1);
		aH.add(1);
	ArrayList<Integer> aI = new ArrayList<Integer>();
		aI.add(1);
		aI.add(1);
		aI.add(1);
		aI.add(1);
		aI.add(2);
	ArrayList<Integer> aJ = new ArrayList<Integer>();
		aJ.add(2);
		aJ.add(1);
		aJ.add(1);
		aJ.add(1);
		aJ.add(1);
	ArrayList<Integer> aK = new ArrayList<Integer>();
		aK.add(5);
		aK.add(2);
		aK.add(10);
		aK.add(9);
		aK.add(55);
		aK.add(3);
		aK.add(2);
	ArrayList<Integer> aL = new ArrayList<Integer>();
		aL.add(2);
		aL.add(1);
		aL.add(3);
		aL.add(5);
		aL.add(4);
	ArrayList<Integer> aM = new ArrayList<Integer>();
		aM.add(1);
		aM.add(2);
		aM.add(3);
		aM.add(5);
		aM.add(4);
	ArrayList<Integer> aN = new ArrayList<Integer>();
		aN.add(2);
		aN.add(1);
		aN.add(3);
		aN.add(4);
		aN.add(5);
	ArrayList<Integer> aO = new ArrayList<Integer>();
		aO.add(0);
	ArrayList<Integer> aP = new ArrayList<Integer>();
		aP.add(0);
		aP.add(1);
	ArrayList<Integer> aQ = new ArrayList<Integer>();
		aQ.add(1);
		aQ.add(0);
		aQ.add(2);
		aQ.add(0);
		aQ.add(3);
		aQ.add(0);
	ArrayList<Integer> aR = new ArrayList<Integer>();
		aR.add(1);
		aR.add(0);
		aR.add(-2);
		aR.add(3);
		aR.add(0);
		aR.add(2);
	ArrayList<Integer> aS = new ArrayList<Integer>();
		aS.add(1);
		aS.add(1);
		aS.add(9);
		aS.add(9);
		aS.add(3);
		aS.add(1);
		aS.add(3);
		aS.add(5);
		aS.add(5);
		aS.add(5);
		aS.add(6);
	ArrayList<Double> aT = new ArrayList<Double>();
	ArrayList<Double> aU = new ArrayList<Double>();
		aU.add(1.0);
	ArrayList<Double> aV = new ArrayList<Double>();
		aV.add(1.0);
		aV.add(2.0);
		aV.add(3.0);
		aV.add(4.0);
		aV.add(5.0);
		aV.add(6.0);
	ArrayList<Double> aW = new ArrayList<Double>();
		aW.add(-1.0);
		aW.add(2.0);
		aW.add(-3.0);
		aW.add(4.0);
		aW.add(-5.0);
		aW.add(6.0);
	ArrayList<String> aX = new ArrayList<String>();
		aX.add("I'm ");
		aX.add("a ");
		aX.add("cucumber.");
	ArrayList<String> aY = new ArrayList<String>();
		aY.add("I");
		aY.add("sadly");
		aY.add("am");
		aY.add("not");
		aY.add("sorry");
	ArrayList<String> aZ = new ArrayList<String>();
		aZ.add("wat");
	ArrayList<String> bA = new ArrayList<String>();
		bA.add("be");
		bA.add("gone");
	ArrayList<String> bB = new ArrayList<String>();
	ArrayList<String> bC = new ArrayList<String>();
		bC.add("Blah");
		bC.add("blah");
		bC.add("blah");
	ArrayList<String> bD = new ArrayList<String>();
		bD.add(" ");
	ArrayList<String> bE = new ArrayList<String>();
		bE.add("Hello,");
		bE.add("I");
		bE.add("Love");
		bE.add("you");
		bE.add("won't");
		bE.add("you");
		bE.add("tell");
		bE.add("me");
		bE.add("your");
		bE.add("name");


    System.out.println("SHOW==========================");
    show(aA);
    show(aB);
    show(aC);
    System.out.println("==============================");
    System.out.println();

    System.out.println("REVERSE=======================");
	show(reverse(aA));
	show(reverse(aB));
	show(reverse(aC));
	System.out.println("==============================");
   	System.out.println();

   	System.out.println("MAX===========================");
	show(max(aA, aC));
	show(max(aB, aB));
	show(max(aA, aB));
	show(max(aB, aA));
	show(max(aC, aA));
	System.out.println("==============================");
   	System.out.println();

   	System.out.println("ALLSAME=======================");
	System.out.println(allSame(aD)); //true
	System.out.println(allSame(aC)); //false
	System.out.println(allSame(aE)); //true
	System.out.println(allSame(aF)); //true
	System.out.println(allSame(aG)); //false
	System.out.println(allSame(aH)); //false
	System.out.println(allSame(aI)); //false
	System.out.println(allSame(aJ)); //false
	System.out.println("==============================");
   	System.out.println();


   	System.out.println("ALLDIFFERENT==================");
   	System.out.println(allDifferent(aB));
   	System.out.println(allDifferent(aD));
   	System.out.println(allDifferent(aK));
   	System.out.println(allDifferent(aE));
   	System.out.println(allDifferent(aJ));
   	System.out.println(allDifferent(aI));
   	System.out.println("==============================");
   	System.out.println();

   	System.out.println("INCREASING====================");
	System.out.println(increasing(aB));
	System.out.println(increasing(aD));
	System.out.println(increasing(aC));
	System.out.println(increasing(aL));
	System.out.println(increasing(aM));
	System.out.println(increasing(aN));
	System.out.println("==============================");
   	System.out.println();

    System.out.println("NONZERO=======================");
 	show(nonzero(aB));
 	show(nonzero(aO));
 	show(nonzero(aP));
 	show(nonzero(aQ));
 	show(nonzero(aR));
 	System.out.println("==============================");
   	System.out.println();

   	System.out.println("WITHOUTREPEATS================");
   	show(withoutRepeats(aB));
   	show(withoutRepeats(aD));
   	show(withoutRepeats(aF));
   	show(withoutRepeats(aP));
   	show(withoutRepeats(aS));
   	System.out.println("==============================");
   	System.out.println();

   	System.out.println("STATS=========================");
   	ifNull(stats(aT));
   	showDouble(stats(aU));
   	showDouble(stats(aV));
   	showDouble(stats(aW));
   	System.out.println("==============================");
   	System.out.println();

   	System.out.println("CONCAT========================");
	System.out.println(concat(bB));
	System.out.println(concat(aX));
	System.out.println(concat(aY));
	System.out.println(concat(aZ));
	System.out.println(concat(bA));
	System.out.println("==============================");
   	System.out.println();

   	System.out.println("FIND==========================");
   	System.out.println(find("blah", bC));
   	System.out.println(find("", bB));
   	System.out.println(find(" ", bB));
   	System.out.println(find("", bD));
   	System.out.println(find("love", bE));
   	System.out.println("==============================");
   	System.out.println();

  }



  // function for null array lists (double)
  public static void ifNull(ArrayList<Double> a) {
	  if (a == null) {
		  System.out.println("null array");
	  }
  }

    // show function for doubles
      public static void showDouble(ArrayList<Double> a) {
        System.out.print("{");
        for (int i = 0; i < a.size(); i++) {
          System.out.print(a.get(i));
          if (i < a.size() - 1)
            System.out.print(", ");
        }
        System.out.println("}");
  }

  // NOTE: bubbleSort function not called for in assignment,
  // added for any functions that might need it.
  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> a) {
	  boolean flag = true;
	  int temp;

	  while (flag == true) {
		  flag = false;
		  for (int i = 0; i < (a.size() -1); i++) {
			  if (a.get(i) > a.get(i+1)) {
				  temp = a.get(i);
				  a.set(i, a.get(i+1));
				  a.set((i+1), temp);
				  flag = true;
			  }
		  }
	  }
	  return a;
   }

  // function that prints array lists (ints only)
  public static void show(ArrayList<Integer> a) {
    System.out.print("{");
    for (int i = 0; i < a.size(); i++) {
      System.out.print(a.get(i));
      if (i < a.size() - 1)
        System.out.print(", ");
    }
    System.out.println("}");
  }

  // creates a new array list of same length as a
  // and enters a's values in reverse order
  public static ArrayList<Integer> reverse(ArrayList<Integer> a) {
	  ArrayList<Integer> b = new ArrayList<Integer>();
	  for(int i = 0; i < a.size(); i++) {
		  b.add(a.get((a.size() - 1) - i));
	  }
	  return b;
  }

    // creates an array list whose length and contents
    // are the same as the longer array list
    public static ArrayList<Integer> max(ArrayList<Integer> a, ArrayList<Integer> b) {
  	  ArrayList<Integer> c = new ArrayList<Integer>();
  	  if (a.size() >= b.size()) {
  	  	for (int i = 0; i < a.size(); i++)
  			c.add(a.get(i));
  		return c;
  	  }
  	  else {
  		  for (int j = 0; j < b.size(); j++)
  		  	c.add(b.get(j));
  		  return c;
  	  }
  }

    // Checks to see if all the values in the
    // array list are the same.
    public static boolean allSame(ArrayList<Integer> a) {
  	  boolean allValsSame = false;
  	  if (a.size() <= 1){
  	  	allValsSame = true;
  	  	return allValsSame;
  	  }
  	  for (int i = 0; i < a.size(); i++) {
  		  if (i < (a.size() - 1)) {
  		  	int currentVal = a.get(i);
  		  	if (currentVal == a.get(i+1))
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
    // array list are different.
    public static boolean allDifferent (ArrayList<Integer> a) {
  	  	  boolean allValsDiff = false;
  	  	  if (a.size() <= 1){
  	  	  	allValsDiff = true;
  	  	  	return allValsDiff;
  	  	  }
  	  	  ArrayList<Integer> b = bubbleSort(a);
  	  	  for (int i = 0; i < b.size(); i++) {
  			  if (i < (b.size() - 1)) {
  				  int currentVal = b.get(i);
  				  if (currentVal != b.get(i+1))
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
    // list are in increasing order
    public static boolean increasing(ArrayList<Integer> a) {
  	  boolean valsIncr = true;
  	  if (a.size() <= 1) {
  		  return valsIncr;
  	  }
  	  for (int i = 0; i < a.size(); i++) {
  		  if (i < (a.size() - 1)) {
  			  if(a.get(i) > a.get(i+1)) {
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

    // Creates a second array list that has all
    // the nonzero values of a
    public static ArrayList<Integer> nonzero(ArrayList<Integer> a) {
  	  ArrayList<Integer> b = new ArrayList<Integer>();
  	  for (int j = 0; j < a.size(); j++) {
  		  if (a.get(j) != 0) {
  			  b.add(a.get(j));
  		  }
  	  }
  	  return b;
  }

    // Creates an array list that has only a's
    // non-consecutively-repeated values
    public static ArrayList<Integer> withoutRepeats(ArrayList<Integer> a) {
  	  ArrayList<Integer> b = new ArrayList<Integer>();
  	  for (int j = 0; j < a.size(); j++) {
  		  if (j < (a.size() - 1)) {
  			  if (a.get(j) != a.get(j+1)) {
  				  b.add(a.get(j));
  			  }
  		  }
  		  else {
  			  b.add(a.get(j));
  		  }
  	  }
  	  return b;
  }

    // Creates an array that finds the lowest number,
    // average, highest number, sum, and product of
    // all the values in a
    public static ArrayList<Double> stats(ArrayList<Double> a) {
  	  if (a.size() == 0)
  	  	return null;
  	  ArrayList<Double> statsArray = new ArrayList<Double>();
  	  // find & assign min
  	  double min = a.get(0);
  	  for (int i = 1; i < a.size(); i++) {
  		  if (a.get(i) < a.get(i-1))
  			  min = a.get(i);
  	  }
  	  statsArray.add(min);
  	  // find & assign avg
  	  double avg = 0;
  	  double sum = 0;
  	  for (int j = 0; j < a.size(); j++)
  		  sum += a.get(j);
  	  avg = sum / a.size();
  	  statsArray.add(avg);
  	  // find & assign max
  	  double max = a.get(0);
  	  for (int k = 1; k < a.size(); k++) {
  		  if (a.get(k) > a.get(k-1))
  		  	max = a.get(k);
  	  }
  	  statsArray.add(max);
  	  // sum found above, assign
  	  statsArray.add(sum);
  	  // find & assign prod
  	  double prod = a.get(0);
  	  for (int m = 1; m < a.size(); m++) {
  		  prod *= a.get(m);
  	  }
  	  statsArray.add(prod);
  	  return statsArray;
  }

    // concatenates all the elements of a
    public static String concat(ArrayList<String> a) {
  	  String concatString = "";
  	  for (int i = 0; i < a.size(); i++)
  		  concatString += a.get(i);
  	  return concatString;
  }

    // Finds the first occurrence of a particular string in an
    // array list of strings
    public static int find(String needle, ArrayList<String> haystack) {
  	  for (int i = 0; i < haystack.size(); i++) {
  		  if (haystack.get(i) == needle) {
  			  return i;
  		  }
  	  }
  	  return -1;
  }

}
