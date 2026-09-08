# Trees-6

## Problem1: Sum between two ranges of BST(https://leetcode.com/problems/range-sum-of-bst)

Current Statement
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.

Example 1:

Input: root = [10,5,15,3,7,null,18], L = 7, R = 15

Output: 32

Example 2:

Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10

Output: 23

Note:

The number of nodes in the tree is at most 10000.

The final answer is guaranteed to be less than 2^31.

## Problem2: Serialize and Deserialize Binary Tree (https://leetcode.com/problems/serialize-and-deserialize-binary-tree)

Current Statement
Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.

Example: 

You may serialize the following tree:


    1

   / \

  2   3

     / \

    4   5


as "[1,2,3,null,null,4,5]"

Clarification: The above format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.

Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.


## Problem3: Invert a Binary Tree(https://leetcode.com/problems/invert-binary-tree/)

nvert a binary tree.

Example:

Input:

     5
   /   \
  2     7
   \   / \
    3 6   9
Output:

     5
   /   \
  7     2
 / \   /
9   6 3  
