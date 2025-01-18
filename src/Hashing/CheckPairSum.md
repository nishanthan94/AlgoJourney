# Target Pair Sum
- Difficulty: Easy
- Topic: Arrays/HashSet
- Pattern: Two Sum

## Problem Statement
Given an array B of integers and a target sum A, determine if there exists a pair of distinct elements (i,j) where Bi + Bj = A and i ≠ j.

## Constraints
- 1 ≤ Length of array B ≤ 10⁵
- 0 ≤ Bi ≤ 10⁹
- 0 ≤ A ≤ 10⁹

## Examples
Example 1:
```
Input: 
A = 8
B = [3, 5, 1, 2, 1, 2]
Output: 1
Explanation: B[0] + B[1] = 3 + 5 = 8
```

Example 2:
```
Input:
A = 21
B = [9, 10, 7, 10, 9, 1, 5, 1, 5]
Output: 0
Explanation: No pair sums to 21
```