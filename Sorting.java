/*
 * Sorting in Java :- Either sorting elements from highest to lowest value
 * (descending order) or from lowest to highest value (ascending order).
 * 
 * Types of Sorting :- These are the most common types of sorting.
 * 1. Bubble sort :- This technique works by repeatedly swapping the adjacent
 * elements if they are in the wrong order. This algorithm is not suitable for
 * large data sets as its average and worst-case time complexity is quiet high
 * i.e. TC = O(n^2).
 * 
 * Algorithm :-
 * 
 * i. Traverse from left and compare adjacent elements and the higher one is
 * placed at right side.
 * ii. In this way, the largest element is moved to the rightmost end at first.
 * iii. This process is then continued ton find the second largest and place it
 * and so on until the data is sorted.
 * 
 * e.g. is shown below.
*/

// //Sorting

// import java.util.Scanner;
// public class Sorting{
//     public static void main(String []args){
//         int[] arr={5,3,8,4,2};
//         //bubble sort
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     //swap
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         System.out.println("Sorted array:");
//         for(int x:arr){
//             System.out.print(x+" ");
//         }
//     }
// }

/*---------------------------------------------------------------- */

/*
 * 2. Selection sort :- This is a simple and efficient sorting that works by
 * repeatedly selecting the smallest (or largest) element from the unsorted
 * portion of the list and moving it to the sorted portion of the list. TC = O(n
 * ^ 2).
 * 
 * Algorithm :-
 * The algorithm repeatedly selects the smallest (or largest) element from the
 * unsorted portion of the list and swaps it with the first element of the
 * unsorted part. This process is repeated for the remaining unsorted portion
 * until the entire list is sorted.
 * 
 * e.g. is shown below.
 */

// class SelectionSort {
// public static void printArray(int arr[]) {
//     for (int i = 0; i < arr.length; i++) {
//     System.out.print(arr[i] + " ");
//     }
//     System.out.println();
// }

// public static void main(String[] args) {
//     int arr[] = { 7, 8, 3, 1, 2 };

//     // Selection sort
//     for (int i = 0; i < arr.length - 1; i++) {
//         int smallest = i;
//         for (int j = i + 1; j < arr.length; j++) {
//             if (arr[smallest] > arr[j]) {
//                 smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         printArray(arr);
//     }      
// }



/*---------------------------------------------------------------- */

/*
 * 3. Insertion sort :- This is a simple sorting algorithm that works similar to
 * the way you sort playing cards in your hands. The array is virtually split
 * into a sorted and an unsorted part. Values from the unsorted part are picked
 * and placed at the correct position in the sorted part. TC = O(n ^ 2).
 * 
 * Algorithm :-
 * To sort an array of size N in ascending order iterate over the array and
 * compare the current element (key) to its predecessor, if the key element is
 * smaller than its predecessor, compare it to the elements before. Move the
 * greater elements one position up to make space for the swapped element.
 * 
 * e.g. is shown below.
 */

// class InsertionSort {
// public static void printArray(int arr[]) {
//     for (int i = 0; i < arr.length; i++) {
//     System.out.print(arr[i] + " ");
//     }
//     System.out.println();
// }

// public static void main(String[] args) {
//     int arr[] = { 7, 8, 3, 1, 2 };

//     // Insertion sort
//     for (int i = 1; i < arr.length; i++) {
//         int current = arr[i];
//         int j = i - 1;
//         while (j >= 0 && current < arr[j]) {
//             arr[j + 1] = arr[j];
//             j--;
//         }
//         // placement
//         arr[j + 1] = current;
//         }
//         printArray(arr);
//     }
// }
/*---------------------------------------------------------------- */

/*
 * 4. Merge sort :- This is a sorting algorithm that works by dividing an array
 * (divide and conquer) into smaller sub-arrays, sorting each sub-array, and
 * then merging the sorted sub-arrays back together to form the final sorted
 * array. TC = O(nlogn).
 * 
 * Algorithm :-
 * Merge sort is a recursive algorithm that continuously splits the
 * array in half until it cannot be further divided i.e. the array has only one
 * element left (an array with one element is always sorted). Then the sorted
 * sub-arrays are merged into one sorted array.
 * 
 * e.g. is shown below.
 */

