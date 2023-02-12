package assn2;

public class ArrayList implements List {
   private double[] elts;
   private int size = 0;
   private int MAX = 1000;

   // default constructor makes an array with MAX elements
   public ArrayList ( ) {
      this.elts = new double[this.MAX];
      this.size = 0;
   }
   
   // alternate constructor allows specific array size to be created
   public ArrayList (int MAX) {
      this.elts = new double[MAX];
      this.size = 0;
      this.MAX = MAX;
   }

	
//================================================================= 
  // You will implement the 4 methods below for assignment 2.
  // IMPORTANT: Note that the methods are provided with default 
  // return values (e.g., "-1" for findLast) so that the code will
  // initially compile.  You should remove the default return value
  // when you implement the methods.
//=================================================================
    
   
  public boolean set ( int index, double element ) {
      //See List.java for a description of the method's behavior and examples.
      //Hint: Ask yourself how this is different from the "ins" method.
      //Hint: Remember that we start indexing with 0 rather than 1.
    
      if (index >= this.size) {
         return false;
      }

      this.elts[index] = element;
	  
    return true;  //Remove this when you implement the method!
  }
      
  public int findLast ( double element ) {
    //See List.java for a description of the method's behavior and examples.
    //Hint: Make sure you understand how this is different from find
    
    for(int i = this.size -1; i >= 0; i --){
      if (this.elts[i] == element){
         return i;
      }
    }


    return -1;  //Remove this when you implement the method!
  }

  public boolean inSort ( double elt ) {
    //See List.java for a description of the method's behavior and examples.
   if (this.size == 0){
      this.ins(0, elt);
      return true;
   }

   if (elt < this.elts[0]){
      this.ins(0, elt);
      return true;
   }

    for(int i = 1; i < this.size; i ++){
      if(i == (this.size - 1) && this.size < this.MAX){
         this.ins(i, elt);
         return true;
      }
      if(elt >= this.elts[i-1] && elt < this.elts[i]){
         this.ins(i, elt);
         return true;
      }
    }
	  
    return false;  //Remove this when you implement the method!
  }
   
  public boolean bubbleIns  ( double elt ) {

    //See List.java for a description of the method's behavior and examples.
    //Hint: Do any of the methods you're already given help? 

    if (this.size == 0){
      this.ins(0, elt);
   }

   for(int i = 0; i <= this.size; i ++){
      if(elt == this.elts[1]){
         this.rem(i);
         this.ins(0, elt);
         return true;
      }
      if(i == this.size){
         this.ins(0, elt);
         return true;
      }
    }
	  
    return false;  //Remove this when you implement the method!
  }
	
   /* Implementation given to you. Do not modify below this. */
   
   @Override
   public boolean ins(int index, double element) { 
      if (index<0 || index>size || index>=this.MAX || this.size==this.MAX) { return false; }
      for (int i=this.size-1; i>=index; i--) {
        this.elts[i+1] = this.elts[i];
      }
      this.elts[index] = element;
      this.size++;
      return true;
   }
   
   @Override
   public boolean rem(int index) { 
      if (index>=size || index<0 || index>=this.MAX ) { return false; }
      for (int i=index; i<size-1; i++) {
         this.elts[i] = this.elts[i+1];
      }
      this.size--;
      return true;
   }
   
	@Override
   public int size() { return this.size; }
   
   @Override
   public void clear() { this.size = 0; }
   
	@Override
   public boolean isEmpty() { return this.size == 0; }

	@Override
   public double get(int index) { 
      if (index<0 || index>=size || index>=this.MAX) { return Double.NaN; }
      return this.elts[index];
   }
	@Override
   public int find( double element ) { 
      int loc = -1;
      for (int i=0; i<size; i++) {
         if (this.elts[i]==element) { loc=i; break; }
      }
      return loc; 
   }
   
	@Override  
   public boolean contains ( double element ) {
      boolean res = false;
      for (int i=0; i<size; i++) {
         if (this.elts[i]==element) { res = true; break; }
      }
      return res;
   }

   /* prints out list */
   public String toString() { 
     if (this.size==0) { return "[empty]"; }
     String res = ""; 
     for (int i=0; i<size; i++) {
       res = res+this.elts[i]+", ";
     } 
     return res;
   }
     
}
