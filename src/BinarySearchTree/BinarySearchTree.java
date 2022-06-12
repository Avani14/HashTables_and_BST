package BinarySearchTree;

public class BinarySearchTree<E extends Comparable<E>> {
    Node<E> root;
    public BinarySearchTree()
    {
        root = null;
    }
    public BinarySearchTree(E key)
    {
        root = insertKey(root,key);
    }
    void insert(E key)
    {
        root = insertKey(root,key);
    }
    Node<E> insertKey(Node root,E key)
    {
        if(root == null)
        {
            root = new Node(key);
            return root;
        }
        if(key.compareTo((E)root.key) >0)
        {
            root.right = insertKey(root.right,key);
        } else if (key.compareTo((E)root.key)<0) {
            root.left = insertKey(root.left,key);
        }
        return root;
    }
    void display()
    {
        printData(root);
    }
    void printData(Node root)
    {
        if(root!=null)
        {
            printData(root.left);
            System.out.println(root.key);
            printData(root.right);
        }
    }
}
