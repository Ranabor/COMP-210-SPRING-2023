package a3;

public class Print {

   public static void tree(BST tr) { 
      System.out.println();
      System.out.println("-------------------tree--");
      if (tr.getRoot()==null) { System.out.println(" [ empty tree ]"); } 
      else { tree_r(tr.getRoot(),0); }
      System.out.println("--------------------end--"+"\n");
   }
   private static void tree_r(Node n,int k) {
      if (n==null) return;
      tree_r(n.getRight(),k+3);
      for (int i=0; i<k; i++) { System.out.print(" "); }
      System.out.println(n.getValue());
      tree_r(n.getLeft(),k+3);
   }

}