// class MergeSort {
// public static void conquer(int arr[], int si, int mid, int ei) {
// // TC for conquer = O(n)
//     int merged[] = new int[ei - si + 1];

//     int idx1 = si; // This is tracking the 1st array.
//     int idx2 = mid + 1; // This is tracking the second array.
//     int x = 0; // This is tracking the merged array.

//     while (idx1 <= mid && idx2 <= ei) {
//         if (arr[idx1] <= arr[idx2]) {
//         // merged[x] = arr[idx1];
//         // x++; idx1++;
//         // These two lines can also be written as;
//         merged[x++] = arr[idx1++];
//         } else {
//         merged[x++] = arr[idx2++];
//         }
//     }

//     // If either of the condition is false in above while loop the either of the
//     // below while loop will execute.
//     while (idx1 <= mid) {
//     merged[x++] = arr[idx1++];
//     }

//     while (idx2 <= ei) {
//     merged[x++] = arr[idx2++];
//     }

//     // To copy the elements of merged array into original array.
//     for (int i = 0, j = si; i < merged.length; i++, j++) {
//         arr[j] = merged[i];
//         }
// }

// public static void divide(int arr[], int si, int ei) {
// // TC for divide = O(logn)
//     if (si >= ei) {
//     return;
//     }

//     // int mid = (si + ei) / 2; // But this formula causes TC to increase so we
//     // use;
//     int mid = si + (ei - si) / 2;
//     divide(arr, si, mid);
//     divide(arr, mid + 1, ei);
//     conquer(arr, si, mid, ei);
// }

// public static void main(String[] args) {
//     // Overall TC = O(nlogn)

//     int arr[] = { 6, 3, 9, 5, 2, 8 };
//     int n = arr.length;

//     divide(arr, 0, n - 1);

//     // Print
//     for (int i = 0; i < n; i++) {
//         System.out.print(arr[i] + " ");
//         }
//     System.out.println();
//     }
// }

/*---------------------------------------------------------------- */

/*
 * 5. Quick sort :- This sorting algorithm is based on the Divide and Conquer
 * algorithm that picks an element as a pivot and partitions the given array
 * around the picked pivot by placing the pivot in its correct position in the
 * sorted array. Average TC = O(nlogn) and Worst TC = O(n^2). The worst TC
 * occurs when the array which we are trying to sort is already sorted either in
 * ascending order or descending order.
 * 
 * Algorithm :-
 * The key process in quickSort is a partition(). The target of partitions is to
 * place the pivot (any element can be chosen to be a pivot) at its correct
 * position in the sorted array and put all smaller elements to the left of the
 * pivot, and all greater elements to the right of the pivot.
 * Partition is done recursively on each side of the pivot after the pivot is
 * placed in its correct position and this is finally sorts the array.
 * 
 * Choice of Pivot :-
 * i. Always pick the first element as a pivot.
 * ii. Always pick the last element as a pivot (most commonly used).
 * iii. Pick a random element as a pivot.
 * iv. Pick the middle as the pivot.
 * 
 * Partition Algorithm :-
 * The logic is simple, we start from the leftmost element and keep track of the
 * index of smaller (or equal) elements as i. While traversing, if we find a
 * smaller element, we swap the current element with arr[i]. Otherwise, we
 * ignore the current element.
 * 
 * e.g. is shown below.
 */

// class QuickSort {
// public static int partition(int arr[], int low, int high) {
//     int pivot = arr[high];
//     int i = low - 1;

//     for (int j = low; j < high; j++) {
//         if (arr[j] < pivot) {
//             i++;

//             // Swap
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }
//     }
//     i++;
//     int temp = arr[i];
//     arr[i] = pivot;
//     arr[high] = temp;
//     return i; // Pivot index
// }

// public static void quickSort(int arr[], int low, int high) {
//     if (low < high) {
//         int pidx = partition(arr, low, high);

//         quickSort(arr, low, pidx - 1);
//         quickSort(arr, pidx + 1, high);
//     }
// }

// public static void main(String[] args) {
//     int arr[] = { 6, 3, 9, 5, 2, 8 };
//     int n = arr.length;

