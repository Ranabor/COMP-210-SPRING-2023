package assn2;

public interface Node {
	double getValue();
	void setValue(double value);
	Node getNext();
	void setNext(Node next);
   boolean hasNext();
}
