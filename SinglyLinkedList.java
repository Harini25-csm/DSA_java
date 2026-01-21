/*
 * LinkedList :- It is one of the important data structure in java. LinkedList
 * means we have a list of elements/nodes and all these nodes are linked with
 * each-other. All the nodes are stored in a non-contiguous memory locations but
 * are linked together.
 * 
 * ArrayList vs LinkedList :-
 * ArrayList is implemented by the help of dynamic array and TC to insert an
 * element in the middle of the ArrayList is O(n) and searching TC is O(1).
 * LinkedList, to insert the element in the middle TC is O(1) and to search the
 * element TC is O(n).
 * From above difference we can see that if our main task is to manipulate the
 * data i.e. add/delete then we should use LinkedList and if our main task is to
 * search the data the we should ArrayList data structure.
 * 
 * Basic properties of a LinkedList :-
 * i. Variable Size :- The size is not fixed at all.
 * ii. Non-contiguous Memory :- The nodes are stored at non-continuous memory
 * locations in the form of chunks and we just create link to those chunks.
 * iii. Insert in O(1).
 * iv. Search in O(n).
 * 
 * Structure of a LinkedList :- A LinkedList is made of basic structure which we
 * call as 'node', each element is called as a node and at last it is connected
 * to an empty node (null node). Each node contains two important data in it.
 * First one is the data (value) and second one is the information/reference
 * (memory address of next node) of the next node. Null node doesn't have next
 * reference.
 * 
 * The first node of a LinkedList is called "Head" and we don't have to remember
 * the address of each and every node in a linked list. If we are able to get
 * the address of the 1st node then we can find any node by its help as it
 * contains the address of next node and the next node contains the address of
 * next, next node.
 * Similarly, the last node is also called as "Tail".
 * 
 * There are three types of LinkedList :-
 * i. Singular LinkedList :- Also known as Single Ended LinkedList. In this all
 * the nodes are connected only in one direction. It contains only
 * "next pointer".
 * 
 * ii. Doubly LinkedList :- Also known as Double Ended LinkedList. In this all
 * the nodes are connected in both the direction. It contains both "next" as
 * well as "previous" pointers.
 * 
 * iii. Circular LinkedList :- In this the last node is connected to the 1st
 * node i.e. Head and Tail are connected where tail is never a null node. It can
 * also be on Singly or Doubly type.
 */

// // Singular LinkedList :-
// public class SinglyLinkedList {
// // Creating a Head node.
// Node1 head01;

// // Creating a nested class named Node.
// static class Node1 {
// String data;
// Node1 next; // Node has the property called next which we are using here which
// // stores memory
// // reference of next node.

// // Creating constructor for Node class.
// Node1(String data) {
// this.data = data; // this.data is pointing to the data variable/property present inside the Node
// // class.
// this.next = null; // Initially for all the nodes the next node will be null hence no list is
// // created.
// }
// }

// // Method to add element at the beginning of a LinkedList.
// public void addFirst(String data) {
// Node1 newNode = new Node1(data);

// // To check whether any LinkedList exist or not for now.
// if (head01 == null) { // means no LinkedList exist till now so,
// head01 = newNode;
// return;
// }

// // In case a LinkedList already exists then,
// newNode.next = head01;
// head01 = newNode;
// }

// // Method to add element at the end of the LinkedList.
// public void addLast(String data) {
// Node1 newNode = new Node1(data);
// if (head01 == null) {
// head01 = newNode;
// return;
// }

// // To traverse a LinkedList we have to crate a current node.
// Node1 currNode = head01;
// // We will traverse until the next node points to null.
// while (currNode.next != null) {
// currNode = currNode.next;
// }

// // As soon as it reaches the last node, we'll change,
// currNode.next = newNode;
// }

// // To print the list :- It is similar to adding element at last.
// public void printList() {
// // Checking if head is already null.
// if (head01 == null) {
// System.out.println("List is empty");
// return;
// }

// Node1 currNode = head01;
// while (currNode != null) {
// System.out.print(" " + currNode.data + " " + "-->" + " ");
// currNode = currNode.next;
// }

// System.out.println("Null");
// }



// // You might be thinking that why we made a currNode we can use Head as a
// // current node.
// // It is because we should never perform any manipulation operation on Head
// e.g.
// // making head.next as Head which will cut-off the previous Head and we
// cannot
// // track it back, because if we lose Head then there is now way of tracking
// it
// // back i.e. it's gone and your data is lost.
// // By doing as I did above, we can put the value of Head in current node
// without
// // losing the actual head and in this way the value of current node is
// getting
// // updated.

// public static void main(String args[]) {
// // Creating object of the SinglyLinkedlis class
// SinglyLinkedList list = new SinglyLinkedList();
// list.addFirst("a");
// list.addFirst("is");
// list.addFirst("This");
// list.printList();

