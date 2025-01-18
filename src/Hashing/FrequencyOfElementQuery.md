# Frequency Count in Contests
- Difficulty: Easy
- Topic: Arrays/HashMap
- Pattern: Frequency Count

## Problem Statement
Given two arrays:
- Array `A`: Represents participants in contests (each integer is a learner ID)
- Array `B`: Contains learner IDs to check for participation frequency

Task: Find the frequency of each learner from array B in array A and return these frequencies in order.

## Constraints
- 1 ≤ |A| ≤ 10⁵
- 1 ≤ |B| ≤ 10⁵
- 1 ≤ A[i] ≤ 10⁵
- 1 ≤ B[i] ≤ 10⁵

## Examples
Example 1:
```
Input:
A = [1, 2, 1, 1]
B = [1, 2]
Output: [3, 1]
Explanation: 
- Learner 1 appears 3 times
- Learner 2 appears 1 time
```

Example 2:
```
Input:
A = [2, 5, 9, 2, 8]
B = [3, 2]
Output: [0, 2]
Explanation:
- Learner 3 appears 0 times
- Learner 2 appears 2 times
```

## Approach
1. Create a HashMap to store frequency count of array A
2. Iterate through array A to populate the HashMap
3. For each element in array B, lookup its frequency in the HashMap
4. Return the frequencies in order

## Complexity
- Time: O(n + m) where n = length of A, m = length of B
- Space: O(n) for storing the HashMap

## Learning
- HashMap usage for frequency counting
- Array traversal
- Handling queries efficiently