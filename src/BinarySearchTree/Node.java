package BinarySearchTree;

public class Node<E> {
    E key;
    Node<E> left, right;
    public Node(E key)
    {
        this.key = key;
        this.left = null;
        this.right = null;
    }
    @Override
    public String toString()
    {
        return "Key: "+key+" Left: "+left+" Right: "+right;
    }
}
