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

//Fibonacci
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

//palindrome without using recursion
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