public class BSTNodes {
    protected char object;
    protected BSTNodes left, right;
    public BSTNodes(char x){
        this.object = x;
        left = right = null;
    }

    public char getObject() {
        return object;
    }

    public void setObject(char object) {
        this.object = object;
    }

}
