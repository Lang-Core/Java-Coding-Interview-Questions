# DSA

## Big O Notation

Big O notation is a mathematical concept used to describe the performance of algorithms in computer science. It is a way to measure how much time an algorithm takes to solve a problem, as the input size of the problem grows.

In Big O notation, the time complexity of an algorithm is expressed in terms of its worst-case scenario. It provides a way to compare the efficiency of different algorithms in terms of the number of operations required to solve a problem.

For example, an algorithm with a time complexity of O(n) means that the number of operations it performs increases linearly with the input size. An algorithm with a time complexity of O(n^2) means that the number of operations it performs increases quadratically with the input size.

By analyzing the time complexity of an algorithm using Big O notation, developers can make informed decisions about which algorithm to use for a given problem to optimize performance.

### Examples

1. O(1) - Constant Time Complexity:
   
    This means that the algorithm takes a constant amount of time, regardless of the input size. An example of an O(1) algorithm is accessing a specific element in an array.
    ```
       int[] numbers = {1, 2, 3, 4, 5};
       int element = numbers[2]; // O(1)
    ```

2. O(n) - Linear Time Complexity:

   This means that the algorithm takes time proportional to the input size. An example of an O(n) algorithm is iterating over an array and printing its elements.
    ```
       int[] numbers = {1, 2, 3, 4, 5};
       for (int i = 0; i < numbers.length; i++) { // O(n)
           System.out.println(numbers[i]);
       }
    ```

3. O(n^2) - Quadratic Time Complexity:

   This means that the algorithm takes time proportional to the square of the input size. An example of an O(n^2) algorithm is the nested loop used for sorting algorithms such as Bubble Sort.
   ```
      int[] numbers = {5, 2, 8, 1, 4};
      for (int i = 0; i < numbers.length - 1; i++) { // O(n^2)
          for (int j = 0; j < numbers.length - i - 1; j++) {
              if (numbers[j] > numbers[j + 1]) {
                 int temp = numbers[j];
                 numbers[j] = numbers[j + 1];
                 numbers[j + 1] = temp;
              }
          }
      }
    ```

<hr>

## Java Coding Interview Questions

1. Reverse a string
2. Checking anagram
3. Determine two string characters are unique
4. Find duplicate character in a string
5. Permutations of string
6. Find vowels in the string
7. Find smallest and largest element in array
8. Separate ood and even numbers from an array
9. Permutations of Array