// list.addLast("list");
// list.printList();
// }
// }
/*---------------------------------------------------------------- */

// Delete operation in a Singly LinkedList :- As we saw add first and add last
// in the similar way we have delete first and delete last which is illustrated
// below.

// public class SinglyLinkedList {
// Node head;

// class Node {
// String data;
// Node next;

// Node(String data) {
// this.data = data;
// this.next = null;
// }
// }

// public void addFirst(String data) {
// Node newNode = new Node(data);

// if (head == null) {
// head = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// public void addLast(String data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// return;
// }

// Node currNode = head;
// while (currNode.next != null) {
// currNode = currNode.next;
// }

// currNode.next = newNode;
// }

// public void printList() {
// if (head == null) {
// System.out.println("List is empty");
// return;
// }

// Node currNode = head;
// while (currNode != null) {
// System.out.print(" " + currNode.data + " " + "-->" + " ");
// currNode = currNode.next;
// }

// System.out.println("Null");
// }

// // To delete the 1st node :- For this we can simply change the head.next as
// our
// // new head which will cause to lose the connection to the original head and
// it
// // will be deleted from the list (garbage collector will take it away).
// public void deleteFirst() {
// // Base case / corner case

// if (head == null) {
// System.out.println("This list is empty");
// return;
// }

// head = head.next;
// }

// // To delete the last node :- For this we can simply traverse through the 
// // list
// // and find the last node and then we will make the 2nd last node pointing to
// // null i.e. the after part of it will be cut-off from the list and it will be
// // collected by the garbage collector i.e. it will be deleted.
// public void deleteLast() {
// // Base case / corner case
// if (head == null) {
// System.out.println("This list is empty");
// return;
// }

// // Another base case / corner case :- If LinkedList has single node then
// if (head.next == null) {
// head = null;
// return;
// }

// Node secondLast = head;
// Node lastNode = head.next; // head.next = null --> lastNode = null
// while (lastNode.next != null) { // null.next will give "error". To handle
// // this we have another base case defined
// // above.
// lastNode = lastNode.next;
// secondLast = secondLast.next;
// }

// secondLast.next = null;
// }

// public static void main(String args[]) {
// SinglyLinkedList list = new SinglyLinkedList();
// list.addFirst("a");
// list.addFirst("is");
// list.addFirst("This");
// list.printList();

// list.addLast("list");
// list.printList();

// list.deleteFirst();
// list.printList();

// list.deleteLast();
// list.printList();
// }
// }
/*---------------------------------------------------------------- */

// Tracking the size of the LinkedList :- It is not necessary that we will track
// the size by traversing the complete list, we can do it simultaneously also.
// Size doesn't count null nodes.

// public class SinglyLinkedList {
// Node head;
// private int size; // Variable to track size.

// // Constructor to track size of the list.
// SinglyLinkedList() {
// this.size = 0;
// }

// class Node {
// String data;
// Node next;

// Node(String data) {
// this.data = data;
// this.next = null;
// // When creating new node we will do;
// size++;
// }
// }

// public void addFirst(String data) {
// Node newNode = new Node(data);

// if (head == null) {
// head = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// public void addLast(String data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// return;
// }

// Node currNode = head;
// while (currNode.next != null) {
// currNode = currNode.next;
// }

// currNode.next = newNode;
// }

// public void printList() {
// if (head == null) {
// System.out.println("List is empty");
// return;
// }

// Node currNode = head;
// while (currNode != null) {
// System.out.print(" " + currNode.data + " " + "-->" + " ");
// currNode = currNode.next;
// }

// System.out.println("Null");
// }

// public void deleteFirst() {
// if (head == null) {
// System.out.println("This list is empty");
// return;
// }
// // When we are deleting the node we will do;
// size--;
// head = head.next;
// }

// public void deleteLast() {
// if (head == null) {
// System.out.println("This list is empty");
// return;
// }

// // Here also, when we are deleting the node we will do;
// size--;
// // We cannot write this size-- in the if condition mention below or after the
// if
// // condition mentioned below because if we do that we will miss that
// condition.

// if (head.next == null) {
// head = null;
// return;
// }

// Node secondLast = head;
// Node lastNode = head.next;
// while (lastNode.next != null) {
// lastNode = lastNode.next;
// secondLast = secondLast.next;
// }

// secondLast.next = null;
// }

// public int getSize() {
// return size;
// }

// public static void main(String args[]) {
// SinglyLinkedList list = new SinglyLinkedList();
// list.addFirst("a");
// list.addFirst("is");
// list.addFirst("This");
// list.printList();
// System.out.println("Size is : " + list.getSize());

// list.addLast("list");
// list.printList();
// System.out.println("Size is : " + list.getSize());

// list.deleteFirst();
// list.printList();
// System.out.println("Size is : " + list.getSize());

