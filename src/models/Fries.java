package models;

public class Fries implements Item {
    private boolean isCurly;
    
    public Fries(boolean isCurly) {
        this.isCurly = isCurly;
    }
    
    @Override
    public String name() {
        return isCurly ? "Curly Fries" : "Straight Fries";
    }
    
    @Override
    public Packing packing() {
        return new PaperContainer();
    }
    
    @Override
    public float price() {
        return 3.49f;
    }
}