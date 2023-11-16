class BST {
    BSTNode root;

    public BST() {
        this.root = null;
    }

    public void insert(Software item) {
        root = insertRecursive(root, item);
    }

    private BSTNode insertRecursive(BSTNode root, Software item) {
        if (root == null) {
            return new BSTNode(item);
        }

        int compareResult = item.softName.compareTo(root.item.softName);

        if (compareResult < 0) {
            root.left = insertRecursive(root.left, item);
        } else if (compareResult > 0) {
            root.right = insertRecursive(root.right, item);
        }

        return root;
    }

    // You can add additional methods for tree traversal, searching, etc.

    public void inOrderTraversal(BSTNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            displayProduct(root.item);
            inOrderTraversal(root.right);
        }
    }

    private void displayProduct(Software item) {
        System.out.println("Name: " + item.softName +
                ", Version: " + item.version +
                ", Quantity: " + item.quantity +
                ", Price: ₱" + item.price);
    }
}