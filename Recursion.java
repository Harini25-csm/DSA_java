// // Factorial using recursion
// import java.util.Scanner;
// public class Recursion{
//     int factorial(int n){
//         if(n==0||n==1) return 1;
//         return n*factorial(n-1);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         Recursion obj=new Recursion();
//         int result=obj.factorial(n);
//         System.out.println(result);
//     }
// }
/*****************************************************/

// //sum of n natural nums
// import java.util.Scanner;
// public class Recursion{
//     int sumnaturalnum(int n){
//         if(n==0||n==1) return 1;
//         return n+sumnaturalnum(n-1);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         Recursion obj=new Recursion();
//         int result=obj.sumnaturalnum(n);
//         System.out.println(result);
//     }
// }
/****************************************************/

// //Fibonacci
// import java.util.Scanner;
// public class Recursion{
//     int fibonacci(int n){
//         if(n==0) return 0;
//         if(n==1) return 1;
//         return fibonacci(n-1)+fibonacci(n-2);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         Recursion obj=new Recursion();
//         int result=obj.fibonacci(n);
//         System.out.println(result);
//     }
// }
/*******************************************/

// // sum the nums given num (326=3+2+6)
// import java.util.Scanner;
// public class Recursion {

//     int sum(int n){
//         if(n == 0) return 0;              // base case
//         return (n % 10) + sum(n / 10);   // last digit + remaining number
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         Recursion obj = new Recursion();
//         int result = obj.sum(n);

//         System.out.println(result);
//     }
// }

/**************************************************/

// //reverse string using recursion
// import java.util.Scanner;
// public class Recursion {
//     String reverse(String s){
//      if(s.length()==0) return s;
//      return reverse(s.substring(1))+s.charAt(0);   
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         Recursion obj = new Recursion();
//         String result = obj.reverse(s);
//         System.out.println(result);
//     }
// }
/***********************************************************/

// //palindrome without using recursion
// import java.util.Scanner;
// public class Recursion {
//     boolean isPalindrome(String s){
//         int left = 0;
//         int right = s.length() - 1;

//         while(left < right){
//             if(s.charAt(left) != s.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();

//         Recursion obj = new Recursion();

//         if(obj.isPalindrome(s)){
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("not Palindrome");
//         }
//     }
// }

// // or using recursion
// import java.util.Scanner;
// public class Recursion {
//     public static boolean isPalindrome(String s,int start,int end){
//         if(start>=end){
//             return true;
//         }
//         if(s.charAt(start)!=s.charAt(end)){
//             return false;
//         }
//         return isPalindrome(s,start+1,end-1);
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();

//         Recursion obj = new Recursion();

//         if(isPalindrome(s,0,s.length()-1)){
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("not Palindrome");
//         }
//     }
// }
/**************************************************************/

// // Permutations using recursion
// import java.util.Scanner;
// public class Recursion{
//     public static void permute(char[] chars,int start){
//         if(start==chars.length-1){
//             System.out.println(String.valueOf(chars));
//             return;
//         }
//         for(int i=start;i<chars.length;i++){
//             swap(chars,start,i);// swap is for first iteration start with 'A'
//             permute(chars,start+1);// intially 'A' is constant, to reach next ele do 'start+1'
//             swap(chars,start,i);// this swap is second iterstion starts with 'B'
//         }
//     }
//     public static void swap(char[] arr,int i, int j){
//         char temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String input = sc.nextLine();

//         if (input.length() == 0) {
//             System.out.println("Empty string has no permutations.");
//         } else {
//             System.out.println("Permutations are:");
//             permute(input.toCharArray(), 0);
//         }

//         sc.close();
//     }
// }
/************************************************/

// // Merge k list using devide and conquer. mid=(n/2)+1(even), mid=n/2(odd)
// class ListNode{
//     int val;
//     ListNode next;
//     ListNode(){
//         this.val=val;
//         this.next=null;
//     }
// }
// public class   Recursion{
//     public ListNode merge(ListNode[] lists){
//         if(lists==null || lists.length==0){
//             return null;
//         }
//         return mergeRange(lists,0,lists.length-1);
//     }
//     public ListNode mergeRange(ListNode[] lists,int l,int r){
//         if(l==r){
//             return lists[l];
//         }
//         int mid=l+(r-l)/2;
//         ListNode Left=mergeRange(lists,l,mid);
//         ListNode Right=mergeRange(lists,mid+1,r);
//         return mergeTwoLists(Left,Right);
//     }
//     public ListNode mergeTwoLists(ListNode l1, ListNode l2){
//         if(l1==null) return l2;
//         if(l2==null) return l1;
//         if(l1.val<l2.val){
//             l1.next=mergeTwoLists(l1.next,l2);
//             return l1;
//         }
//         else{
//             l2.next=mergeTwoLists(l1,l2.next);
//             return l2;
//         }

