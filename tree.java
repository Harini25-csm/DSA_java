// // Java program to demonstrate various operations on a binary tree
// import java.util.*;
// class Node {
//     int data;
//     Node left, right;
//     Node(int data) {
//         this.data = data;
//         left = right = null;
//     }
// }
// public class tree {
//     public static void inorder(Node root) {
//         if (root == null) return;
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }
//     public static void preorder(Node root) {
//         if (root == null) return;
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }
//     public static void postorder(Node root) {
//         if (root == null) return;
//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.data + " ");
//     }
//     public int countNodes(Node root){
//         if(root == null) return 0;
//         return 1 + countNodes(root.left) + countNodes(root.right);
//     }
//     public int height(Node root){
//         if(root==null) return -1;
//         return 1+Math.max(height(root.left), height(root.right));
//     }
//     // count the no.of leaf node
//     public int countleaf(Node root){
//         if(root==null) return 0;
//         if(root.left==null&&root.right==null) return 1;
//         return countleaf(root.left)+countleaf(root.right);
//     }
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter root value (-1 for null): ");
//         // int val = sc.nextInt();
//         // if (val == -1) {
//         //     System.out.println("Tree is empty.");
//         //     return;
//         // }
//         // Node root = new Node(val);
//         // Queue<Node> q = new LinkedList<>();
//         // q.add(root);
//         // while (!q.isEmpty()) {
//         //     Node current = q.poll();
//         //     System.out.println("Enter left child of " + current.data + " (-1 for null): ");
//         //     int leftVal = sc.nextInt();
//         //     if (leftVal != -1) {
//         //         current.left = new Node(leftVal);
//         //         q.add(current.left);
//         //     }
//         //     System.out.println("Enter right child of " + current.data + " (-1 for null): ");
//         //     int rightVal = sc.nextInt();
//         //     if (rightVal != -1) {
//         //         current.right = new Node(rightVal);
//         //         q.add(current.right);
//         //     }
//         // }
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);
//         System.out.println("\nInorder traversal:");
//         inorder(root);
//         System.out.println("\nPreorder traversal:");
//         preorder(root);
//         System.out.println("\nPostorder traversal:");
//         postorder(root);
//         System.out.println("\nNumber of nodes: "+new tree().countNodes(root)); 
//         System.out.println("Height of tree: " + new tree().height(root));
//         System.out.println("Number of leaf nodes: " + new tree().countleaf(root));
        
//     }
// }
/****************************************************************/
