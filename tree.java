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

// public class Tree {

//     // Inorder Traversal
//     public static void inorder(Node root) {
//         if (root == null) return;
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     // Preorder Traversal
//     public static void preorder(Node root) {
//         if (root == null) return;
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     // Postorder Traversal
//     public static void postorder(Node root) {
//         if (root == null) return;
//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.data + " ");
//     }

//     // Count total nodes
//     public int countNodes(Node root) {
//         if (root == null) return 0;
//         return 1 + countNodes(root.left) + countNodes(root.right);
//     }

//     // Height of tree (in edges)
//     public int height(Node root) {
//         if (root == null) return -1;
//         return 1 + Math.max(height(root.left), height(root.right));
//     }

//     // Depth of a node
//     public int depth(Node root, int key) {
//         return depthUtil(root, key, 0);
//     }

//     private int depthUtil(Node root, int key, int depth) {
//         if (root == null) return -1;
//         if (root.data == key) return depth;

//         int leftDepth = depthUtil(root.left, key, depth + 1);
//         if (leftDepth != -1) return leftDepth;

//         return depthUtil(root.right, key, depth + 1);
//     }

//     // Count leaf nodes
//     public int countLeaf(Node root) {
//         if (root == null) return 0;
//         if (root.left == null && root.right == null) return 1;
//         return countLeaf(root.left) + countLeaf(root.right);
//     }

//     // Count internal nodes
//     public int countInternal(Node root) {
//         if (root == null) return 0;
//         if (root.left == null && root.right == null) return 0;
//         return 1 + countInternal(root.left) + countInternal(root.right);
//     }

//     // Find max or min element
//     public int maxmin(Node root, boolean findMax) {
//         if (root == null)
//             return findMax ? Integer.MIN_VALUE : Integer.MAX_VALUE;

//         int left = maxmin(root.left, findMax);
//         int right = maxmin(root.right, findMax);

//         return findMax
//                 ? Math.max(root.data, Math.max(left, right))
//                 : Math.min(root.data, Math.min(left, right));
//     }

//     // Check if two trees are identical
//     public boolean isIdentical(Node root1, Node root2) {
//         if (root1 == null && root2 == null) return true;
//         if (root1 == null || root2 == null) return false;

//         return root1.data == root2.data &&
//                isIdentical(root1.left, root2.left) &&
//                isIdentical(root1.right, root2.right);
//     }

//     // Count nodes with exactly one child
//     public int countSingleChild(Node root) {
//         if (root == null) return 0;

//         int count = ((root.left == null && root.right != null) ||
//                      (root.left != null && root.right == null)) ? 1 : 0;

//         return count + countSingleChild(root.left) + countSingleChild(root.right);
//     }

//     // Check if any node has exactly one child
//     public boolean hasExactlyOneChild(Node root) {
//         if (root == null) return false;

//         if ((root.left == null && root.right != null) ||
//             (root.left != null && root.right == null)) return true;

//         return hasExactlyOneChild(root.left) || hasExactlyOneChild(root.right);
//     }

//     // Replace each node with sum of its left and right subtree
//     public int replaceWithSum(Node root) {
//         if (root == null) return 0;

//         int leftSum = replaceWithSum(root.left);
//         int rightSum = replaceWithSum(root.right);

//         int oldValue = root.data;
//         root.data = leftSum + rightSum;

//         return oldValue + root.data;
//     }

//     public static void main(String[] args) {

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);

//         Tree t = new Tree();

//         System.out.println("Inorder traversal:");
//         inorder(root);

//         System.out.println("\nPreorder traversal:");
//         preorder(root);

//         System.out.println("\nPostorder traversal:");
//         postorder(root);

//         System.out.println("\nNumber of nodes: " + t.countNodes(root));
//         System.out.println("Height of tree: " + t.height(root));
//         System.out.println("Depth of node with value 5: " + t.depth(root, 5));
//         System.out.println("Number of leaf nodes: " + t.countLeaf(root));
//         System.out.println("Number of internal nodes: " + t.countInternal(root));
//         System.out.println("Maximum element: " + t.maxmin(root, true));
//         System.out.println("Minimum element: " + t.maxmin(root, false));

