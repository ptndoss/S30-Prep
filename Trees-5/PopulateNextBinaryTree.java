// Time Complexity :O(n) n - Number of nodes in the Tree
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    
    public Node connect(Node root) {
        
        // Iterative Approach
        //Maintain two pointers LevelHead --> To move verticaly, Cursor --> To move horizontaly at each level
        if(root == null)
            return root;
        
        Node levelHead = root;
        
        while(levelHead.left != null){
            Node cursor = levelHead; // Cursor starts from level head and travers horizontally
            
            while(cursor != null){      //Travers horizontally from levelHead till the cursor.next is null.
                if(cursor.left!= null){
                    cursor.left.next = cursor.right;
                }
                if(cursor.next != null){
                    cursor.right.next = cursor.next.left;
                }
                cursor = cursor.next;
            }
            
            levelHead = levelHead.left;
        }
        
        return root;
        
        
        
    //****** Recursive
  /***      if(root == null)
            return root;
        
        if(root.left != null){         
            root.left.next = root.right;
              if(root.next != null )            // On the same level perform intermediate links
                root.right.next = root.next.left;
        }
        connect(root.left);
       
        connect(root.right);
        
        return root;***/
    }
}
