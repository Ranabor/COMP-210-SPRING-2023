
package a3;

public interface BST {
//================================================================
//
// Binary Search Tree interface
//
//
// This interface is divided into top and bottom sections.
// In the top section are the signatures for the ops we
// have given you implementations for.
//
// In the bottom section are the signatures for the methods
// that you will write code for.  Clear English behavior is
// described for each so you will write code that makes
// the method perform the indicated behavior.
//
//=================================================================

   //=======================================================================
   // Methods we give you code to implement (in BSTImpl.java)
   //=======================================================================

   public Node getRoot();
     /* Returns the root of the tree
      * @return the root of the tree
     */
     
   public int size();
     /* Returns the number of elements in the tree.
      * @return the number of elements in the tree
      */

   public int height();
     /* Returns the longest path from the root value to a leaf in the tree
      * @return the longest path from the root to a leaf.
      */

   public boolean contains(int val);
     /* Returns true if the bst contains the given string
      * and false otherwise. This method should call upon a
      * private recursive contains_r() method
      *
      * @return true if the string is in the tree, false if not
      */
      
   public void remove(int val);
     /* Removes the node containing the value from the tree if it is present.
      * This method should call upon the recursive remove()
      *
      * @param value to be removed from tree
      */


   //=======================================================================
   // Methods you will write code for
   //=======================================================================
   
   public int insert(int value);
     /* Creates a node with the parameter as its value
      * and inserts the node into the tree in the appropriate position.
      * This method should call upon the recursive insert_r() helper method
      * you write.
      *
      * we will make the assumption for this assignment (and implement it so) 
      * that the values in a BST are unique... no duplicates
      *
      * If we insert a value and it succeeded... adds it to the tree
      * return the element that was added
      *
      * If we try to add an element and it is a duplicate, return the element
      * but make no changes to the tree... no new nodes added
      *
      * @param int value to be inserted in tree
      * @return integer that was insrted after insertion is done.
      *
      * Example 1: Suppose we have the tree below:
      *
      *               (27)
      *              /    \
      *            (4)    (29)
      *            /  \
      *          (1)  (8)
      * After calling insert(5), we'd obtain the following tree:
      *
      *               (27)
      *              /    \
      *             (4)   (29)
      *            /   \
      *          (1)   (8)
      *               /
      *              (5)
      *
      * Example 2: Suppose we have the tree below:
      *
      *              (87)
      *             /    \
      *           (42)   (128)
      *              \      \
      *             (46)    (145)
      *             /
      *           (44)
      *
      * After calling insert(147), we'd obtain the following tree:
      *
      *              (87)
      *             /    \
      *           (42)   (128)
      *               \      \
      *              (46)   (145)
      *             /           \
      *           (44)         (147)
      *
      **/
      
   public int findMin();
     /* Returns the smallest element in the tree.
      * This method should call upon the recursive findMin_r() you write.
      *
      * @return the smallest element in the tree (an int value)
      *
      * Example: findMin() will return 7 for the tree below.
      *
      *               (13)
      *               /  \
      *             (9) (24)
      *             /      \
      *            (7)     (28)
      *               \      \
      *               (8)    (29)
      *                        \
      *                        (31)
      */

   public int findMax();
     /* Returns the largest element in the tree.
      * This method should call upon the recursive findMax_r() you write.
      *
      * @return the largest element in the tree (an int value)
      * Example: findMax() will return 29 for the tree below
      *
      *                 (28)
      *                 /  \
      *               (14) (29)
      *               /
      *              (1)
      */

   public Node get(int val);
     /* Return the node that contains the given int as its value
      * this means get returns the address of an Node object in the heap.
      *
      * If the int value is in the tree return the Node.
      * If the int value is not in the tree, return null.
      * This method should call on the recursive helper get_r you write.
      *
      * @param val - the desired string
      * @return Node containing the int (or null)
      *
      * Example: get(2) returns the node containing "2" below.
      * Do not return the value 2!  Return the node.
      *
      *         (5)
      *        /   \
      *       (2)  (21)
      *      /
      *     (1)
      */

   public boolean isFullBT();
     /* Returns true if the tree is a full binary tree. A full binary
      * tree is defined as a binary tree where each node either has 
      * 2 children or 0 children.
      * This method should call upon the recursive helper isFullTree_r() which you write.
      * @return true if the tree is full, false otherwise
      *
      * Example: The tree below is full.
      *            (5)
      *           /   \
      *         (2)   (7)
      *         / \
      *       (1)  (3)
      * Example: The tree below is NOT full.
      *           (8)
      *          /   \
      *         (3) (10)
      *        /
      *      (2)
      */
      
   public int merge(BST bst);
     /* Will add all the elements of the parameter tree "bst" into this, the 
      * current tree.  A pre-order traversal of the parameter tree "bst"
      * produces the elements in the order they should be inserted 
      * into this.
      *
      * The input "bst" is not changed at all.
      * 
      * If done right, any elements in the parameter tree "bst" that duplicate
      * ones already in "this" are not added to "this."
      * 
      * This method can be implemented how you wish to, but a smart way
      * is to modify a recursive pre-order traversal code to perform insert on
      * the values it encounters as it wanders around in the parameter tree "bst".
      *
      * The int returned should be the count of how many new nodes were added
      * to "this" tree.  This means 
      *   this.size() after the merge should be 
      *   this.size() before the merge + the int returned
      *
      * For example, if we have the current tree ("this") with size() 12, 
      * and we ask the current tree ("this") to merge in a bst with size 8, 
      * and also if the tree to be merged in has 3 of its elements being 
      * duplicates already in the current tree, then the merge op will return 5 
      * (since 5 of the elements are ok to insert into "this") and the current 
      * tree will have size() of 17 when the merge is finished.
      *@return the number of new nodes added to "this" tree
      *
      * Example:  Suppose we have the two trees below.
      *
      *         Tree A                  Tree B
      *           (31)                   (2)
      *          /    \                 /   \
      *        (14)   (32)            (1)   (23)
      *       /    \                          \
      *     (8)    (17)                       (24)
      *
      * Merging B into A (i.e., calling A.merge(B)) yields the following tree:
      *
      *                  Tree A (after merge)
      *                        (31)
      *                     /       \
      *                   (14)      (32)
      *                   /  \        
      *                 (8)  (17)     
      *                 /      \
      *               (2)      (23)
      *               /          \
      *             (1)          (24)  
      *
      * Note that we'd return 4 in this example, because 4 nodes were added to Tree A.
      * Tree B must be unchanged by the merge operation.
      */

   public int getMaxLeafHeightDiff();
      /* Return the difference between the height of the tree (i.e., the length of the
       * longest path from the root to a leaf in the tree) and the height of its most
       * shallow leaf (i.e., the length of the shortest path from the root to a leaf in the tree).
       *
       * If the tree is empty, return 0.
       *
       * Example 1: Suppose we have the tree below:
       *
       *              (17)
       *             /    \
       *           (8)    (37)
       *           /      /  \
       *         (2)    (21) (39)
       *            \
       *            (6)
       *
       * The leaves are (6), (21), and (39) with heights 3, 2, and 2 respectively.  So getMaxLeafHeightDiff() is 1.
       *
       * Example 2: Suppose we have the tree below:
       *
       *             (43)
       *            /
       *          (9)
       *          /
       *        (2)
       *
       * There is only a single leaf with height 2.  So getMaxLeafHeightDiff() is 0.
       */
}