//     quickSort(arr, 0, n - 1);

//     // Print
//     for (int i = 0; i < n; i++) {
//         System.out.print(arr[i] + " ");
//         }
//     System.out.println();
// }
// }

/*
 * But why do we use Quick sort then instead of Merge sort???
 * => Because the worst TC of Quick sort may be O(n^2), but it does not take any
 * extra memory like Merge sort. When we have extra memory which we can use then
 * we can use Merge sort to save time but if we want to save memory then it's
 * better to use Quick sort.
 */
/*---------------------------------------------------------------- */

/*Buket sort:- This is a sorting algorithm that works by distributing the elements of an
array into a number of buckets. Each bucket is then sorted individually, either
using a different sorting algorithm or by recursively applying the bucket sort
algorithm. Finally, the sorted buckets are combined to produce the final sorted
array.
 */

// // BucketSort
// public class Sorting {

//     static void bucketSort(int a[], int n) {

//         // 1. Find maximum element
//         int max = a[0];
//         for (int i = 1; i < n; i++) {
//             if (a[i] > max) {
//                 max = a[i];
//             }
//         }

//         // 2. Create bucket array
//         int bucket[] = new int[max + 1];

//         // 3. Initialize buckets with 0
//         for (int i = 0; i <= max; i++) {
//             bucket[i] = 0;
//         }

//         // 4. Store frequency of each element
//         for (int i = 0; i < n; i++) {
//             bucket[a[i]]++;
//         }

//         // 5. Reconstruct the sorted array
//         int j = 0;
//         for (int i = 0; i <= max; i++) {
//             while (bucket[i] > 0) {
//                 a[j++] = i;
//                 bucket[i]--;
//             }
//         }
//     }


//     public static void main(String[] args) {
//         int a[] = {31,2,30,1,100,0};
//         int n = a.length;

//         bucketSort(a, n);

//         System.out.println("Sorted array:");
//         for (int x : a) {
//             System.out.print(x + " ");
//         }
//     }
// }
/*---------------------------------------------------------------- */

/* Radix sort:- This is a non-comparative integer sorting algorithm that sorts
 * numbers by processing individual digits. The algorithm works by sorting the
* input numbers based on each digit, starting from the least significant digit
* (LSD) to the most significant digit (MSD). It uses a stable sorting
* algorithm (like counting sort) to sort the digits at each position.
 */
// // Radix Sort
// public class Sorting {

//     static int RadixSort(int a[], int n) {
//         int max = a[0];
//         for (int i = 1; i < n; i++) {
//             if (a[i] > max) {
//                 max = a[i];
//             }
//         }
//         return max;
//     }

//     static void countingSort(int a[], int n, int exp) {
//         int output[] = new int[n];
//         int count[] = new int[10];

//         // Initialize count array with 0
//         for (int i = 0; i < 10; i++) {
//             count[i] = 0;
//         }

//         // Store count of occurrences in count[]
//         for (int i = 0; i < n; i++) {
//             count[(a[i] / exp) % 10]++;
//         }

//         // Change count[i] so that it now contains actual position of this digit in output[]
//         for (int i = 1; i < 10; i++) {
//             count[i] += count[i - 1];
//         }

//         // Build the output array
//         for (int i = n - 1; i >= 0; i--) {
//             output[count[(a[i] / exp) % 10] - 1] = a[i];
//             count[(a[i] / exp) % 10]--;
//         }

//         // Copy the output array to a[], so that a[] now contains sorted numbers according to current digit
//         for (int i = 0; i < n; i++) {
//             a[i] = output[i];
//         }
//     }
//     static void radixSort(int a[], int n) {
//         int max = RadixSort(a, n);

//         // Do counting sort for every digit
//         for (int exp = 1; max / exp > 0; exp *= 10) {
//             countingSort(a, n, exp);
//         }
//     }

//     public static void main(String[] args) {
//         int a[] = { 53,89,150,36,633,233 };
//         int n = a.length;

//         radixSort(a, n);

//         System.out.println("Sorted array:");
//         for (int x : a) {
//             System.out.print(x + " ");
//         }
//     }
// }