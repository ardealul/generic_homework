package sci.homework.algorith.tree;

public class TreeNode<T> {

    public T data;
    public BinaryTree<T> leftTree, rightTree;

    public TreeNode(T data, BinaryTree<T> left, BinaryTree<T> right) {
        this.data = data;
        this.leftTree = left;
        this.rightTree = right;
    }

    public TreeNode(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}