//     } 
// }
/***********************************************************/
// // x power(n)
// import java.util.Scanner;
// class Recursion {
//     public double myPow(double x, int n) {
//         if (n == 0) return 1;

//         if (n < 0) {
//             x = 1 / x;
//             return power(x, -(long) n);  // Convert to long to avoid overflow
//         }
//         return power(x, n);
//     }

//     private double power(double x, long n) {
//         if (n == 0) return 1;

//         double half = power(x, n / 2);
//         if (n % 2 == 0) {
//             return half * half;
//         } else {
//             return half * half * x;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Recursion obj = new Recursion();

//         System.out.print("Enter base (x): ");
//         double x = sc.nextDouble();

//         System.out.print("Enter exponent (n): ");
//         int n = sc.nextInt();

//         double result = obj.myPow(x, n);
//         System.out.println("Result: " + result);

//         sc.close();
//     }
// }

/******************************************************/

// //ratInMaze
// //Input: maze[][] = [[1, 0, 0, 0], [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1]]
// //Output: ["DDRDRR", "DRDDRR"]
// import java.util.*;
// public class Recursion {
//     public static ArrayList<String> ratInMaze(int[][] m, int n) {//ArrayList<String> for path
//         ArrayList<String> ans = new ArrayList<>();
//         if (m[0][0] == 0) return ans;
//         boolean[][] visited = new boolean[n][n];
//         solve(0, 0, m, n, visited, "", ans);
//         Collections.sort(ans); // for lexicographical order
//         return ans;
//     }
//     static void solve(int i, int j, int[][] m, int n,
//                       boolean[][] visited, String path, ArrayList<String> ans) {
//         if (i == n - 1 && j == n - 1) {
//             ans.add(path);
//             return;
//         }
//         visited[i][j] = true;
//         if (i + 1 < n && m[i + 1][j] == 1 && !visited[i + 1][j])
//             solve(i + 1, j, m, n, visited, path + "D", ans);
//         if (j - 1 >= 0 && m[i][j - 1] == 1 && !visited[i][j - 1])
//             solve(i, j - 1, m, n, visited, path + "L", ans);
//         if (j + 1 < n && m[i][j + 1] == 1 && !visited[i][j + 1])
//             solve(i, j + 1, m, n, visited, path + "R", ans);
//         if (i - 1 >= 0 && m[i - 1][j] == 1 && !visited[i - 1][j])
//             solve(i - 1, j, m, n, visited, path + "U", ans);
//         visited[i][j] = false;
//     }
//     //  MAIN METHOD
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         int[][] maze = new int[n][n];
//         System.out.println("Enter maze matrix (0/1):");

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 maze[i][j] = sc.nextInt();
//             }
//         }

//         ArrayList<String> paths = ratInMaze(maze, n);

//         if (paths.size() == 0) {
//             System.out.println("No Path Found");
//         } else {
//             System.out.println("Possible Paths:");
//             for (String s : paths) {
//                 System.out.println(s);
//             }
//         }
//     }
// }

//*****************************************************/

// # function solve(expression):
// # result=[]
// # for each index i:
// # if expression[i] is an operator:
// # left=expression[0....i-1]//break from operator
// # right=expression[i+1....n]
// # for l in left:
// #     for r in right:
// #         reult.add(l or r)

// // Different Ways to Add Parentheses
// import java.util.*;

// class Recursion {

//     public List<Integer> diffWaysToCompute(String expression) {
//         return solve(expression);
//     }

//     private List<Integer> solve(String exp) {
//         List<Integer> result = new ArrayList<>();

//         for (int i = 0; i < exp.length(); i++) {
//             char ch = exp.charAt(i);

//             if (ch == '+' || ch == '-' || ch == '*') {

//                 List<Integer> left = solve(exp.substring(0, i));
//                 List<Integer> right = solve(exp.substring(i + 1));

//                 for (int l : left) {
//                     for (int r : right) {
//                         if (ch == '+') result.add(l + r);
//                         else if (ch == '-') result.add(l - r);
//                         else result.add(l * r);
//                     }
//                 }
//             }
//         }

//         if (result.size() == 0) {
//             result.add(Integer.parseInt(exp));
//         }

//         return result;
//     }

//     //  MAIN METHOD
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter expression: ");
//         String expression = sc.nextLine();

//         Recursion obj = new Recursion();
//         List<Integer> results = obj.diffWaysToCompute(expression);

//         System.out.println("Possible Results:");
//         for (int num : results) {
//             System.out.print(num + " ");
//         }
//     }
// }

