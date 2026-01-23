// All about RECURSION :-

/*
 * What is Recursion?
 * We can say that recursion is the another way to represent Iteration / Loops.
 * Whatever we can do using loops can also be done using recursion. At some
 * place the code with loops becomes more complicated so we use recursion and
 * vice-versa. Although we can solve the question of recursion with loops and
 * vice-versa but it all depends upon the question that by using which it can be
 * solved easily. When we learn about the concept trees and graphs, there we
 * will mostly use the concept of recursion.
 * 
 * Recursion basically means, a function that calls itself.
 * In programming, the main function calls a function and that functions calls
 * itself again and again until a BASE condition is reached. After reaching a
 * base condition we return back to the main function step-by-step and at each
 * step we return some value, if then value then i.e. if it is void then we just
 * return control.
 */

// Qs. Print Numbers from 5 to 1. (Using recursion)

// public class Recursions {
// public static void printNumbers(int n) {
// if (n == 0) {
// return;
// }

// System.out.println(n);
// printNumbers(n - 1);
// }

// public static void main(String[] args) {
// int n = 5;

// printNumbers(n);
// }
// }
/*---------------------------------------------------------------- */

/*
 * What happens in Memory during recursion?
 * => All the functions are stacked one over another until the base condition is
 * reached. And every stack created, creates all the variables again which
 * consumes memory and this is the major difference between Recursion and loops
 * (in loops extra memory is not consumed). So we must provide a base condition
 * to the recursion or else the memory will get full and Stack Overflow error
 * will occur.
 */

// Qs. Print Numbers from 1 to 5. (Using recursion)

// class Recursions {
// public static void printNumbers(int n) {
// // Base condition.
// if (n == 6) {
// return;
// }

// System.out.println(n);
// printNumbers(n + 1); // Recursion of printNumbers until base condition is
// reached.
// }

// public static void main(String[] args) {
// int n = 1; // Initializing the value of n.

// printNumbers(n); // calling printNumbers(n) once.
// }
// }
/*---------------------------------------------------------------- */

// Qs. Print sum of first n natural numbers: (Using recursion)

// class Recursions {
// public static void printSum(int i, int n, int sum) {
// if (i == n) {
// sum += i;
// System.out.println(sum);
// return;
// }

// sum += i;
// printSum(i + 1, n, sum);
// }

// public static void main(String[] args) {

// printSum(1, 5, 0);
// }
// }
/*---------------------------------------------------------------- */

// Qs. Print Factorial of a number n: (Using recursion)

// import java.util.*;

// class Recursions {
// public static int printFact(int n) {
// if (n == 1 || n == 0) {
// return 1;
// }

// int fact_nm1 = printFact(n - 1);
// int fact_n = n * fact_nm1;
// return fact_n;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int ans = printFact(n);
// System.out.println(ans);

// sc.close();
// }
// }
/*---------------------------------------------------------------- */

// Qs. Print the fibonacci sequence till nth term: (Using recursion)

// import java.util.*;

// class Recursions {
// public static void printFibonacci(int a, int b, int n) {
// if (n == 0) {
// return;
// }

// int c = a + b;
// System.out.println(c);
// printFibonacci(b, c, n - 1);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int a = 0;
// int b = 1;
// System.out.println(a);
// System.out.println(b);

// printFibonacci(a, b, n - 2);

// sc.close();
// }
// }
/*---------------------------------------------------------------- */

// Qs. Print x^n (stack height = n): (Using Recursion)

// import java.util.Scanner;

// class Recursions {
// public static int calcPower(int x, int n) {
// // Base case 1
// if (n == 0) {
// return 1;
// }
// // Base case 2
// if (x == 1) {
// return 0;
// }

// int xPownm1 = calcPower(x, n - 1);
// int xPown = x * xPownm1;
// return xPown;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// int n = sc.nextInt();

// int ans = calcPower(x, n);

// System.out.println(ans);

// sc.close();
// }
// }
/*---------------------------------------------------------------- */

// Qs. Print x^n (stack height = logn): (Using recursion)

// import java.util.Scanner;

// class Recursions {
// public static int calcPower(int x, int n) {
// // Base case 1
// if (n == 0) {
// return 1;
// }
// // Base case 2
// if (x == 0) {
// return 0;
// }

// if (n % 2 == 0) {
// return calcPower(x, n / 2) * calcPower(x, n / 2);
// } else {
// return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int x = sc.nextInt();
// int n = sc.nextInt();

// int ans = calcPower(x, n);
// System.out.println(ans);

// sc.close();
// }
// }
/*---------------------------------------------------------------- */

// Intermediate Level Questions :-

// Qs. Tower of Hanoi: (Using recursion) TC = O(2^n - 1) =~ O(2^n).

// Rules :- 1. Only one disk transfer in one step. 2. Smaller disks are always
// kept on the top of the large disks.

// class Recursions {
// public static void towerOfHanoi(int n, String source, String helper, String
// destination) {
// if (n == 1) {
// System.out.println("transfer disk " + n + " from " + source + " to " +
// destination);
// return;
// }

