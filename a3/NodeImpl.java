
package a3;

public class NodeImpl implements Node {

    private Node left;
    private Node right;
    private int value;

    public NodeImpl(Node lc, Node rc, int val) {
        this.left = lc;
        this.right = rc;
        this.value = val;
    }

    public NodeImpl(int val) {
        this.left = null;
        this.right = null;
        this.value = val;
    }
    
    @Override
    public Node getLeft() {
        return this.left;
    }

    @Override
    public Node getRight() {
        return this.right;
    }

    @Override
    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }
}
