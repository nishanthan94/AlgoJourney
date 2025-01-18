# Count Unique Elements
- Difficulty: Easy
- Topic: Arrays/HashSet
- Pattern: Unique Elements Count

## Problem Statement
Given an array A of N integers, find the number of unique/distinct elements in the array.

## Constraints
- 1 ≤ N ≤ 10⁵
- 1 ≤ A[i] ≤ 10⁹

## Examples
Example 1:
```
Input: A = [3, 4, 3, 6, 6]
Output: 3
Explanation: Distinct elements are 3, 4, and 6
```

Example 2:
```
Input: A = [3, 3, 3, 9, 0, 1, 0]
Output: 4
Explanation: Distinct elements are 3, 9, 0, and 1
```

## Approach
1. Use HashSet to store unique elements
2. Add all array elements to HashSet
3. Return size of HashSet (automatically handles duplicates)

## Complexity
- Time: O(n) where n is length of array A
- Space: O(n) for storing unique elements

## Learning
- HashSet for duplicate removal
- Converting array to collection
- Counting unique elements efficiently