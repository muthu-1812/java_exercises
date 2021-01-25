/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package training;
import java.util.*;
/**
 *
 * @author mbashish
 */
class BinarySearchTree { 
  
    /* Class containing left  
       and right child of current node 
     * and key value*/
    class Node  
    { 
        int key; 
        Node left, right; 
  
        public Node(int item) 
        { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    BinarySearchTree()  
    {  
         root = null;  
    } 
  
    // This method mainly calls insertRec() 
    void insert(int key)  
    {  
         root = insertRec(root, key);  
    } 
  
    /* A recursive function to  
       insert a new key in BST */
    Node insertRec(Node root, int key) 
    { 
  
        /* If the tree is empty, 
           return a new node */
        if (root == null)  
        { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key);
        else 
            System.out.println("Duplicate Value "+key);
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    void inorder()  
    {  
        System.out.println("Inorder Traversal Of Binary Search Tree"); 
        inorderRec(root);  
    } 
  
    // A utility function to  
    // do inorder traversal of BST 
    void inorderRec(Node root) 
    { 
        Stack<Node> stack = new Stack<>();
        
        Node curr = root;
        while(curr!=null || !stack.isEmpty()) {
            while(curr!=null) {
                stack.push(curr);
                curr=curr.left;    
            }
            curr = stack.pop();
            System.out.print(curr.key+" ");
//            res.add(curr.val);
            curr = curr.right;
        }
//        if (root != null) { 
//            inorderRec(root.left); 
//            System.out.println(root.key); 
//            inorderRec(root.right); 
//        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        BinarySearchTree tree = new BinarySearchTree(); 
  
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter size");
            int n = sc.nextInt();
            if(n<=0) {
                System.out.println("Enter valid Integer Input");

            }
            sc.nextLine();
            System.out.println("Enter Input");
            for(int i=0;i<n;i++) {
                
                int num = sc.nextInt();
                
                tree.insert(num);
            }
             
         
        } catch(Exception e) {
            System.out.println( "Enter Valid Integer Input" );
        }
        catch(OutOfMemoryError err) {
            System.out.println("Out of memory error. Try with a smaller number");
        }
        // print inorder traversal of the BST 
        tree.inorder(); 
    } 
} 

