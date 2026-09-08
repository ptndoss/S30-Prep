// Time Complexity :O(n) n - Number of nodes in the Tree
// Space Complexity : O(1) Only recursive Stack space
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    TreeNode FirstNode;
    TreeNode SecondNode;
    TreeNode prevNode;
    public void recoverTree(TreeNode root) {
        
        if(root == null)
            return;
        
        //** Recursive Solution
        prevNode = new TreeNode(Integer.MIN_VALUE);
        FirstNode = null;
        SecondNode = null;
        
        inOrder(root);

//*********Iterative 
//         Stack<TreeNode> stack = new Stack<TreeNode>();
//         TreeNode prev = new TreeNode(Integer.MIN_VALUE);
//         TreeNode FirstNode = null;
//         TreeNode SecondNode = null;
//         TreeNode curr = root;
        
//         while(root!= null){
//             System.out.println(" "+ root.val); 
//             stack.push(root);
//             root = root.left;
//         }
        
//         while(!stack.isEmpty()){
//             curr = stack.pop();
//              // System.out.println(curr.val + " " + prev.val);  
//              if(FirstNode == null && prev.val > curr.val){
//                 FirstNode = prev;
//             }
//             if(FirstNode != null && prev.val > curr.val){
//                 SecondNode = curr;
//             }
//               prev = curr;
//             if(curr.right!= null){
//                 curr = curr.right;
//                 while(curr != null){
//                     stack.push(curr);
//                     curr = curr.left;
//                 }   
//             }  
//         }
        swap(FirstNode, SecondNode);
    }
    
    //Recursion
    private void inOrder(TreeNode root){
        if(root == null)
            return;
        inOrder(root.left);
         
        if(FirstNode == null && root.val < prevNode.val){
                FirstNode = prevNode;
            }
            if(FirstNode != null && root.val < prevNode.val){
                SecondNode = root;
            }
        prevNode = root;
        inOrder(root.right);   
    }
    
    private void swap(TreeNode prev, TreeNode curr){
        int temp = prev.val;
        prev.val = curr.val;
        curr.val = temp;
    }
}
