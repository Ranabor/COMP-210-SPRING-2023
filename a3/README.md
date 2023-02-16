# Assignment 3: Binary Search Trees
In this assignment, you will implement several methods for binary search trees containing integers. 

Your task is to implement the stubbed-out methods in BSTImpl.java based on the method descriptions in BST.java.  

Several methods are already implemented for you (e.g., "height()", "contains()").  You should use these methods already provided as examples to help you learn how to work with the BST and how to structure your solutions.

> **Hint:** Make sure you understand the methods for which you're provided implementations (e.g., "contains()"). You may find that the logic you need to write is similar.

All of your solutions for the assignment will go in BSTImpl.java, although you are encouraged to also modify Main.java and Tester.java to test your code as you go.  Tester.java contains examples of how you might exercise and test your code.

## Task: Implement the following methods in BSTImpl.java
You will write the implementations for the methods below in BSTImpl.java.  The descriptions for what the methods should do are located in BST.java.  You should not edit BST.java.

BST.java contains examples of how the operations below behave. Be sure you read and understand them before you attempt to code the methods.

> **Hint:** You may find it useful to draw a picture and simulate running your code step-by-step on the sample inputs in BST.java.  Be careful when manipulating pointers!

```
public int insert(int value);
public int findMin();
public int findMax();
public Node get(int val);
public boolean isFullBT();
public int merge(BST bst);
public int getMaxLeafHeightDiff();
```

You may use the methods in Print.java to print a tree when you're debugging your implementations of the methods above.  Tester.java contains examples of how to use the printer.  Also, note that the printer's output places the root at the left-hand side of the screen; you may find it easier to think of rotating the output 90 degrees clockwise.  For example, in the output below, the root node contains 31; its right child contains 32, left child contains 14, and so on. 

```
-------------------tree--
   32
31
            24
         23
      17
   14
      8
         2
            1
--------------------end--
```

> **Hint:** Be careful when manipulating pointers (i.e., the left and right children of a node).  If something in your code is breaking, try to find the smallest, simplest example that causes the code to break.  Also, make sure you understand how the printer works when you're debugging.
