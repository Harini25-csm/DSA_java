// //Queue using array
// public class Queue1 {

//     static class Queue {
//         int arr[];
//         int size, front, rear;

//         Queue(int size) {
//             this.size = size;
//             arr = new int[size];
//             front = 0;
//             rear = -1;
//         }

//         // Check if empty
//         boolean isEmpty() {
//             return front > rear;
//         }

//         // Check if full
//         boolean isFull() {
//             return rear == size - 1;
//         }

//         // Add element
//         void add(int x) {
//             if (isFull()) {
//                 System.out.println("Queue is full");
//                 return;
//             }
//             arr[++rear] = x;
//         }

//         // Remove element
//         int dequeue() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[front++];
//         }

//         // Peek front
//         int peek() {
//             if (isEmpty()) return -1;
//             return arr[front];
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(5);

//         q.add(10);
//         q.add(20);
//         q.add(30);

//         System.out.println("Front: " + q.peek());
//         System.out.println("Removed: " + q.dequeue());
//         System.out.println("Front after dequeue: " + q.peek());
//     }
// }

/*****************************************************************/

// // Queue using stack
// import java.util.*;
// public class Queue1{
//     static class Queue{
//         Stack<Integer> s1=new Stack<>();
//         Stack<Integer> s2=new Stack<>();
        
//         void enqueue(int x){
//             s1.push(x);
//         }

//         int dequeue(){
//             if(s1.isEmpty() && s2.isEmpty()){
//                 return -1;
//             }
//             if(s2.isEmpty()){
//                 while(!s1.isEmpty()){
//                     s2.push(s1.pop());
//                 }
//             }
//             return s2.pop();
//         }
//         void display(){
//             for(int i=s2.size()-1;i>=0;i--){
//                 System.out.println(s2.get(i)+" ");
//             }
//             for(int i=s1.size()-1;i>=0;i--){
//                 System.out.println(s1.get(i)+" ");
//             }
//             System.out.println();
//         }
        
//     } 
//     public static void main(String[] args){
//         Queue q=new Queue();
//         q.enqueue(1);
//         q.enqueue(2);
//         q.enqueue(3);
//         System.out.println("Queue: ");
//         q.display();
//         q.dequeue();
//         System.out.println("Queue after deque");
//         q.display();
//     }
// }
/*******************************************************************/

// //Queue using LL
// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Queue1 {
//     Node front, rear;
//     // Enqueue
//     void enqueue(int x) {
//         Node newNode = new Node(x);

//         if (rear == null) {
//             front = rear = newNode;
//             return;
//         }
//         rear.next = newNode;
//         rear = newNode;
//     }
//     // Dequeue
//     int dequeue() {
//         if (front == null) {
//             System.out.println("Queue Underflow");
//             return -1;
//         }
//         int val = front.data;
//         front = front.next;
//         if (front == null) {
//             rear = null;
//         }
//         return val;
//     }
//     // Display queue
//     void display() {
//         Node temp = front;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Queue1 q = new Queue1();
//         q.enqueue(1);
//         q.enqueue(2);
//         q.enqueue(3);
//         System.out.print("Queue: ");
//         q.display();
//         q.dequeue();
//         System.out.print("Queue after dequeue: ");
//         q.display();
//     }
// }
/*******************************************************************/

// //reversing queue using stack
// import java.util.*;

// public class Queue1 {

//     // Function to reverse the queue
//     static void reverseQueue(Queue<Integer> q) {
//         Stack<Integer> stack = new Stack<>();

//         // Move all elements from queue to stack
//         while (!q.isEmpty()) {
//             stack.push(q.remove());
//         }

//         // Move back from stack to queue (reversed order)
//         while (!stack.isEmpty()) {
//             q.add(stack.pop());
//         }
//     }

//     public static void main(String[] args) {

//         Queue<Integer> q = new LinkedList<>();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         System.out.println("Original Queue: " + q);

//         reverseQueue(q);

//         System.out.println("Reversed Queue: " + q);
//     }
// }

/**************************************************************/

// //Circular Queue using stack
// import java.util.*;

// public class Queue1 {//CircularQueueUsingStack

//     static class Queue {
//         Stack<Integer> s1 = new Stack<>();
//         Stack<Integer> s2 = new Stack<>();
//         int capacity;

//         Queue(int capacity) {
//             this.capacity = capacity;
//         }

//         boolean isFull() {
//             return s1.size() + s2.size() == capacity;
//         }

//         boolean isEmpty() {
//             return s1.isEmpty() && s2.isEmpty();
//         }

//         // Enqueue
//         boolean enqueue(int x) {
//             if (isFull()) {
//                 System.out.println("Queue is Full");
//                 return false;
//             }
//             s1.push(x);
//             return true;
//         }

//         // Dequeue
//         int dequeue() {
//             if (isEmpty()) {
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }

//             if (s2.isEmpty()) {
//                 while (!s1.isEmpty()) {
//                     s2.push(s1.pop());
//                 }
//             }

//             return s2.pop();
//         }

//         void display() {
//             if (isEmpty()) {
//                 System.out.println("Queue Empty");
//                 return;
//             }

//             System.out.print("Queue elements: ");
            
//             // Print s2 in reverse order
//             for (int i = s2.size() - 1; i >= 0; i--) {
//                 System.out.print(s2.get(i) + " ");
//             }

//             // Print s1 normally
//             for (int i = 0; i < s1.size(); i++) {
//                 System.out.print(s1.get(i) + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(5);

//         q.enqueue(10);
//         q.enqueue(20);
//         q.enqueue(30);
//         q.display();

//         q.dequeue();
//         q.display();

//         q.enqueue(40);
//         q.enqueue(50);
//         q.enqueue(60);
//         q.display();
//     }
// }
