# Assignment 2: Implementing Lists with Arrays and Linked Cells

In this assignment, you will learn more about interfaces (using the List interface, and the Node interface), and you will learn more about implementing to an interface by adding to the ArrayList implementation of List, and the LinkedList implementation of List.

The code we give you here implements many of the List interface operations, and they are implemented in the two ways we studied in class: as an array, and as linked cells.  In order to practice and learn those implemention approaches better, we are asking to to implent the last 4 operations from the List interface on your 
own.  The code we have given will serve as a model... as example and guide as you write the code for the last 4 operations (8 total methods... 4 operations in
each of 2 implementation classes)

So look first at List.java; see that it provides an interface that specifies the operations our list data structure will support.  The array-based implementation of the list interface is in ArrayList.java, and the linked list implementation in in LinkedList.java.  The Node.java and NodeImpl.java is how we represent a Node within the linked list, so LinkedList.java references the Node Interface and the NodeImpl class that implements the structure and behavior of a Node in a linked list.

> **Hint:** Make sure you understand the structure of LinkedList.java and ArrayList.java before you begin implementing methods for the assignment. 

## Task: Implement the methods below in ArrayList.java and LinkedList.java
```
public boolean set ( int index, double element );
public int findLast ( double element );
public boolean inSort ( double element );
public boolean bubbleIns ( double element );
```
Your task for assignment 2 is to write the code for the 4 methods above in ArrayList.java and LinkedList.java, for a total of 8 methods.  The description of the behavior of each method is provided in List.java.  

Note that several of the methods(e.g., "ins", "rem", "find") are already implemented for you; you only need to write the code for the methods above in ArrayList.java and LinkedList.java. Although the method signatures are the same in both ArrayList.java and LinkedList.java, you will see that the underlying implementations vary greatly.

> **Hint:** You can use the methods already provided in ArrayList.java and LinkedList.java to help you test your code.  Also, they can help you build intuition as to what your array and linked list operations will look like.

## Assignment2 class, main method, and Tester class

You are encouraged to test your code as you go from main.  In all the assignments, it is YOUR responsibility to convince yourself that your code is operating properly. Indeed this well be your job as well when you are a practicing software professional.  When we give you sample tests (as we do here) you can be sure they do not comprise and complete and thorough test suite.  They will be simply samples the help you get going and get a general idea that you are on the right path.  But you will need to add tests on your own to convince yourself you have covered all the possible inputs and behaviors in your implementation code.

In this assignment, you are free to configure main how you see fit for testing; the autograder will not execute your main, and will evaluate your code by directly calling methods in ArrayList.java and LinkedList.java.  Assignment2.java contains a sample main for this assignment, and is provided to you with some sample code for what your testing might resemble.  A testing file "Tester.java" is also optionally provided to help you test.

Using this approach... a Tester class that is instantiated to a testing object in main... is one way to organize your tests so that the main method does not become simple a giant scrolling list of printlns.  The methods in Tester are there to group tests (in this case) into one that apply to a specific operation from List that is under test.  You can consider adding more methods to Tester ... then it risks becoming a giant scrolling list of printlns which we were trying to avoice.  You can also create more Tester classes... Tester1, 2, 3, etc... whatever.  In each different Tester class would go methods to perform tests that have common purposes...
perhaps tests that check sequences of ops instead of single ops... or tests that build a List to an extreme (Max, or delete to 0) and then try to keep going.  
You can build test methods for whatever you want to investigate and group them into Test classes and create objects of those classes in the main method and run them.

Doing this testing organization also lets you easily comment out test invocations in main as you are happy with the results, yet leave the code there for later if you should need it.  Keeps down the amount of output you have to examine to test new items.

> **Hint:** Make sure you understand the examples in List.java for each of the 4 methods you'll be implementing.

## Note on Testing and the Autograder

As noted, you have a duty as a programmer to convince yourself your code is correct.  We expect you to take time designing and executing a serious suite of test cases in order to do this.  It is one way we hope you learn (early) how to reason about your work... to think over how it might be used, how it might be called, what results are to be expected, and to see if indeed all that is what actually happens.

You can write code and just keep submitting it to the autograder until it "goes green" or green enough that you are happy.  This is not a professional way to do your work.  It is possible, but it will not teach you as much about coding as thinking deeply about your code and testing thoroughly on your own.

So test, test, test, then check the work with the autograder... more thinking, less submitting.  The autograder cannot think for you.  You are here to learn to think.
