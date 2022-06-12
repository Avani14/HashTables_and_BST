package BinarySearchTree;

public class BinarySearchTreeDriver {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        bst.insert(22);
        bst.insert(40);
        bst.insert(11);
        bst.insert(3);
        bst.insert(16);
        bst.insert(95);
        bst.insert(60);
        bst.insert(63);
        bst.insert(65);
        bst.insert(67);
        bst.display();
        System.out.println("Size of bst is: "+bst.size());
    }
}
