package tree;

public class BalancedTree implements RotationTree{
    @Override
    public void insert() {
        System.out.println("Inserting a new item....");
    }

    @Override
    public void delete() {
        System.out.println("Removing a new item....");

    }

    @Override
    public void traverse() {
        System.out.println("In-Order traversal a new item....");

    }

    @Override
    public void leftRotation() {
        // there is no left rotation in BST
        System.out.println("left rotation a new item....");
    }

    @Override
    public void rightRotation() {
        // there is no left rotation in BST
        System.out.println("right rotation a new item....");
    }
}
