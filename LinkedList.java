// // LinkedList example code
// class LinkedList {

//     // Node class
//     class Node {

//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     Node head; // head of list

//     // Insertion at end
//     void insert(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {   // if list empty
//             head = newNode;
//             return;
//         }

//         // traverse to last node
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }

//         temp.next = newNode;
//     }

//     // Display list
//     void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("NULL");
//     }

//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

//         list.insert(10);
//         list.insert(20);
//         list.insert(30);

//         list.display();
//     }
// }
/**************************************************************************/

// //reverse LinkedList by changing head as last node and reverse the pointers
// class LinkedList{
//     class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     Node head;

//     void insert(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//         Node temp=head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newNode;
//     }

//     Node reverse(){
//         Node prev=null;
//         Node curr=head;
//         Node next=null;
//         while(curr!=null){
//             next=curr.next;//save the next node
//             curr.next=prev;//reverse the linkedlist
//             prev=curr; //move prev
//             curr=next;//move current

//         }
//         head=prev;
//         return head;
//     }

//     void printList(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//     }

//     public static void main(String []args){
//         LinkedList list=new LinkedList();
//         list.insert(1);
//         list.insert(2);
//         list.insert(3);
//         list.insert(4);
//         list.insert(5);

//         System.out.println("Original List:");
//         list.printList();

//         list.reverse();

//         System.out.println("\nReversed List:");
//         list.printList();
//     }
    
// }

/**************************************************************************/

// //find if the loop is there or not in linked list using slow, fast approach
// //Also called Floyd’s Cycle Detection Algorithm or Tortoise & Hare
// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LinkedList {

//     // Insert nodes dynamically
//     public static Node createList(int[] arr) {
//         Node head = new Node(arr[0]);
//         Node temp = head;

//         for (int i = 1; i < arr.length; i++) {
//             temp.next = new Node(arr[i]);
//             temp = temp.next;
//         }
//         return head;
//     }

//     // Create loop: last node → position k
//     public static void createLoop(Node head, int k) {
//         Node temp = head;
//         Node loopNode = null;
//         int count = 1;

//         while (temp.next != null) {
//             if (count == k) {
//                 loopNode = temp;
//             }
//             temp = temp.next;
//             count++;
//         }
//         temp.next = loopNode; // last node connects to k-th node
//     }

//     // Detect loop
//     public static boolean hasLoop(Node head) {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) return true;
//         }
//         return false;
//     }

//     public static void main(String[] args) {

//         int[] values = {1,2}; // Can be 20, 50, 100

//         Node head = createList(values);

//         createLoop(head, 3);  // loop starts at node 3

//         if (hasLoop(head))
//             System.out.println("Loop detected in the linked list");
//         else
//             System.out.println("No loop in the linked list");
//     }
// } 


// // or use this code
// class Main{
//     class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     Node head;
    
//     void insert(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//         Node temp=head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newNode;
//     }
    
//      public static boolean hasLoop(Node head) {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;          // move 1 step
//             fast = fast.next.next;     // move 2 steps

//             if (slow == fast) {        // they meet
//                 return true;
//             }
//         }
//         return false; // no loop
//     }
//     void createLoop() {
//     Node temp = head;
//     Node third = null;
//     int count = 1;

//     while (temp.next != null) {
//         if (count == 3) {
//             third = temp; // save 3rd node
//         }
//         temp = temp.next;
//         count++;
//     }

//     temp.next = third; // last node connects to 3rd node
// }

//     public static void main(String []args){
//         Main list=new Main();
//         list.insert(1);
//         list.insert(2);
//         list.insert(3);
//         list.insert(4);
//         list.insert(5);
//         list.insert(6);
       
//         list.createLoop();
//         if (hasLoop(list.head))
//             System.out.println("Loop detected in the linked list");
//         else
//             System.out.println("No loop in the linked list");
//     }
// }

/**************************************************************************/

// //Finding Max subarray sum
// public class LinkedList {

//     public static void main(String[] args) {

//         int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

//         int maxSum = arr[0];
//         int currentSum = arr[0];

//         int start = 0, end = 0, tempStart = 0;

