package assignment2;

public class Node {
    private int key;
    private String name;
    private Node left;
    private Node right;
  
    Node (int key, String name) {
        this.key = key;
        this.name = name;
        right = null;
        left = null;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
    
    public String getName() {
    	return name;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node right ) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }

}