// list.deleteLast();
// list.printList();
// System.out.println("Size is : " + list.getSize());
// }
// }
/*---------------------------------------------------------------- */

// Till now what we did was creating a List from scratch, now let do this by
// using inbuilt class (i.e. by using Collection framework)

// // Below line imports LinkedList class in our project.
// import java.util.LinkedList;

// public class SinglyLinkedList {
// public static void main(String[] args) {
// // This is how we use the LinkedList Interface in our project. Now by doing
// this
// // we don't have to write any methods manually, we just need to use it.
// LinkedList<String> list = new LinkedList<>();

// // Add first
// list.addFirst("a");
// list.addFirst("is");
// list.addFirst("This");
// System.out.println(list);

// // Add last
// list.addLast("list");
// System.out.println(list);

// // If we write only 'add' then also by default it will add the elements to
// the
// // last.
// list.add("LinkedList");
// list.add("Singly");
// list.add("LinkedList");
// System.out.println(list);

// System.out.println(list.size());

// // Iterating the list.
// // If we want to iterate through List items then we need to use for loop and
// // 'get()' is a method which is used to get the elements from the list.
// for (int i = 0; i < list.size(); i++) {
// System.out.print(list.get(i) + " --> ");
// }

// System.out.println("Null");

// // Delete first
// list.removeFirst();
// System.out.println(list);

// // Delete last
// list.removeLast();
// System.out.println(list);

// // Delete from any index.
// list.remove(3);
// System.out.println(list);

// // We can also remove element from first just by doing;
// list.remove();
// System.out.println(list);
// }
// }
/*---------------------------------------------------------------- */

// Qs. Reverse a LinkedList (No extra memory to be used i.e. SC = O(1) and TC =
// O(n)).

// There are two ways to reverse a LinkedList, one is using 'Iteration' and
// another using 'Recursion'. We will see both of these ways.

// Iterative Approach :- Using Scratch code.

// public class SinglyLinkedList {
// Node head;
// private int size;

// SinglyLinkedList() {
// this.size = 0;
// }

// class Node {
// String data;
// Node next;

// Node(String data) {
// this.data = data;
// this.next = null;
// size++;
// }
// }

// public void addFirst(String data) {
// Node newNode = new Node(data);

// if (head == null) {
// head = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// public void addLast(String data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// return;
// }

// Node currNode = head;
// while (currNode.next != null) {
// currNode = currNode.next;
// }

// currNode.next = newNode;
// }

// public void printList() {
// if (head == null) {
// System.out.println("List is empty");
// return;
// }

// Node currNode = head;
// while (currNode != null) {
// System.out.print(" " + currNode.data + " " + "-->" + " ");
// currNode = currNode.next;
// }

// System.out.println("Null");
// }

// public void deleteFirst() {
// if (head == null) {
// System.out.println("This list is empty");
// return;
// }
// size--;
// head = head.next;
// }

// public void deleteLast() {
// if (head == null) {
// System.out.println("This list is empty");
// return;
// }
// size--;

// if (head.next == null) {
// head = null;
// return;
// }

// Node secondLast = head;
// Node lastNode = head.next;
// while (lastNode.next != null) {
// lastNode = lastNode.next;
// secondLast = secondLast.next;
// }

// secondLast.next = null;
// }

// public int getSize() {
// return size;
// }

// // Method to reverse a LinkedList.
// public void reverseIterate() {
// // Base case
// if (head == null || head.next == null) {
// return;
// }

// Node prevNode = head;
// Node currNode = head.next;

// while (currNode != null) {
// Node nextNode = currNode.next;
// currNode.next = prevNode;

// // Update the values of nodes.
// prevNode = currNode;
// currNode = nextNode;
// }
// head.next = null;
// head = prevNode;
// }

// public static void main(String args[]) {
// SinglyLinkedList list = new SinglyLinkedList();
// list.addFirst("a");
// list.addFirst("is");
// list.addFirst("This");
// list.printList();

// list.addLast("list");
// list.printList();

// list.reverseIterate();
// list.printList();
// }
// }
/*---------------------------------------------------------------- */

// Alternatively using Recursive approach :-

// public class SinglyLinkedList {
// Node head;
// private int size;

// SinglyLinkedList() {
// this.size = 0;
// }

// class Node {
// String data;
// Node next;

// Node(String data) {
// this.data = data;
// this.next = null;
// size++;
// }
// }

// public void addFirst(String data) {
// Node newNode = new Node(data);

// if (head == null) {
// head = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// public void addLast(String data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// return;
// }

// Node currNode = head;
// while (currNode.next != null) {
// currNode = currNode.next;
// }

// currNode.next = newNode;
// }

// public void printList() {
// if (head == null) {
// System.out.println("List is empty");
// return;
// }

