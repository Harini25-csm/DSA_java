// public class MaxSubarray {
//     public static void main(String[] args) {
//         int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int maxSum = arr[0]; 
//         for (int i = 1; i < arr.length; i++) {
//             arr[i] = Math.max(arr[i], arr[i] + arr[i - 1]);
//             maxSum = Math.max(maxSum, arr[i]);
//         }

//         System.out.println("Maximum Subarray Sum = " + maxSum);
//     }
// }

// public class MaxSubarray{
//     public int maxsum(int [] nums){
//         int maxsum=nums[0];
//         int currentSum=nums[0];
//         for(int i=1;i<nums.length;i++){
//             nums[i]=Math.max(nums[i],currentSum+nums[i]);
//             maxsum=Math.max(currentSum,maxsum);
//         }
//         return maxsum;
//     }
//     private static class nums{
//         public nums(){
//         }
//     }
// }

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {12, 34, 1, 10, 34, 1};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } 
            else if (arr[i] > thirdLargest && arr[i] != secondLargest && arr[i] != largest) {
                thirdLargest = arr[i];
            }
        }

        if (thirdLargest == Integer.MIN_VALUE) {
            System.out.println("No third largest element");
        } else {
            System.out.println("Third Largest = " + thirdLargest);
        }
    }
}