// towerOfHanoi(n - 1, source, destination, helper);
// System.out.println("transfer disk " + n + " from " + source + " to " +
// destination);
// towerOfHanoi(n - 1, helper, source, destination);
// }

// public static void main(String[] args) {
// int n = 3;
// towerOfHanoi(n, "S", "H", "D");
// }
// }
/*---------------------------------------------------------------- */

// Qs. Print a string in reverse: (Using recursion) TC = O(n)

// class Recursions {
// public static void printReverse(String str, int idx) {
// if (idx == 0) {
// System.out.println(str.charAt(idx));
// return;
// }

// System.out.print(str.charAt(idx));
// printReverse(str, idx - 1);
// }

// public static void main(String[] args) {
// String str = "abcd";
// printReverse(str, str.length() - 1);
// }
// }
/*---------------------------------------------------------------- */

// Qs. Find the 1st and last occurrence of an element in a string: (Using
// recursion) TC = O(n)

// class Recursions {
// // Declaring two static variables i.e. these variables won't be created again
// // and again in every recursion steps.
// public static int first = -1;
// public static int last = -1;

// public static void findOccurrence(String str, int idx, char element) {
// if (idx == str.length()) {
// System.out.println(first);
// System.out.println(last);
// return;
// }

// char currentChar = str.charAt(idx);
// if (currentChar == element) {
// if (first == -1) {
// first = idx;
// } else {
// last = idx;
// }
// }
// findOccurrence(str, idx + 1, element);
// }

// public static void main(String[] args) {
// String str = "abaacdaefaah";
// findOccurrence(str, 0, 'e');
// }
// }
/*---------------------------------------------------------------- */

// Qs. Check if an array is sorted (Strictly Increasing) : (Using recursion) TC
// = O(n)

// class Recursions {
// public static boolean isSorted(int arr[], int idx) {
// if (idx == arr.length - 1) {
// return true;
// }

// if (arr[idx] < arr[idx + 1]) {
// // array is sorted till now.
// return isSorted(arr, idx + 1);
// } else {
// return false;
// }
// }

// public static void main(String[] args) {
// int arr[] = { 1, 3, 4 };
// System.out.println(isSorted(arr, 0));
// }
// }
/*---------------------------------------------------------------- */

// Qs. Move all 'x' to the end of the string: (Using recursion) TC = O(n +
// count(n)) = O(2n) = O(n)

// class Recursions {
// public static void moveAllX(String str, int idx, int count, String newString)
// {
// if (idx == str.length()) {
// // To print the 'x' at the end of the string.
// for (int i = 0; i < count; i++) {
// newString += 'x';
// }
// System.out.println(newString);
// return;
// }

// char currentChar = str.charAt(idx);
// if (currentChar == 'x') {
// count++;
// moveAllX(str, idx + 1, count, newString);
// } else {
// newString += currentChar; // newString = newString + currentChar
// moveAllX(str, idx + 1, count, newString);
// }
// }

// public static void main(String[] args) {
// String str = "axbcxxd";
// moveAllX(str, 0, 0, "");
// }
// }
/*---------------------------------------------------------------- */

// Qs. Remove duplicates in a string: (Using recursion) TC = O(n)

// class Recursions {
// public static boolean[] map = new boolean[26];

// public static void removeDuplicates(String str, int idx, String newString) {
// if (idx == str.length()) {
// System.out.println(newString);
// return;
// }

// char currentChar = str.charAt(idx);
// if (map[currentChar - 'a'] == true) {
// removeDuplicates(str, idx + 1, newString);
// } else {
// newString += currentChar;
// map[currentChar - 'a'] = true;
// removeDuplicates(str, idx + 1, newString);
// }
// }

// public static void main(String[] args) {
// String str = "abaacadee";
// removeDuplicates(str, 0, "");
// }
// }
/*---------------------------------------------------------------- */

// VVI Qs. Print all the subsequences of a string: (Using recursion) TC = O(2^n)

// class Recursions {
// public static void subsequences(String str, int idx, String newString) {
// if (idx == str.length()) {
// System.out.println(newString);
// return;
// }

// char currentChar = str.charAt(idx);

// // Character either to be in newString
// subsequences(str, idx + 1, newString + currentChar);

// // or not to be in newString
// subsequences(str, idx + 1, newString);
// }

// public static void main(String[] args) {
// String str = "abcd";
// subsequences(str, 0, "");
// }
// }
/*---------------------------------------------------------------- */

// VVI Qs. Print all the unique subsequences of a string: (Using recursion) TC =
// (2^n)
// We are going to use HashSet for this question because 'set' in java is
// something which stores only unique values in it.

// import java.util.HashSet;

// class Recursions {
// public static void subsequences(String str, int idx, String newString,
// HashSet<String> set) {
// if (idx == str.length()) {
// if (set.contains(newString)) {
// return;
// } else {
// System.out.println(newString);
// set.add(newString);
// return;
// }
// }

