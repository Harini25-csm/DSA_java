/*
 * Stack :- It is one of the most important data structure and here we will see
 * how to implement Stack from scratch as well as how to use it through
 * collection framework.
 * 
 * In Stack we are majorly going to focus on three operations i.e. push(), pop()
 * and peek().
 * 
 * There are so many Arrays and LinkedList problems which can be solved very
 * easily using Stack and it also important from interview point of view and
 * also in recursion, implicit Stack is being implement in the memory.
 * 
 * Stack is a kind of structure where we place things one over another. This is
 * also known as LIFO -> "Last In First Out" data structure.
 * 
 * The first operation which we perform in Stack in push() which means to adds
 * the data at the top of the Stack and TC for this is O(1) and top of the Stack
 * is also known as the end of the Stack.
 * 
 * The second operation which we can do on Stack is pop() which means to remove
 * the data from the top of the Stack and TC for this is also O(1).
 * 
 * The third operation which we can do is peek() which means to find the value
 * of
 * the top element of the Stack and the TC for this is also O(1).
 * 
 * All the three operations mentioned above have minimal TC but there are other
 * operations which may take more time.
 * 
 * Now, there are three ways by which we can implement Stack.
 * 1. Array :- If we implement Stack using Array then the size of our Stack will
 * also be fixed as the size of the Array is fixed. So, we either have to stop
 * the user from providing the input when the Stack is full or we have to make a
 * new Array which larger size and copy the values of old Array into new one
 * which is now recommended. So, we don't follow this approach practically.
 * 
 * 2. ArrayList :- We practically can implement ArrayList as we have variable
 * size so, there is no limitation unlike Array.
 * 
 * 3. LinkedList :- We can implement LinkedList to implement Stack as it has
 * variable size. Here, we first create 1st element and it becomes our Head, and
 * when we put 2nd element then this element becomes out Head and so on. So,
 * this becomes a Stack, but how? As we know from LinkedList that we can only
 * track the Head of the LinkedList so all the operations are possible on the
 * Head of LinkedList with TC = O(1) as mentioned by Stack.
 */

// 1. Implementing the Stack using LinkedList.

// public class StackClass {
// static class Node {
// // Node class will represent every node of the LinkedList.

// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// next = null;
// }
// }

// static class Stack {
// public static Node head;

// public static boolean isEmpty() {
// return head == null;
// }

// public static void push(int data) {
// Node newNode = new Node(data);
// if (isEmpty()) {
// head = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// public static int pop() {
// if (isEmpty()) {
// return -1;
// }

// int top = head.data;
// head = head.next;
// return top;
// }

// public static int peek() {
// if (isEmpty()) {
// return -1;
// }

// return head.data;
// }
// }

// public static void main(String args[]) {
// Stack s = new Stack();
// s.push(1);
// s.push(2);
// s.push(3);
// s.push(4);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
// }
// }
/*---------------------------------------------------------------- */

// 2. Implementing the Stack using ArrayList.

// import java.util.ArrayList;

// public class StackClass {
// static class Stack {
// static ArrayList<Integer> list = new ArrayList<>();

// public static boolean isEmpty() {
// return list.size() == 0;
// }

// public static void push(int data) {
// list.add(data);
// }

// public static int pop() {
// if (isEmpty()) {
// return -1;
// }

// int top = list.get(list.size() - 1);
// list.remove(list.size() - 1);
// return top;
// }

// public static int peek() {
// if (isEmpty()) {
// return -1;
// }

// return list.get(list.size() - 1);
// }
// }

// public static void main(String args[]) {
// Stack s = new Stack();
// s.push(1);
// s.push(2);
// s.push(3);
// s.push(4);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
// }
// }
/*---------------------------------------------------------------- */

// 3. Implementing Stack using Java Collection Framework.

// import java.util.Stack;

// public class StackClass {
// public static void main(String args[]) {
// Stack<Integer> s = new Stack<>();
// s.push(1);
// s.push(2);
// s.push(3);
// s.push(4);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
// }
// }
/*---------------------------------------------------------------- */

// Qs. Push at the Bottom of Stack :-

/*
 * Stacks are of two types namely Implicit and Explicit Stack.
 * Implicit Stack is the one which code makes by itself and Explicit Stack is
 * the one which we are making in this class while studying.
 * To solve this problem we will take help of
 * recursion as recursion has it own implicit Stack.
 */

// In implicit Stack we can do operations while going up as well as while coming
// down too. While going up we will remove the elements and while coming down we
// will push the element into the Stack.

// import java.util.Stack;

// public class StackClass {
// public static void pushAtBottom(int data, Stack<Integer> s) {
// if (s.isEmpty()) {
// s.push(data);
// return;
// }

// int top = s.pop();
// pushAtBottom(data, s);
// s.push(top);
// }

// public static void main(String args[]) {
// Stack<Integer> s = new Stack<>();
// s.push(1);
// s.push(2);
// s.push(3);

// pushAtBottom(4, s);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }

// }
// }
/*---------------------------------------------------------------- */

// Qs. Reverse a Stack.

// import java.util.Stack;

// public class StackClass {
// public static void pushAtBottom(int data, Stack<Integer> s) {
// if (s.isEmpty()) {
// s.push(data);
// return;
// }

// int top = s.pop();
// pushAtBottom(data, s);
// s.push(top);
// }

// public static void reverse(Stack<Integer> s) {
// if (s.isEmpty()) {
// return;
// }

// int top = s.pop();
// reverse(s);
// pushAtBottom(top, s);
// }

// public static void main(String args[]) {
// Stack<Integer> s = new Stack<>();
// s.push(1);
// s.push(2);
// s.push(3);

// reverse(s);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }

// }
// }
/*---------------------------------------------------------------- */