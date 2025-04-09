package models;

public abstract class ColdDrink implements Item {
    protected boolean isCold = true;
    
    public void setTemperature(boolean isCold) {
        this.isCold = isCold;
    }
    
    @Override
    public Packing packing() {
        return new Bottle();
    }
}