// char currentChar = str.charAt(idx);

// subsequences(str, idx + 1, newString + currentChar, set);

// subsequences(str, idx + 1, newString, set);
// }

// public static void main(String[] args) {
// String str = "aaaa";
// HashSet<String> set = new HashSet<>();
// subsequences(str, 0, "", set);
// }
// }
/*---------------------------------------------------------------- */

// Qs. Print keypad combination: (Using recursion) TC = (4^n) as the max length
// of a given string is 4

// class Recursions {
// public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "nmo",
// "pqrs", "tu", "vwx", "yz" };

// public static void printCombination(String str, int idx, String combination)
// {
// if (idx == str.length()) {
// System.out.println(combination);
// return;
// }

// char currentChar = str.charAt(idx);
// String mapping = keypad[currentChar - '0'];

// for (int i = 0; i < mapping.length(); i++) {
// printCombination(str, idx + 1, combination + mapping.charAt(i));
// }
// }

// public static void main(String[] args) {
// String str = "23";

// printCombination(str, 0, "");
// }
// }
/*---------------------------------------------------------------- */

// Advance Level Recursion :-

// Qs. Print all permutations of a string: (Using recursion) TC = O(n!)

// class Recursions {
// public static void printPermutation(String str, String permutation) {
// if (str.length() == 0) {
// System.out.println(permutation);
// return;
// }

// for (int i = 0; i < str.length(); i++) {
// char currentChar = str.charAt(i);
// // "abc" -> "ab"
// String newString = str.substring(0, i) + str.substring(i + 1);
// printPermutation(newString, permutation + currentChar);
// }
// }

// public static void main(String[] args) {
// String str = "abc";
// printPermutation(str, "");
// }
// }
/*---------------------------------------------------------------- */

// Qs. Count total paths in a maze to move from (0,0) to (n, m): (Using
// recursion) TC is very high in this type of program so we use the concept of
// dynamic programming which we will see later.
// Conditions :- 1. We can only move towards right and towards down, not in any
// other direction.

// Backtracking :- This is an approach in which we find solution and if the
// solution is right then ok, or else we come back to a point and from that
// point we start to explore a new way to reach up to the solution.

// class Recursions {
// public static int countPaths(int i, int j, int n, int m) {
// if (i == n || j == m) {
// return 0;
// }
// if (i == n - 1 || j == m - 1) {
// return 1;
// }

// // Move downwards
// int downPaths = countPaths(i + 1, j, n, m);

// // Move right
// int rightPaths = countPaths(i, j + 1, n, m);

// return downPaths + rightPaths;
// }

// public static void main(String[] args) {
// int n = 3, m = 3;
// int totalPaths = countPaths(0, 0, n, m);
// System.out.println(totalPaths);
// }
// }
/*---------------------------------------------------------------- */

// Qs. Place Tiles of size 1*m in a floor of size n*m : (Using recursion) TC for
// this problem is also very high and can be reduced by using Dynamic
// programming.

// class Recursions {
// public static int placeTiles(int n, int m) {
// if (n == m) {
// return 2;
// }
// if (n < m) {
// return 1;
// }

// // Vertically
// int vertPlacements = placeTiles(n - m, m);

// // Horizontally
// int horPlacements = placeTiles(n - 1, m);

// return vertPlacements + horPlacements;
// }

// public static void main(String[] args) {
// int n = 4, m = 2;
// System.out.println(placeTiles(n, m));
// }
// }
/*---------------------------------------------------------------- */

// Qs. Find the number of ways in which you can invite n people to your party,
// single or in pairs. (Using recursion)

// class Recursions {
// public static int callGuests(int n) {
// if (n <= 1) {
// return 1;
// }

// // Call single
// int ways1 = callGuests(n - 1);

// // Call in pair
// int ways2 = (n - 1) * callGuests(n - 2);

// return ways1 + ways2;
// }

// public static void main(String[] args) {
// int n = 4;
// System.out.println(callGuests(n));
// }
// }
/*---------------------------------------------------------------- */

// Qs. Print all the subsets of a set of first n natural numbers : (Using
// recursion) TC = O(2^n)

// import java.util.*;

// class Recursions {
// public static void printSubset(ArrayList<Integer> subset) {
// for (int i = -0; i < subset.size(); i++) {
// System.out.print(subset.get(i) + " ");
// }
// System.out.println();
// }

// public static void findSubsets(int n, ArrayList<Integer> subset) {
// if (n == 0) {
// printSubset(subset);
// return;
// }

// // Will be add
// subset.add(n);
// findSubsets(n - 1, subset);

// // Will not be added
// subset.remove(subset.size() - 1);
// findSubsets(n - 1, subset);
// }

// public static void main(String[] args) {
// int n = 3;
// ArrayList<Integer> subset = new ArrayList<>();
// findSubsets(n, subset);
// }
// }
/*---------------------------------------------------------------- */