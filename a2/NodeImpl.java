
package assn2;

public class NodeImpl implements Node {
   private double _value;
	private Node _next;
	
	public NodeImpl(double val, Node nxt) {
		_value = val;
		_next = nxt;
	}
	
   // we provide this Node interface implementation... dont change it
   public boolean hasNext() { return(this._next!=null); } 

	@Override
	public double getValue() { return this._value;	}

	@Override
	public void setValue(double value) { this._value = value;}

	@Override
	public Node getNext() { return this._next; }

	@Override
	public void setNext(Node next) { this._next = next; }
}
