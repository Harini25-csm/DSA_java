/*
 * Searching in Java :- Searching is the process of finding a specific element
 * or value within a collection of data, such as an array or a list. There area
 * several algorithms that can be used for searching, each with its own advantages
 * and disadvantages. Some of the most common searching algorithms in Java are:
 * 1. Linear Search :- This is the simplest searching algorithm that works by
 * checking each element in the collection one by one until the desired element is
 * found or the end of the collection is reached. TC = O(n).
 * 2. Binary Search :- This is a more efficient searching algorithm that works by
 * repeatedly dividing the collection in half until the desired element is found.
 * However, it requires the collection to be sorted beforehand. TC = O(log n).
 * 3. Ternary Search :- This is a variation of binary search that divides the
 * collection into three parts instead of two. It works by comparing the desired
 * element with two midpoints in the collection and recursively searching in the
 * appropriate third. TC = O(log3 n).

/*---------------------------------------------------------------*/
// //Searching

// import java.util.Scanner;
// public class Searching{
//     public static void main(String []args){
//         Scanner sc=new Scanner(System.in);

//         int size=sc.nextInt();
//         int marks[]=new int[size];

//         for(int i=0;i<size;i++){
//             marks[i]=sc.nextInt();
//         }
//         //Linear Search
//         int x=sc.nextInt();
//         for(int i=0;i<size;i++){
//             if(marks[i]==x){
//                 System.out.println("Element found at index: "+i);
//             }
//         }
//     }
// }
/*---------------------------------------------------------------*/

// import java.util.Scanner;
// public class Searching{
//     public static void main(String []args){
//         //Binary Search
//         int arr[]={2,4,6,8,10};
//         int target=6;
//         int low=0;
//         int high=arr.length-1;
//         int result=-1;

//         while(low<=high){
//             int mid=(low+high)/2;
//             if(arr[mid]==target){
//                 result=mid;//found
//                 break;
//             }else if(arr[mid]<target){
//                 low=mid+1;//go right
//             }else{
//                 high=mid-1;//go left
//             }
//         }
//         System.out.println("Element found at index: "+result);
//     }
// }

/*---------------------------------------------------------------*/
// //Ternary search
// public class Searching {
//     public static int TernarySearch(int arr[], int key) {
//         int low=0;
//         int high=arr.length-1;
//         while(low<=high){
//             int mid1=low+(high-low)/3;
//             int mid2=high-(high-low)/3;
//             if(arr[mid1]==key)
//                 return mid1;
//             if(arr[mid2]==key)
//                 return mid2;

//             if(key<arr[mid1]){
//                 high=mid1-1;//left side
//             }else if(key>arr[mid2]){
//                 low=mid2+1;//right side
//             }else{
//                 low=mid1+1;//between mid1 and mid2
//                 high=mid2-1;//middle
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//             int arr[] = {10, 20, 30, 40, 50, 60, 70};
//             int key = 20;
//             int result = TernarySearch(arr, key);
//         System.out.println("Element found at index: "+result);
//     }
// }




      