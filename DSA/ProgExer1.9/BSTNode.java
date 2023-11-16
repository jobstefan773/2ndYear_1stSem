public class BSTNode {
    protected Software item;
    protected BSTNode left, right;

    public BSTNode() {
        left = right = null;
    }

    public BSTNode(Software item) {
        this.item = item;
        this.left = this.right = null;
    }

}
