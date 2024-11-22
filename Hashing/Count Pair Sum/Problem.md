# Count Pairs with Target Sum
- Difficulty: Medium
- Topic: Arrays/HashMap
- Pattern: Two Sum Variant

## Problem Statement
Given an array A of N integers and target B, count pairs (i,j) where A[i] + A[j] = B and i ≠ j.
Note: Count each pair only once (i,j same as j,i).
Return answer modulo 10⁹+7.

## Constraints
- 1 ≤ N ≤ 10⁵
- 1 ≤ A[i] ≤ 10⁹
- 1 ≤ B ≤ 10⁹

## Examples
Example 1:
```
Input: 
A = [3, 5, 1, 2]
B = 8
Output: 1
Explanation: Pair (3,5) sums to 8
```

Example 2:
```
Input:
A = [1, 2, 1, 2]
B = 3
Output: 4
Explanation: Pairs (1,2), (2,1), (1,2), (2,1) sum to 3
```

## Approach
1. Use HashMap to store frequency of numbers
2. For each number x, check if (B-x) exists in map
3. Use modulo arithmetic for large numbers
4. Count each pair once by adding frequencies before updating map

## Complexity
- Time: O(n)
- Space: O(n)