//         for (int i = 1; i < arr.length; i++) {

//             // Decide whether to start new subarray or continue
//             if (arr[i] > currentSum + arr[i]) {
//                 currentSum = arr[i];
//                 tempStart = i;
//             } else {
//                 currentSum = currentSum + arr[i];
//             }

//             // Update max sum and positions
//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//                 start = tempStart;
//                 end = i;
//             }
//         }

//         System.out.println("Maximum Subarray Sum = " + maxSum);

//         System.out.print("Subarray: ");
//         for (int i = start; i <= end; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

/**************************************************************************/

// //Finding 3rd largest
// public class LinkedList {
//     public static void main(String[] args) {
//         int[] arr = {12, 35, 1, 10, 34, 1};

//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;
//         int thirdLargest = Integer.MIN_VALUE;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 thirdLargest = secondLargest;
//                 secondLargest = largest;
//                 largest = arr[i];
//             } 
//             else if (arr[i] > secondLargest && arr[i] != largest) {
//                 thirdLargest = secondLargest;
//                 secondLargest = arr[i];
//             } 
//             else if (arr[i] > thirdLargest && arr[i] != secondLargest && arr[i] != largest) {
//                 thirdLargest = arr[i];
//             }
//         }

//         if (thirdLargest == Integer.MIN_VALUE) {
//             System.out.println("No third largest element");
//         } else {
//             System.out.println("Third Largest = " + thirdLargest);
//         }
//     }
// }
/**************************************************************************/

// //Find Nth node
// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LinkedList {

//     // Function to find Nth node from last
//     public static Node nthFromLast(Node head, int n) {
//         Node fast = head;
//         Node slow = head;

//         // Move fast n steps ahead
//         for (int i = 0; i < n; i++) {
//             if (fast == null) {
//                 return null; // n greater than length
//             }
//             fast = fast.next;
//         }

//         // Move both pointers
//         while (fast != null) {
//             slow = slow.next;
//             fast = fast.next;
//         }

//         return slow;
//     }

//     public static void main(String[] args) {
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = new Node(40);
//         head.next.next.next.next = new Node(50);

//         int n = 2;

//         Node result = nthFromLast(head, n);

//         if (result != null)
//             System.out.println(n + "th node from last is: " + result.data);
//         else
//             System.out.println("Position exceeds list length");
//     }
// }
/**************************************************************************/