//         Node root2 = new Node(1);
//         root2.left = new Node(2);
//         root2.right = new Node(3);

//         System.out.println("Are trees identical? " + t.isIdentical(root, root2));
//         System.out.println("Number of nodes with exactly 1 child: " + t.countSingleChild(root));
//         System.out.println("Does tree have exactly 1 child? " + t.hasExactlyOneChild(root));

//         System.out.println("After replacing each node with sum of its subtrees:");
//         t.replaceWithSum(root);
//         inorder(root);
//     }
// }
/***************************************************************************/
// //Tree is balanced or not
// import java.util.*;

// class TreeNode {
//     int val;
//     TreeNode left, right;

//     TreeNode(int val) {
//         this.val = val;
//         this.left = null;
//         this.right = null;
//     }
// }
// public class Tree {
//     public static int height(TreeNode root) {
//         if (root == null) return 0;
//         int left = height(root.left);
//         if (left == -1) return -1;
//         int right = height(root.right);
//         if (right == -1) return -1;
//         if (Math.abs(left - right) > 1) return -1;
//         return 1 + Math.max(left, right);
//     }
//     public static boolean isBalanced(TreeNode root) {
//         return height(root) != -1;
//     }
//     public static void main(String[] args) {
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
//         root.left.right = new TreeNode(5);
//         System.out.println("Is tree balanced? " + isBalanced(root));
//     }
// }
/***************************************************************************/
// // find lowest comman ansistor of a node in binary tree
// import java.util.*;
// class Node{
//     int val;
//     Node left,right;
//     Node(int val){
//         this.val=val;
//         this.left=null;
//         this.right=null;
//     }
//     public static Node lca(Node root,Node p,Node q){
//         if(root==null) return null;
//         if(root.val==p.val || root.val==q.val) return root;
//         Node leftAns=lca(root.left,p,q);
//         Node rightAns=lca(root.right,p,q);
//         if(leftAns!=null && rightAns!=null) return root; //One of the nodes (p or q) was found in the left, right subtree
//     return (leftAns!=null)?leftAns:rightAns;
//     }
//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);
//         Node p=root.left; // node with value 2
//         Node q=root.right; // node with value 3
//         Node lcaNode=lca(root,p,q);
//         if(lcaNode!=null){
//             System.out.println("LCA of "+p.val+" and "+q.val+" is: "+lcaNode.val);
//         }else{
//             System.out.println("LCA does not exist.");
//         }
//     }
// }
/***************************************************************************/
// // find the path which summ of the values of the node is equal to the K value
// import java.util.*;
// class Node{
//     int val;
//     Node left,right;
//     Node(int val){
//         this.val=val;
//         this.left=null;
//         this.right=null;
//     }
//     public boolean hasPathSum(Node root, int targetSum) {
//         if(root==null) return false;
//         if(root.left==null && root.right==null && targetSum==root.val) return true;
//         return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
//     }
//     public static void main(String[] args) {
//         Node root=new Node(5);
//         root.left=new Node(4);
//         root.right=new Node(8);
//         root.left.left=new Node(11);
//         root.left.left.left=new Node(7);
//         root.left.left.right=new Node(2);
//         root.right.left=new Node(13);
//         root.right.right=new Node(4);
//         root.right.right.right=new Node(1);
//         int targetSum=22;
//         boolean result=root.hasPathSum(root,targetSum);
//         System.out.println("Is there a path with sum "+targetSum+"? "+result);
//     }
// }
/***************************************************************************/
// //print right side nodes of a binary tree
// import java.util.*;
// class Node{
//     int val;
//     Node left,right;
//     Node(int val){
//         this.val=val;
//         this.left=null;
//         this.right=null;
//     }
//     public static void printRightele(Node root) {
//         if(root.right==null) return;
//         System.out.println(root.right.val);
//         printRightele(root.right);
//         printRightele(root.left);  
//     }
    
//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);
//         System.out.println("Right side nodes of the binary tree:");
//         printRightele(root);
//     }
// }
/***************************************************************************/