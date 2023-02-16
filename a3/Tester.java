package a3;

public class Tester {

  public void merge (BST ot) {
    BST nt = new BSTImpl();
    int[] v1 = new int[]{55,25,105,45,1135,15};
    for (int v:v1) { ot.insert(v); }
    int[] v2 = new int[]{5,3,8,2,6,1,9,4};
    for (int v:v2) { nt.insert(v); }
    Print.tree(ot);
    Print.tree(nt);
    System.out.println("added: " + ot.merge(nt)); 
    Print.tree(ot);
    
    nt = new BSTImpl();
    Print.tree(nt);
    v1 = new int[]{ 107,27,1137,77,457,7};
    for (int v:v1) { nt.insert(v); }
    Print.tree(nt);
    System.out.println("added: " + ot.merge(nt));
    Print.tree(ot);
    
    v1 = new int[]{ 1137,7,55,105,1138,5,25,9}; // 8 elements, 7 dupes, 1 new one
    for (int v:v1) { nt.insert(v); }
    System.out.println("added: " + ot.merge(nt));
    Print.tree(ot);
    
  }
  
  public void emptyTree(BST bst) {
    System.out.println("\n== testing emptyTree =================");
    
    System.out.print( (bst.size()==0) );
    System.out.println( "   size: "+bst.size() );

    System.out.print( (bst.height()==-1) );
    System.out.println( "   height: "+bst.height() );
  }

  public void insert(BST bst) {
    System.out.println("\n== testing insert ====================");
     
    int[] insertions = new int[]{17,8,34,3,77,19,5,11};
    for (int dval:insertions) { bst.insert(dval); }

    Print.tree(bst);
    System.out.print( (bst.size()==8) );
    System.out.println( "   size: "+bst.size() );
    System.out.print( (bst.height()==3) );
    System.out.println( "   height: "+bst.height() );
      
    System.out.println(bst.contains(3));
    System.out.println(bst.contains(44));
      
    System.out.println(bst.contains(11));
    bst.remove(34);
    Print.tree(bst);
    System.out.println(bst.height());
    System.out.println(bst.size());
    System.out.println(bst.contains(34));
    
    bst = new BSTImpl();
    Print.tree(bst);
    System.out.print( (bst.size()==0) );
    System.out.println( "   size: "+bst.size() );
    System.out.print( (bst.height()==-1) );
    System.out.println( "   height: "+bst.height() );
    System.out.println(bst.contains(34));
    bst.insert(34);
    Print.tree(bst);
    System.out.print( (bst.size()==1) );
    System.out.println( "   size: "+bst.size() );
    System.out.print( (bst.height()==1) );
    System.out.println( "   height: "+bst.height() );
    System.out.println(bst.contains(34));
 


    
  }
  
  public void remove(BST bst) {
    System.out.println("\n== testing remove ====================");
     
    Print.tree(bst);
    System.out.println(bst.height());
    System.out.println(bst.size());
      
    System.out.println(bst.contains(3));
    System.out.println(bst.contains(44));
      
    System.out.println(bst.contains(11));
    bst.remove(34);
    Print.tree(bst);
    System.out.println(bst.height());
    System.out.println(bst.size());
    System.out.println(bst.contains(34));
  }

}