// Node currNode = head;
// while (currNode != null) {
// System.out.print(" " + currNode.data + " " + "-->" + " ");
// currNode = currNode.next;
// }

// System.out.println("Null");
// }

// public void deleteFirst() {
// if (head == null) {
// System.out.println("This list is empty");
// return;
// }
// size--;
// head = head.next;
// }

// public void deleteLast() {
// if (head == null) {
// System.out.println("This list is empty");
// return;
// }
// size--;

// if (head.next == null) {
// head = null;
// return;
// }

// Node secondLast = head;
// Node lastNode = head.next;
// while (lastNode.next != null) {
// lastNode = lastNode.next;
// secondLast = secondLast.next;
// }

// secondLast.next = null;
// }

// public int getSize() {
// return size;
// }

// // Method to reverse a LinkedList.
// public Node reverseRecursive(Node head) {
// // Base case
// if (head == null || head.next == null) {
// return head;
// }

// Node newHead = reverseRecursive(head.next);
// head.next.next = head;
// head.next = null;

// return newHead;
// }

// public static void main(String args[]) {
// SinglyLinkedList list = new SinglyLinkedList();
// list.addFirst("a");
// list.addFirst("is");
// list.addFirst("This");
// list.printList();

// list.addLast("list");
// list.printList();

// list.head = list.reverseRecursive(list.head);
// list.printList();
// }
// }
/*---------------------------------------------------------------- */

// Most Important LinkedList Questions :-

// Qs. Remove nth Node from end of list. (Leet Code Q.19, Level = Medium).

// The driver code is already given on Leet Code, here we will just perform the
// solution of the question.

// class Solution {
// public ListNode removeNthFromEnd(ListNode head, int n) {
// if (head.next == null) {
// return null;
// }

// int size = 0;
// ListNode curr = head;
// while (curr != null) {
// curr = curr.next;
// size++;
// }

// if (n == size) {
// return head.next;
// }

// int indexToSearch = size - n;
// ListNode prev = head;
// int i = 1;
// while (i < indexToSearch) {
// prev = prev.next;
// i++;
// }

// prev.next = prev.next.next;
// return head;
// }
// }
/*---------------------------------------------------------------- */

// Qs. Palindrome Linked List. (Leet Code Q.234, Level = Easy).

// The driver code is already given on Leet Code, I'll write the logic here.
// There are various ways to do this question like we can convert this
// LinkedList to an Array or String or an ArrayList and the we can compare the
// elements as we did in Arrays or Strings but these approach will consume
// extra memory as we need to create a new Array or String or ArrayList.

// Here, I'll follow an approach which will not consume any extra memory. My
// approach is 1st find the middle of the LL and then reverse either 1st half or
// 2nd half of the LL and then compare the 1st half with 2nd half, if 1st half
// is equal to 2nd half then it's palindrome.

// class Solution {
// public ListNode reverse(ListNode head) {
// ListNode prev = null;
// ListNode curr = head;

// while (curr != null) {
// // Updating the variables
// ListNode next = curr.next;
// curr.next = prev;
// prev = curr;
// curr = next;
// }

// return prev;
// }

// public ListNode findMiddle(ListNode head) {
// ListNode fast = head;
// ListNode slow = head;

// while (fast.next != null && fast.next.next != null) {
// fast = fast.next.next;
// slow = slow.next;
// }

// return slow;
// }

// public boolean isPalindrome(ListNode head) {
// if (head == null || head.next == null) {
// return true;
// }

// ListNode middle = findMiddle(head); // This method will give 1st half's end
// ListNode secondHalfStart = reverse(middle.next);

// ListNode firstHalfStart = head;
// while (secondHalfStart != null) {
// if (firstHalfStart.val != secondHalfStart.val) {
// return false;
// }

// firstHalfStart = firstHalfStart.next;
// secondHalfStart = secondHalfStart.next;
// }

// return true;
// }
// }
/*---------------------------------------------------------------- */

// Some programmers make a LinkedList into a loop due to which it is not able to
// reach up to the last node i.e. not able to point to a null value which is an
// issue so, we should treat it like a thread (virus) and we should fix it. We
// will see the same concept question below and we'll see how to resolve this
// thread (virus). This resolving techniques is also known as Floyd's algorithm
// or Hare-Turtle method i.e. using two pointers one is fast and another is
// slow.

// Qs. Linked List Cycle. (Leet Code Q.141, Level = Easy).

// public class Solution {
// public boolean hasCycle(ListNode head) {
// if (head == null) {
// return false;
// }

// ListNode fast = head;
// ListNode slow = head;

// while (fast != null && fast.next != null) {
// fast = fast.next.next;
// slow = slow.next;

// if (fast == slow) {
// return true;
// }
// }

// return false;
// }
// }
/*---------------------------------------------------------------- */
