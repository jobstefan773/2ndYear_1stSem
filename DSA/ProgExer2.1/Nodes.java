public class Nodes {
    protected char object;
    protected Nodes left, right;
    public Nodes(char x){
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
