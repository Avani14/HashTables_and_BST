package BinarySearchTree;

public class BinarySearchTreeDriver {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        bst.display();
    }
}
