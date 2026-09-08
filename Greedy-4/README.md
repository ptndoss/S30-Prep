# Greedy-4

## Problem1: Minimum Path Form String formation

From a given string, we can form a subsequence of that string by removing some characters (only if required).

Given two strings source and target, return the minimum number of subsequences of source such that their concatenation equals target. If impossible, return -1.

Example 1:

Input: source = "abc", target = "abcbc"

Output: 2

Explanation: The target "abcbc" can be formed by "abc" and "bc", which are subsequences of source "abc".

Example 2:

Input: source = "abc", target = "acdbc"

Output: -1

Explanation: The target string cannot be constructed from the subsequences of source string due to the character "d" in target string.

Example 3:

Input: source = "xyz", target = "xzyxz"

Output: 3

Explanation: The target string can be constructed as follows "xz" + "y" + "xz".

Notes:

Both the source and target strings consist of only lowercase English letters from "a"-"z".

The lengths of source and target string are between 1 and 1000.

## Problem2:  Equal Row From Minimum Domino Rotations 

Given a row of dominoes, A[i] and B[i] represent the top and bottom halves of the i-th domino.

We may rotate the i-th domino, so that A[i] and B[i] swap values.

Find the minimum number of rotations so that all the values in A are the same, or all the values in B are the same.

If it cannot be done, return -1.

Example 1:

Input: A = [2,1,2,4,2,2], B = [5,2,6,2,3,2]

Output: 2

Explanation: 

The first figure represents the dominoes as given by A and B: before we do any rotations.

If we rotate the second and fourth dominoes, we can make every value in the top row equal to 2, as indicated by the second figure.

Example 2:

Input: A = [3,5,1,2,3], B = [3,6,3,3,4]

Output: -1

Explanation: 

In this case, it is not possible to rotate the dominoes to make one row of values equal.

Note:

1 <= A[i], B[i] <= 6

2 <= A.length == B.length <= 20000

