// //stack code usings arrays
// public class Stack1 {
//     int[] stack;
//     int top;
//     int size;

//     // Constructor
//     public Stack1(int size) {
//         this.size = size;
//         stack = new int[size];
//         top = -1;  // stack is empty
//     }

//     // Push operation
//     public void push(int value) {
//         if (top == size - 1) {
//             System.out.println("Stack Overflow! Cannot push " + value);
//             return;
//         }
//         stack[++top] = value;
//         System.out.println(value + " pushed into stack");
//     }

//     // Pop operation
//     public int pop() {
//         if (top == -1) {
//             System.out.println("Stack Underflow! Stack is empty");
//             return -1;
//         }
//         return stack[top--];
//     }

//     // Peek operation
//     public int peek() {
//         if (top == -1) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         return stack[top];
//     }

//     // Check if stack is empty
//     public boolean isEmpty() {
//         return top == -1;
//     }

//     // Display stack
//     public void display() {
//         if (top == -1) {
//             System.out.println("Stack is empty");
//             return;
//         }
//         System.out.println("Stack elements:");
//         for (int i = top; i >= 0; i--) {
//             System.out.println(stack[i]);
//         }
//     }

//     // Main method for testing
//     public static void main(String[] args) {
//         Stack1 s = new Stack1(5);

//         s.push(10);
//         s.push(20);
//         s.push(30);

//         s.display();

//         System.out.println("Top element: " + s.peek());

//         System.out.println("Popped element: " + s.pop());

//         s.display();
//     }
// }


/***********************************************************************/

// // Reverse string using stack

// import java.util.Stack;

// class Stack1 {

//     public static String reverse(String s) {
//         Stack<Character> str = new Stack<>();

//         // Push characters into stack
//         for (char c : s.toCharArray()) {
//             str.push(c);
//         }

//         StringBuilder result = new StringBuilder();

//         // Pop characters to build reversed string
//         while (!str.isEmpty()) {
//             result.append(str.pop());
//         }

//         return result.toString();
//     }

//     // Main method
//     public static void main(String[] args) {
//         String input = "HELLO";

//         String reversed = reverse(input);

//         System.out.println("Original String: " + input);
//         System.out.println("Reversed String: " + reversed);
//     }
// }


/***********************************************************************/

// // giving input as open paranthesis and getting closed paranthesis as output
// import java.util.Stack;
// class Stack1 {

//     public static boolean isBalanced(String s) {
//         Stack<Character> stack = new Stack<>();

//         for (char c : s.toCharArray()) {

//             // Opening brackets
//             if (c == '(' || c == '{' || c == '[') {
//                 stack.push(c);
//             }
//             // Closing brackets
//             else if (c == ')' || c == '}' || c == ']') {

//                 if (stack.isEmpty()) return false;

//                 char top = stack.pop();

//                 if ((c == ')' && top != '(') ||
//                     (c == '}' && top != '{') ||
//                     (c == ']' && top != '[')) {
//                     return false;
//                 }
//             }
//         }

//         // If stack empty → balanced
//         return stack.isEmpty();
//     }

//     public static void main(String[] args) {
//         String input = "{[()]}";

//         if (isBalanced(input)) {
//             System.out.println("Balanced");
//         } else {
//             System.out.println("Not Balanced");
//         }
//     }
// }
/***********************************************************************/

// // Min num from Stack with O(1) TC
// import java.util.Stack;

// public class Stack1 {

//     Stack<Integer> stack = new Stack<>();     // main stack
//     Stack<Integer> minStack = new Stack<>();  // keeps minimums

//     // Push element
//     public void push(int x) {
//         stack.push(x);

//         // If minStack empty OR new element is smaller
//         if (minStack.isEmpty() || x <= minStack.peek()) {
//             minStack.push(x);
//         }
//     }

//     // Pop element
//     public int pop() {
//         if (stack.isEmpty()) {
//             System.out.println("Stack Underflow");
//             return -1;
//         }

//         int removed = stack.pop();

//         // If removed element was minimum, remove from minStack too
//         if (removed == minStack.peek()) {
//             minStack.pop();
//         }

//         return removed;
//     }

//     // Get top element
//     public int top() {
//         if (stack.isEmpty()) return -1;
//         return stack.peek();
//     }

//     // ⭐ Get minimum in O(1)
//     public int getMin() {
//         if (minStack.isEmpty()) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         return minStack.peek();   // <-- No popping needed
//     }

//     public static void main(String[] args) {
//         Stack1 st = new Stack1();

//         st.push(10);
//         st.push(20);
//         st.push(30);
//         st.push(5);

//         System.out.println("Minimum: " + st.getMin());  // 5

//         st.pop();  // removes 5
//         System.out.println("Minimum after pop: " + st.getMin());  // 10
//     }
// }



