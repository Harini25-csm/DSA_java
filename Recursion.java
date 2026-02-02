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
//     public static void main(String[] args){
//         String s="ABC";
//         permute(s.toCharArray(),0);
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
// class Solution {
//     public double myPow(double x, int n) {
//         if (n == 0) return 1;
//         if(n<0){
//             x=1/x;
//             return power(x, -(long)n);
//         }
//         return power(x,n);
        
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
// }
/******************************************************/
