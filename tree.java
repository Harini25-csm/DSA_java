// Java program to demonstrate various operations on a binary tree
import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class tree {
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public int countNodes(Node root){
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public int height(Node root){
        if(root==null) return -1;
        return 1+Math.max(height(root.left), height(root.right));
    }
    // count the no.of leaf node
    public int countleaf(Node root){
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        return countleaf(root.left)+countleaf(root.right);
    }
    //count internal nodes in a binary tree
    public int countInternal(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+countInternal(root.left)+countInternal(root.right);
    }
    //find max, min ele in a binary tree
    public int maxmin(Node root, boolean finMax){
        if(root==null) return finMax?Integer.MIN_VALUE:Integer.MAX_VALUE;
        int left=maxmin(root.left, finMax);
        int right=maxmin(root.right, finMax);
        if(finMax){
            return Math.max(root.data, Math.max(left, right));
        }else{
            return Math.min(root.data, Math.min(left, right));
        }
    }
    //check if two trees are identical
    public boolean isIdentical(Node root1, Node root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        return root1.data==root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }
    //count nodes that hace exactly 1 child
    public int countSingleChild(Node root){
        if(root==null) return 0;
        int count=0;
        if((root.left==null && root.right!=null) || (root.left!=null && root.right==null)){
            count=1;
        }
        return count+countSingleChild(root.left)+countSingleChild(root.right);
    }
    //check whether a tree has exactly 1 child
    public boolean hasExactlyOneChild(Node root){
        if(root==null) return false;
        if((root.left==null && root.right!=null) || (root.left!=null && root.right==null)){
            return true;
        }
        return hasExactlyOneChild(root.left) || hasExactlyOneChild(root.right);
    }
    //Replace each node with some of it's right, left subtree
    public int replaceWithSum(Node root){
        if(root==null) return 0;
        int leftSum=replaceWithSum(root.left);
        int rightSum=replaceWithSum(root.right);
        int oldValue=root.data;
        root.data=leftSum+rightSum;
        return oldValue+root.data;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter root value (-1 for null): ");
        // int val = sc.nextInt();
        // if (val == -1) {
        //     System.out.println("Tree is empty.");
        //     return;
        // }
        // Node root = new Node(val);
        // Queue<Node> q = new LinkedList<>();
        // q.add(root);
        // while (!q.isEmpty()) {
        //     Node current = q.poll();
        //     System.out.println("Enter left child of " + current.data + " (-1 for null): ");
        //     int leftVal = sc.nextInt();
        //     if (leftVal != -1) {
        //         current.left = new Node(leftVal);
        //         q.add(current.left);
        //     }
        //     System.out.println("Enter right child of " + current.data + " (-1 for null): ");
        //     int rightVal = sc.nextInt();
        //     if (rightVal != -1) {
        //         current.right = new Node(rightVal);
        //         q.add(current.right);
        //     }
        // }
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println("\nInorder traversal:");
        inorder(root);
        System.out.println("\nPreorder traversal:");
        preorder(root);
        System.out.println("\nPostorder traversal:");
        postorder(root);
        System.out.println("\nNumber of nodes: "+new tree().countNodes(root)); 
        System.out.println("Height of tree: " + new tree().height(root));
        System.out.println("Number of leaf nodes: " + new tree().countleaf(root));
        System.out.println("Number of internal nodes: " + new tree().countInternal(root));
        System.out.println("Maximum element: " + new tree().maxmin(root, true));
        System.out.println("Minimum element: " + new tree().maxmin(root, false));
        Node root2=new Node(1);
        root2.left=new Node(2);
        root2.right=new Node(3);
        System.out.println("Are trees identical? " + new tree().isIdentical(root, root2));
        System.out.println("Number of nodes with exactly 1 child: " + new tree().countSingleChild(root));
        System.out.println("Does tree have exactly 1 child? " + new tree().hasExactlyOneChild(root));
        System.out.println("Replacing each node with sum of its left and right subtree:");
        new tree().replaceWithSum(root);
        inorder(root);
    }
}

