public class BST {
    protected BSTNode root;

    public BST() {
        root = null;
    }

    protected void visit(BSTNode p) {
        System.out.print(p.key + " ");
    }

    public BSTNode search(Software el) {
        return search(root, el);
    }

    protected BSTNode search(BSTNode p, Software el) {
        while (p != null)
            if (el == p.key)
                return p;
            else if (el < p.key) {
                p = p.left;
            } else {
                p = p.right;
            }
        return null;
    }
    
    public void insert(Software el) {
        BSTNode p = root, prev = null;
        while (p != null) { // find a place for inserting new node;
            prev = p;
            if (p.key.getSoftName().compareToIgnoreCase(el.getSoftName()) < 0)
                p = p.right;
            else
                p = p.left;
        }
        if (root == null) // tree is empty;
            root = new BSTNode(el);
        else if (prev.key.getSoftName().compareToIgnoreCase(el.getSoftName()) < 0)
            prev.right = new BSTNode(el);
        else
            prev.left = new BSTNode(el);
    }
}
