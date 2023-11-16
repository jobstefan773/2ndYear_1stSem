public class Subject {
    private int credUnits;
    private String subjCode;
    
    public Subject(int credUnits, String subjCode) {
        this.credUnits = credUnits;
        this.subjCode = subjCode;
    }
    
    public int getCredUnits() {
        return this.credUnits;
    }
    public String getSubjCode() {
        return this.subjCode;
    }
}