// // Plindrome
// class Node {
//     int data;
//     Node next;
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LinkedList {

//     Node head;

//     // Function to check palindrome
//     boolean isPalindrome() {

//         if (head == null || head.next == null)
//             return true; // 0 or 1 node

//         Node slow = head;
//         Node fast = head;

//         // Step 1: Find middle
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         // Step 2: Reverse second half
//         Node prev = null;
//         Node curr = slow;
//         while (curr != null) {
//             Node next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         // Step 3: Compare both halves
//         Node first = head;
//         Node second = prev;

//         while (second != null) {
//             if (first.data != second.data)
//                 return false;
//             first = first.next;
//             second = second.next;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

//         list.head = new Node(1);
//         list.head.next = new Node(2);
//         list.head.next.next = new Node(2);
//         list.head.next.next.next = new Node(1);

//         System.out.println(list.isPalindrome()); // true
//     }
// }
/**************************************************************************/

// //Find Middle Using Slow & Fast
// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LinkedList {

//     // Function to find middle node
//     static Node findMiddle(Node head) {

//     if (head == null)
//         return null;

//     Node slow = head;
//     Node fast = head.next;  //  change here

//     while (fast != null && fast.next != null) {
//         slow = slow.next;
//         fast = fast.next.next;
//     }

//     return slow;  // first middle
// }


//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of nodes: ");
//         int n = sc.nextInt();

//         Node head = null, tail = null;

//         System.out.println("Enter node values:");

//         // Create linked list
//         for (int i = 0; i < n; i++) {
//             int val = sc.nextInt();
//             Node newNode = new Node(val);

//             if (head == null) {
//                 head = newNode;
//                 tail = newNode;
//             } else {
//                 tail.next = newNode;
//                 tail = newNode;
//             }
//         }

//         Node mid = findMiddle(head);

//         if (mid != null)
//             System.out.println("Middle element is: " + mid.data);
//         else
//             System.out.println("List is empty");
//     }
// }

/**************************************************************************/
// //Loop detection (slow–fast) (asked in Google, Amazon)
// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LinkedList {

//     // Function to find intersection node
//     public static Node findIntersection(Node head1, Node head2) {
//         Node p1 = head1;
//         Node p2 = head2;

//         while (p1 != p2) {
//             p1 = (p1 == null) ? head2 : p1.next;
//             p2 = (p2 == null) ? head1 : p2.next;
//         }
//         return p1; // intersection node or null
//     }

//     public static void main(String[] args) {

//         // Common part
//         Node n6 = new Node(6);
//         Node n7 = new Node(7);
//         Node n8 = new Node(8);
//         n6.next = n7;
//         n7.next = n8;

//         // List 1: 1 → 2 → 3 → 6 → 7 → 8
//         Node head1 = new Node(1);
//         head1.next = new Node(2);
//         head1.next.next = new Node(3);
//         head1.next.next.next = n6;

//         // List 2: 4 → 6 → 7 → 8
//         Node head2 = new Node(4);
//         head2.next = n6;

//         Node intersection = findIntersection(head1, head2);

//         if (intersection != null)
//             System.out.println("Intersection Node: " + intersection.data);
//         else
//             System.out.println("No intersection");
//     }
// }

/**************************************************************************/
// //Intersection of Two Linked Lists
// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LinkedList {

//     // Find intersection of two lists
//     public static Node getIntersection(Node head1, Node head2) {
//         Node p1 = head1;
//         Node p2 = head2;

//         while (p1 != p2) {
//             // When p1 reaches end, move to head2
//             p1 = (p1 == null) ? head2 : p1.next;

//             // When p2 reaches end, move to head1
//             p2 = (p2 == null) ? head1 : p2.next;
//         }
//         return p1; // intersection node (or null)
//     }

//     public static void main(String[] args) {

//         // Common part
//         Node common1 = new Node(6);
//         Node common2 = new Node(7);
//         Node common3 = new Node(8);
//         common1.next = common2;
//         common2.next = common3;

//         // List 1: 1 → 2 → 3 → 6 → 7 → 8
//         Node head1 = new Node(1);
//         head1.next = new Node(2);
//         head1.next.next = new Node(3);
//         head1.next.next.next = common1;

//         // List 2: 4 → 5 → 6 → 7 → 8
//         Node head2 = new Node(4);
//         head2.next = new Node(5);
//         head2.next.next = common1;

//         Node result = getIntersection(head1, head2);

//         if (result != null)
//             System.out.println("Intersection Node: " + result.data);
//         else
//             System.out.println("No intersection");
//     }
// }
/**************************************************************************/

// // Node definition
// class ListNode {
//     int data;
//     ListNode next;

//     ListNode(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LinkedList {

//     public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

//         if (headA == null || headB == null) {
//             return null;
//         }

//         ListNode a = headA;
//         ListNode b = headB;

//         while (a != b) {

//             if (a == null) {
//                 a = headB;
//             } else {
//                 a = a.next;
//             }

//             if (b == null) {
//                 b = headA;
//             } else {
//                 b = b.next;
//             }
//         }

//         return a;  // Intersection node or null
//     }

//     // 🔹 Main method
//     public static void main(String[] args) {

//         // Common intersection part
//         ListNode common = new ListNode(8);
//         common.next = new ListNode(10);

//         // List A: 3 → 7 → 8 → 10
//         ListNode headA = new ListNode(3);
//         headA.next = new ListNode(7);
//         headA.next.next = common;

//         // List B: 99 → 1 → 8 → 10
//         ListNode headB = new ListNode(99);
//         headB.next = new ListNode(1);
//         headB.next.next = common;

//         ListNode result = getIntersectionNode(headA, headB);

//         if (result != null) {
//             System.out.println("Intersection at node value: " + result.data);
//         } else {
//             System.out.println("No intersection");
//         }
//     }
// }

